import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElement {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver(); // ChromeDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\Documents\\GitHub\\Start_QA_13\\chromedriver.exe ");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    @Test
    public void findElement(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }
    @Test
    public void findElementLogin(){
       wd.findElement(By.linkText("LOGIN"));
     //  wd.findElement(By.partialLinkText("LOG"));

    }

    @AfterMethod
    public void closeSite(){
        wd.quit();
    }
}
