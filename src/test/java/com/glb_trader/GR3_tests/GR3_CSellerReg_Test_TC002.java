package com.glb_trader.GR3_tests;

import com.glb_trader.GR3_pages.GR3_CSellerRegPage;
import com.glb_trader.utilities.ConfigReader;
import com.glb_trader.utilities.TestBase;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GR3_CSellerReg_Test_TC002 extends TestBase {
    // Sadece category secenegi bos birakildi pass oldu
    GR3_CSellerRegPage gr3_cSellerRegPage = new GR3_CSellerRegPage();
    @Test
    public void glbTraderHomePageTest() {
        driver.get(ConfigReader.getProperty("glb_url"));

        gr3_cSellerRegPage.Seller_Join_Now.click();
        gr3_cSellerRegPage.company_name.sendKeys(ConfigReader.getProperty("glb_company_name"));
        gr3_cSellerRegPage.company_mobile.sendKeys(ConfigReader.getProperty("company_mobile"));
        gr3_cSellerRegPage.company_address.sendKeys(ConfigReader.getProperty("company_address"));
        gr3_cSellerRegPage.sellerName.sendKeys(ConfigReader.getProperty("sellerName"));
        gr3_cSellerRegPage.sellerEmail.sendKeys(ConfigReader.getProperty("sellerEmail"));
        gr3_cSellerRegPage.sellerWebSiteAddress.sendKeys(ConfigReader.getProperty("sellerWebSiteAddress"));
        gr3_cSellerRegPage.sellerMobilPhone.sendKeys(ConfigReader.getProperty("sellerMobilPhone"));

        Select select1 = new Select(gr3_cSellerRegPage.country);
        select1.selectByIndex(2);

        gr3_cSellerRegPage.state.sendKeys(ConfigReader.getProperty("state"));
        gr3_cSellerRegPage.city.sendKeys(ConfigReader.getProperty("city"));
        gr3_cSellerRegPage.address.sendKeys(ConfigReader.getProperty("address"));
        gr3_cSellerRegPage.postalCode.sendKeys(ConfigReader.getProperty("postalCode"));
        gr3_cSellerRegPage.password.sendKeys(ConfigReader.getProperty("password"));
        gr3_cSellerRegPage.registration.click();

        String actualTitle = gr3_cSellerRegPage.registrationText.getText();
        String expectedTitle = "Thank you to join our team. You are Registered Successfully.";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
