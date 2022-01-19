package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutDeleteSteps{
	@Given("User creates a PUT request for LMS API endpoint")
	public void user_creates_a_put_request_for_lms_api_endpoint() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1: Creates PUT Request for LMS API endpoint");
	}

	@When("User sends request for program description as number or Alphanumeric")
	public void user_sends_request_for_program_description_as_number_or_alphanumeric() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for program description as number or Alphanumeric");
	}

	@Then("User receives {int} status code - sees the updated record.")
	public void user_receives_status_code_sees_the_updated_record(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives 200 status code - sees the updated record");
		}
	   {System.out.println();}
	   {System.out.println();}
	   {System.out.println();}

	@When("User sends request for program name as special characters.")
	public void user_sends_request_for_program_name_as_special_characters() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for program name as special characters");
	}
	
	@When("User sends request with online field as numbers")
	public void user_sends_request_with_online_field_as_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request with online field as numbers");
	}

	@Then("User receive {int} status code - online field is displayed true by default.")
	public void user_receive_status_code_online_field_is_displayed_true_by_default(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receive 200 status code - online field is displayed true by default.");
	}
	
	@When("User sends request with program name is Decimal")
	public void user_sends_request_with_program_name_is_decimal() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request with program name is Decimal.");
	}

	@Then("User receives status code {int} - user sees the updated record.")
	public void user_receives_status_code_user_sees_the_updated_record(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives status code 200 - user sees the updated record.");
	}
	
	@Given("User creates DELETE request for LMS API endpoint")
	public void user_creates_delete_request_for_lms_api_endpoint() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1: Creates DELETE request for LMS API endpoint");
	}

	@When("User sends request for existing Program ID")
	public void user_sends_request_for_existing_program_id() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for existing Program ID");
	}

	@Then("User receives Status code {int} OK - blank Response body")
	public void user_receives_status_code_ok_blank_response_body(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives Status code 200 OK - blank Response body");
	}
	
	@Given("User creates GET request for LMS  API endpoint")
	public void user_creates_get_request_for_lms_api_endpoint() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1: Creates GET request for LMS  API endpoint");
	}

	@When("User sends request for deleted Program ID")
	public void user_sends_request_for_deleted_program_id() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for deleted Program ID");
	}

	@Then("User receives Status code {int} OK - null in the Response body")
	public void user_receives_status_code_ok_null_in_the_response_body(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives Status code 200 OK - null in the Response body");
	}
	@When("User sends request for non-existing Program ID")
	public void user_sends_request_for_non_existing_program_id() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for non-existing Program ID");
	}

	@Then("User receives Status {int} - Internal Server Error")
	public void user_receives_status_internal_server_error(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives Status 500 - Internal Server Error");
	}
	
	@When("User sends request for blank Program ID")
	public void user_sends_request_for_blank_program_id() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Sends request for blank Program ID");
	}

	@Then("User receives Status {int} - Method Not Allowed")
	public void user_receives_status_method_not_allowed(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: Receives Status 405 - Method Not Allowed");
	}
	

    @When("User sends request for alphanumeric Program ID")
    public void user_sends_request_for_alphanumeric_program_id() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 2: Sends request for alphanumeric Program ID");
}

    @Then("User receives Status {int} - Bad Request")
    public void user_receives_status_bad_request(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 3: Receives Status 400 - Bad Request");
}
      
}
