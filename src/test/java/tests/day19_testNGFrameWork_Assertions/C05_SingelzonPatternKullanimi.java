package tests.day19_testNGFrameWork_Assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SingelzonPatternKullanimi {

    @Test
    public void aramaTesti(){


       // Driver.driver.get(ConfigReader.getProperty("toUrl"));


        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

       Driver.getDriver();
    }
}
