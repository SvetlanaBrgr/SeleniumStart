import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumHw_5 {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/login");
    }

    @Test
    public void testLogin(){
        System.out.println("Test start");
        WebElement element = wd.findElement(By.tagName("a"));
        WebElement root = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
//        WebElement reg = wd.findElement(By.linkText("Registration"));
    }
}
