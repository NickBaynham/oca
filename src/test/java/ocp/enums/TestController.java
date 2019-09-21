package ocp.enums;

import com.github.nickbaynham.automation.Controller;
import com.github.nickbaynham.automation.WebDriverType;
import com.github.nickbaynham.automation.WebDriverTypeController;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestController {

    @Test
    public void testChrome() {
        WebDriver driver = Controller.getDriver(WebDriverType.CHROME);
        driver.quit();
    }

    @Test
    public void testFirefox() {
        WebDriver driver = Controller.getDriver(WebDriverType.FIREFOX);
        driver.quit();
    }

    @Test
    public void testIE() {
        WebDriver driver = Controller.getDriver(WebDriverType.EDGE);
        driver.quit();
    }

    @Test
    public void testNull() {
        WebDriver driver = Controller.getDriver(null);
        driver.quit();
    }

    @Test
    public void testAll() {
        for (WebDriverType webDriverType : WebDriverType.values()) {
            Controller.getDriver(webDriverType).quit();
        }
    }
}
