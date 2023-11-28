package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
        String exptectedText = "Products";
        String actualText = getTextFromElement(By.xpath("//span"));
        Assert.assertEquals("Error", exptectedText, actualText);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
        List<WebElement> numberOfProducts = driver.findElements(By.className("inventory_item"));
        System.out.println("Total slides are: " + numberOfProducts.size());

        for (WebElement link : numberOfProducts) {
            System.out.println("The links: " + link.getText());
            System.out.println("The value of attributes : " + link.getAttribute("class"));
        }}
    @After
        public void tearDown(){
            closeBrowser();
        }

}
