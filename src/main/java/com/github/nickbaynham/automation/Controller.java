package com.github.nickbaynham.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import static com.github.nickbaynham.automation.WebDriverType.FIREFOX;

public class Controller {
    public static WebDriver getDriver(WebDriverType webDriverType) {
        if (webDriverType == null) webDriverType = WebDriverType.FIREFOX;

        switch(webDriverType) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver24.exe");
                return new FirefoxDriver();
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver76.exe");
                return new ChromeDriver();
            case EDGE:
                System.setProperty("webdriver.edge.driver", "C:\\webdriver\\MicrosoftWebDriver.exe");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.firefox.driver", "C:\\webdriver\\geckodriver.exe");
                return new FirefoxDriver();
        }
    }
}
