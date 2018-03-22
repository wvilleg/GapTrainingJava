
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class SeleniumBase  {
    static WebDriver driver;
    public SeleniumBase(WebDriver pdriver) {
        setDriver(pdriver);
    }

    public SeleniumBase() {

    }

    public static WebDriver getDriver() {
        return driver;
    }

    static void setDriver(WebDriver driver) {
        SeleniumBase.driver = driver;
    }
    
    public WebDriver chooseYourFighter(String opt){

        if (opt.contentEquals("Chrome")) {
            driver = new ChromeDriver();

        }else {
            driver = new InternetExplorerDriver();
        }

        return driver;
    }

    }
