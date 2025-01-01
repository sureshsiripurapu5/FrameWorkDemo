package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions {
    WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver=driver;
    }

    public void SeleniumActions(WebDriver driver){
        this.driver=driver;
    }

    public void enterValue(WebElement element,String data){
        element.sendKeys(data);
    }

    public void enterValue(By by,String data){
        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String getTextMessage(WebElement element){
        return element.getText();
    }

    public String getTextMessage(By by){
       return driver.findElement(by).getText();
    }



}
