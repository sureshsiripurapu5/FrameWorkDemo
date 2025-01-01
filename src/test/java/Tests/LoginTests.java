package Tests;

import frameWork.BaseTest;
import frameWork.LoginPage;
import frameWork.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void intilaizePages(){
        loginPage=new LoginPage(driver);
        productsPage = new ProductsPage(driver);

    }

    @Test
    public void verifyLogin(){
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(productsPage.getProductsTitle(),"Products");
    }
}
