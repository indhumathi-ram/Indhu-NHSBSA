package stepdefinition;

import org.junit.Assert;

import com.pages.Homepage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepagestepsTest {
	private static String title;
	//private static String message;
	private Homepage Homepage = new Homepage(DriverFactory.getDriver());
	
	@Given("user is in landing page")
	public void user_is_in_landing_page() {
		DriverFactory.getDriver()
		.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}


	@When("user gets title")
	public void user_gets_title() {
		title = Homepage.gethomePageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}
		
	
	@And("user click on start button")
	public void user_click_on_start_button() {
		Homepage.clickOnstartnowbutton();
	}

	

	@And("user selects country as wales")
	public void user_selects_country_as_wales() {
		Homepage.countryselectionwales();
		Homepage.nextbutton();

	}
	
	@Then("user is displayed with error message")
	public void user_is_displayed_with_error_message(){
		
		Homepage.errormessage();
		
		
	}
	
	@And("user selects country as northern ireland")
	public void user_selects_country_as_northern_ireland() {
		Homepage.countryselectionnorthernireland();
		Homepage.nextbutton();
	}
	
	@And("user enters date")
	public void user_enters_date() {
	    Homepage.Dateofbirth29();
	    Homepage.nextbutton();
	}
	    
	    
	
	@And("user selects marital question")
	public void user_selects_marital_question() {
	    Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}

	@And("user selects benefit or tax credit")
	public void user_selects_benefit_or_tax_credit() {
	    Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@Then("user selects benefit or tax credit as yes")
	public void user_selects_benefit_or_tax_credit_as_yes() {
		Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}
	
	@And("user selects pregnant question")
	public void user_selects_pregnant_question() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@And("user selects injury or armed forces question")
	public void user_selects_injury_or_armed_forces_question() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@And("user selects diabetes")
	public void user_selects_diabetes() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@And("user selects glaucoma")
	public void user_selects_glaucoma() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@And("user selects care home")
	public void user_selects_care_home() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@And("user selects savings or investment question")
	public void user_selects_savings_or_investment_question() {
		Homepage.radionoquestions();
	    Homepage.nextbutton();
	}

	@Then("user is displayed with NHS cost details")
	public void user_is_displayed_with_nhs_cost_details() {
	    Homepage.Nhscostdetailsfor29year();
	}

	@Then("user selects his education")
	public void user_selects_his_education() {
		Homepage.radionoquestions();
		Homepage.nextbutton();
	}

	@Then("user selects Do you or your partner get paid Universal Credit")
	public void user_selects_do_you_or_your_partner_get_paid_universal_credit() {
		Homepage.taxcreditselection();
		Homepage.nextbutton();
	}

	@Then("user selects As part of your joint Universal Credit, do you have any of these?")
	public void user_selects_as_part_of_your_joint_universal_credit_do_you_have_any_of_these() {
		Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}

	@Then("user selects Did you and your partner have a combined take-home pay of £{int} or less in your last Universal Credit period?")
	public void user_selects_did_you_and_your_partner_have_a_combined_take_home_pay_of_£_or_less_in_your_last_universal_credit_period(Integer int1) {
		Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}

	@Then("user selects Do you or your partner live permanently in a care home")
	public void user_selects_do_you_or_your_partner_live_permanently_in_a_care_home() {
		Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}

	@Then("user selects Do you get help to pay for your care home from your local council?")
	public void user_selects_do_you_get_help_to_pay_for_your_care_home_from_your_local_council() {
		Homepage.radioyesquestions();
	    Homepage.nextbutton();
	}
	@Then("user is displayed with NHS cost details for students")
	public void user_is_displayed_with_nhs_cost_details_for_students() {
	   Homepage.Nhscostdetailsforstudent();
	}

	@Then("user is displayed with NHS cost details for senior citizens")
	public void user_is_displayed_with_nhs_cost_details_for_senior_citizens() {
	   Homepage.Nhscostdetailsforseniorcitizen();
	}

	@Then("user is displayed with NHS cost details for who live in home care")
	public void user_is_displayed_with_nhs_cost_details_for_who_live_in_home_care() {
	  Homepage.Nhscostdetailshomecare();
	}
	
	
	@Then("user enters date age twenty nine")
	public void user_enters_date_age_twenty_nine() {
	    Homepage.Dateofbirth29();
	    Homepage.nextbutton();
	}

	@Then("student enters date")
	public void student_enters_date() {
	    Homepage.Dateofbirthstudent();
	    Homepage.nextbutton();
	}

	@Then("senior citizen enters date")
	public void senior_citizen_enters_date() {
	   Homepage.Dateofbirthseniorcitizen();
	   Homepage.nextbutton();
	}

	@Then("middleage enters date")
	public void middleage_enters_date() {
	    Homepage.Dateofbirthsmiddleage();
	    Homepage.nextbutton();
	}

}
