
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;

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

            driver = new FirefoxDriver();



            //WebDriver driver = new FirefoxDriver();


        }
        if (opt.contentEquals("IE")){
            driver = new InternetExplorerDriver();
        }


        return driver;
    }

    }
