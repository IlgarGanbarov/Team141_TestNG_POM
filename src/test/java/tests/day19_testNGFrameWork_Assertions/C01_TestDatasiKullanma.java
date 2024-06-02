package tests.day19_testNGFrameWork_Assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_TestDatasiKullanma {

    @Test
    public void aramaTesti(){



        //testotomasyonu ana sayfaya gedin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //phone icin arama yapin

        TestotomasyonuPage testotomasyonuPage=new TestotomasyonuPage();
        testotomasyonuPage.aramakutusu.sendKeys(ConfigReader.getProperty("aranacakKelime")+ Keys.ENTER);
        //arama

        Assert.assertTrue(testotomasyonuPage.sonucElementleriList.size()>0);

        Driver.quitDriver();
    }
}
