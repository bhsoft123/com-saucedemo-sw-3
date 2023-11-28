package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

/**2. Create the package utilities and create the class
 with the name ‘Utility’ inside the ‘utilities’
 package. And write the all the utility methods in
 it’.*/

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    }

    /*------------------Alert methods ----------------
    This method will switch to alert
    */
/*    public void switchToAlert() {
        driver.switchTo().alert();
    }
    // This method will accept to alert
    public void acceptAlert() {
        driver.switchTo().alert();
    }

    //3 more methods - dismiss, gettext, sendtext

//------------------------Select Class methods

    public void selectByValueFromDropDown(By by,String value){

        //create the drop down object of Select Class
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
        System.out.println("select by value");

    }

    //-----------------------Action methods
    //this method will use to hover mouse on element
    public void mouseHoverToElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
}*/

