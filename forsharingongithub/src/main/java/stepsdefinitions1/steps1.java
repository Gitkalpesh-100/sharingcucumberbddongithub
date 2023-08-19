package stepsdefinitions1;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps1 {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
       
		System.out.println();
	}

	@And("^some other precondition \"([^\"]*)\"$")
	public void some_other_precondition(String argument1) {

		String s = argument1;
		System.out.println(s);
	}

	@When("^I complete action \"([^\"]*)\"$")
	public void I_complete_action(String argument1) {

		System.out.println("When with pattern"+ argument1);
		 
		System.out.println("When keyword");
	}

	@And("^some other action \"([^\"]*)\"$")
	public void some_other_action() {

	}

	@And("^check more outcomes $")
	public void check_more_outcomes(DataTable table) {

	}

	@Then("^I validate the outcomes \"([^\"]*)\"$")
	public void I_validate_the_outcomes(String s) {
       System.out.println("Then");
       System.out.println("Status = "+s);
	}

	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void I_want_to_write_a_step_with_name() {

	}

	@When("^I check for the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_check_for_the_name_and_value(String argument1, String argument2) {

		String s = argument1;
		System.out.println(s);

	}

}
//Hands-on - how to convert data table to list in cucumber.