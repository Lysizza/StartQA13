import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableSet {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver(); // ChromeDriver driver = new ChromeDriver();
        // System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\Documents\\GitHub\\Start_QA_13\\chromedriver.exe");
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void findRow4(){
        WebElement element = wd.findElement(By.cssSelector("tr:nth-child(4)"));
       String text = element.getText();
        System.out.println(text);
       Assert.assertEquals(text, "Centro comercial Moctezuma Francisco Chang Mexico");
       Assert.assertTrue(text.contains("Centro comercial"));

       // List<WebElement> elements = wd.findElements(By.tagName("a"));
      //  System.out.println(elements.size());




    }
    @Test
    public void findElementLogin(){


    }

    @AfterMethod
    public void closeSite(){
        wd.quit();
    }
}
