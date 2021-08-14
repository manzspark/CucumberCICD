package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("Hi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Hi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Hi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Hi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("I validate the outcomes finally")
	public void i_validate_the_outcomes_finally() {
		System.out.println("Hi");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
