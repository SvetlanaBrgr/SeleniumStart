import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium {
    WebDriver wbd;

@BeforeMethod
    public void preCondition(){
    System.out.println("Opening web-site");
    wbd = new ChromeDriver();
    wbd.navigate().to("https://telranedu.web.app/login");

}
@Test
    public void testLogin(){
    WebElement element = wbd.findElement(By.tagName("a"));
    WebElement className = wbd.findElement(By.className("container"));
    WebElement classActive = wbd.findElement(By.className("active"));
    WebElement id = wbd.findElement(By.id("root"));
//    WebElement linkHome = wbd.findElement(By.linkText("Home"));
    WebElement linkAbout = wbd.findElement(By.linkText("About"));
}
@AfterMethod
    public void postCondition(){
wbd.quit();
}
}
