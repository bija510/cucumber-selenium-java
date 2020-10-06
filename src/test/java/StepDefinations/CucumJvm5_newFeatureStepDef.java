package StepDefinations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.runners.Parameterized.Parameters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.errorprone.annotations.Var;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CucumJvm5_newFeatureStepDef {
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	/**************************************
	 * Don't use this import for new feature
	 * import cucumber.api.java.en.And;
	 * otherWIse it will not find the step defination
     * import cucumber.api.java.en.Given;
	 **************************************/
	
	/*********************************************
	This is one way of data table transformation
	************************************************/
	@DataTableType(replaceWithEmptyString = "[blank]")
	public UserInfo convert(Map<String, String> entry) { 
		return new UserInfo(
			entry.get("username"),
			entry.get("password").concat("@#M-#@$=") //Fake Encrypted password
				);
	}
	
	@Given("I login as admin")
	public void i_login_as_admin(List<UserInfo> userInfoList) {
	  System.out.println("Username-" + userInfoList.get(0).username + "password-"+ userInfoList.get(0).password);
	    
	}
	/***********************************************************************************
	converting the parameter java, js, csharp into list of parameter so we can use it
	***********************************************************************************/
	@ParameterType("[^\"]*")
	public List<String> book(String bookName){
			return Arrays.asList(bookName.split(","));
		}

	@And("I have a few books in hand such as {book}")
	public void i_have_a_few_books_in_hand_such_as_java_js_csharp(List<String> books) {
	   System.out.println("=====>" + books.get(2));
		
	}
	@DocStringType
	public JsonNode json(String docString) throws JsonMappingException, JsonProcessingException {
		return objectMapper.readTree(docString);
	}
	
	@Given("some more information")
	public void some_more_information(JsonNode jsonNode) {
		   JsonNode name =jsonNode.get("Name");
		   JsonNode address =jsonNode.get("Address");
		   
		   System.out.println("=====>"+name +" "+ address);
	}
	

	private class UserInfo{
		public String username;
		public String password;
		
		public UserInfo(String username, String password) {
			this.username = username;
			this.password = password;
		}
	}
}
