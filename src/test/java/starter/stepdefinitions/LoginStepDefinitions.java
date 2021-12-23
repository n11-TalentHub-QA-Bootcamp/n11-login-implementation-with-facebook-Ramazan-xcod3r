package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.*;
import starter.n11LoginWithFacebook.loginClass.LoginClass;
import starter.n11LoginWithFacebook.loginClass.succesiestLoginPageElement;
import starter.n11LoginWithFacebook.navigateTo.navigateTo;

public class LoginStepDefinitions {
    Actor actor = Actor.named("customer");
    @Managed
    static WebDriver driver;
    @Given("customer open the login page")

    public void openTheLoginPage() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(navigateTo.theN11HomePage());
    }

    @And("customer Click Login Facebook Button")
    public void ClickLoginFacebookBtn() {
        actor.attemptsTo(navigateTo.clickLoginBtn());
    }

    /*The opened Facebook Login Window is Captured Here. Regarding Detailed Description in Class*/
    @And("Handle Facebook Window")
    public void HandleFacebookWindow() {
      LoginClass.HandleFacebookWindow(driver);
    }

    /* Actor Checks if logged in
     * The actor does the validation.*/
    @Then("customer Validate successfully login to Facebook")
    public void ValidateSuccessfullyLoginToFacebook() {
        boolean that = succesiestLoginPageElement.IsLoginSuccessful(actor);
        actor.attemptsTo( succesiestLoginPageElement.IsSucces(that));
    }
}
