
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumBase  {

    public static WebDriver driver;
    public SeleniumBase(WebDriver pdriver) {
        setDriver(pdriver);
    }

    public SeleniumBase() {

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver pdriver) {
        driver = pdriver;
    }
    
    public static WebDriver chooseYourFighter(String opt){

        if (opt.contentEquals("Chrome")) {
            driver = new ChromeDriver();

        }
        if (opt.contentEquals("Firefox")){

            //beta 2 version
            //System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");

            //beta 1 version
            System.setProperty("webdriver.gecko.driver", "C:\\FirefoxGecko\\geckodriver.exe");

            //driver = new FirefoxDriver();
            //Profile is deprecated

            FirefoxOptions firefoxOptions = new FirefoxOptions();
            //firefoxOptions.setCapability("pageLoadStrategy","normal");
            firefoxOptions.addArguments("start-maximazed");
            //firefoxOptions.setCapability("applicationCacheEnabled","true");
            //System.out.println(firefoxOptions.getCapability("applicationCacheEnabled"));

            driver = new FirefoxDriver(firefoxOptions);
            driver.get("https://www.solarwinds.com/downloads");
            driver.quit();



            //WebDriver driver = new FirefoxDriver();


        }
        if (opt.contentEquals("IE")){
            driver = new InternetExplorerDriver();
        }


        return driver;
    }

    public void chromeMax(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
    }

    }
