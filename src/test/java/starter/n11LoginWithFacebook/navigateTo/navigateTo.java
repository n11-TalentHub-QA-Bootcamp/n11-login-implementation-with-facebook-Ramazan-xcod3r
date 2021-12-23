package starter.n11LoginWithFacebook.navigateTo;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11LoginWithFacebook.loginClass.n11LoginPage;
import starter.stepdefinitions.LoginStepDefinitions;

import static net.serenitybdd.screenplay.Task.where;

public class navigateTo{
        public navigateTo(){}

        public static Performable theN11HomePage(){
            return where("Open The n11Login Page ",
            Open.browserOn().the(n11LoginPage.class));
        }

        public static Performable clickLoginBtn() {
            return where("Click Login Button",
            Click.on("#loginContainer > div > div.leftBlock > div > div.facebook_large.medium.facebookBtn.btnLogin"));
        }
    }


