package rr.cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	String str;
	@When("^Enter Hello world$")
	public void action() throws Throwable{
		str="Hello world";
	}
	@Then("^string will be displayed in the console$")
	public void display() throws Throwable {
		System.out.println(str);
	}

}
