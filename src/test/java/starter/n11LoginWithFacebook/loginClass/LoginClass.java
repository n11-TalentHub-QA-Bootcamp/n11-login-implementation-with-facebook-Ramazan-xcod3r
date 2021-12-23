package starter.n11LoginWithFacebook.loginClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import starter.stepdefinitions.LoginStepDefinitions;

import java.util.Iterator;
import java.util.Set;

public class LoginClass {
    public LoginClass(){}
    /*
    * We are accessing the browser's main Handle.
    * then we get All Handles
    * We define an Iterator to switch between Iterator and hands.
    * We do handle operations with the while loop.
    * Handles after main handle are taken from here. It is assigned to the child window.
    * Enter if not equal to main handle.
    * Switching from main window to child_window.
    * Logging in.
    * Waiting for the login form to be closed.
    * Returning to the main handle.*/
    public  static void HandleFacebookWindow(WebDriver driver){
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> I1= s.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);
                LoginClass.LoginForm(driver);
                try {while (!parent.equals(driver.getWindowHandle())){}
                }catch(Exception e){}

            }

        }
        driver.switchTo().window(parent);

    }
    public static void LoginForm(WebDriver driver){
        driver.findElement(By.name("email")).sendKeys("****id@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("p@ssw0rd!");
        driver.findElement(By.name("login")).click();
    }
}
