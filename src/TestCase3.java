import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        System.out.println(driver.findElement(By.cssSelector("#footer>div.footer-widget>div>div>div.col-sm-3.col-sm-offset-1>div>h2")).isDisplayed());

        System.out.println(driver.findElement(By.id("susbscribe_email")).isDisplayed());

        System.out.println(driver.findElement(By.id("subscribe")).isDisplayed());

        System.out.println(driver.findElement(By.cssSelector("#footer>div.footer-widget>div>div>div.col-sm-3.col-sm-offset-1>div>form>p")).isDisplayed());

        driver.quit();
    }
}
