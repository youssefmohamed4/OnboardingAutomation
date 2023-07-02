package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = new ChromeDriver();
    @Before
    public static void openBrowser() {
        System.out.println("User Open browser");
        String key ="webdriver.chrome.driver";
        String value =System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--whitelisted-ips");
        driver = new ChromeDriver(options);
        System.setProperty(key,value);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://portal-demo.finflx.com/register/");

    }

    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
