package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumActions;

public class ProductsPage {
     WebDriver driver;
     SeleniumActions seleniumActions;

   public ProductsPage(WebDriver driver){
       this.driver=driver;
       seleniumActions=new SeleniumActions(driver);
       PageFactory.initElements(driver,this);
   }

   @FindBy(css = ".title")
    private WebElement titleText;

   public String getProductsTitle(){
       return seleniumActions.getTextMessage(titleText);

   }

}
