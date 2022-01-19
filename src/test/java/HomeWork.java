import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Alex\\Documents\\GitHub\\Start_QA_13\\chromedriver.exe");

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }
    @Test
    public void findElement() {
        WebElement element = wd.findElement(By.xpath("//*[text()='PHONEBOOK']"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m :first-child"));
        wd.findElement(By.tagName("h1"));

        wd.findElement(By.xpath("//*[@href='/home']"));
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.linkText("HOME"));

        wd.findElement(By.xpath("html[1]/body[1]/div[1]/div[1]/a[2]"));
        wd.findElement(By.cssSelector("body :first-child :first-child :nth-child(3)"));
        wd.findElement(By.linkText("LOGIN"));

        wd.findElement(By.xpath("//*[contains(@href, 'ogi')]"));
        wd.findElement(By.cssSelector("[href *='ogi']"));
        wd.findElement(By.partialLinkText("OGI"));

        wd.findElement(By.xpath("//div//input[1]"));
        wd.findElement(By.cssSelector(".login_login__3EHKB >input[placeholder='Email']"));

        wd.findElement(By.xpath("//*[@placeholder='Password']"));
        wd.findElement(By.cssSelector("input[placeholder$='rd']"));

        wd.findElement(By.xpath("//*[.=' Login']"));
        wd.findElement(By.cssSelector("[class^='login'] :nth-child(4)"));

        wd.findElement(By.xpath("//div//button[text()=' Registration']"));
        wd.findElement(By.cssSelector(".login_login__3EHKB :last-child"));
    }

    @AfterMethod
    public void closeSite(){
        wd.quit();
    }
}
