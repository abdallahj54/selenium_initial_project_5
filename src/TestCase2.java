import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        List<WebElement> headerOptions = driver.findElements(By.cssSelector("#header>div>div>div>div.col-sm-8>div"));

        for (WebElement headerOption : headerOptions) {
            System.out.println(headerOption.getText());
            System.out.println(headerOption.isDisplayed());
            System.out.println(headerOption.isEnabled());
        }

        driver.quit();
    }
}
