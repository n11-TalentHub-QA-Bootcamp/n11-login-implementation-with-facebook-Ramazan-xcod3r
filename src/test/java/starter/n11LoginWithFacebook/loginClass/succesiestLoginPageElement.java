package starter.n11LoginWithFacebook.loginClass;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Task.where;

public class succesiestLoginPageElement {
    public static Performable IsSucces(boolean that) {
        return where("",
                Ensure.that(that).isTrue());
    }
    public static boolean IsLoginSuccessful(Actor actor) {
        return   BrowseTheWeb.as(actor).$(".menuLink.user").isVisible();
    }
}