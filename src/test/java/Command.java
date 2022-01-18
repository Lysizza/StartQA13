import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Command {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver(); // ChromeDriver driver = new ChromeDriver();
        // System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\Documents\\GitHub\\Start_QA_13\\chromedriver.exe");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    @Test
    public void findElement() {
        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.xpath("//div"));

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector("container"));

        wd.findElement(By.xpath("//container"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.cssSelector("[href]"));
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//*[text()='HOME']"));

        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[id='root']"));
        wd.findElement(By.cssSelector("#root"));

        wd.findElement(By.cssSelector("[href ^='/lo']")); // start
        wd.findElement(By.cssSelector("[href $='/in']")); // end
        wd.findElement(By.cssSelector("[href *='/ogi']")); // contains
        wd.findElement(By.xpath("//*[contains(@href), 'ogi']"));

        wd.findElement(By.partialLinkText("LO"));
    }

    @AfterMethod
    public void closeSite(){
        wd.quit();
    }
}
