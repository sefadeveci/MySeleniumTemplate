package stepDefinition;

import PageObject.MainPOM;
import Util.HelperClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Util.HelperClass.driver;

public class MainSteps {
    MainPOM mainPOM=new MainPOM(driver);
    @Given("go google")
    public void goGoogle() {
        HelperClass.openPage();
    }

    @When("the user selects search area")
    public void theUserSelectsSearchArea() {
        mainPOM.clickSearch();
    }

    @And("user sends search key")
    public void userSendsSearchKey() {
        mainPOM.enterSearchKey();
    }

    @Then("search results displays")
    public void searchResultsDisplays() {
        mainPOM.clickSearchButton();
    }


}
