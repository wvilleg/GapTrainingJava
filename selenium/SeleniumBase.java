
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumBase  {
    String browserName;
    static WebDriver driver;

    public SeleniumBase(String pname) {
        setBrowserName(pname);
    }
    public SeleniumBase() {

    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    static void setDriver(WebDriver driver) {
        SeleniumBase.driver = driver;
    }
    
    public String chooseYourFighter(String opt){
        String result;
        System.out.println("OPT " + opt);
        if (opt.contentEquals("Chrome")) {
            driver = new ChromeDriver();
            result = "Your fighter is the mighty Chrome , hide your RAM";
        }else {
            System.out.println("else");
            driver = new InternetExplorerDriver();
            result = "Your fighter is the old and wise IE, keep the RAM but it may not work";
        }
        initFighter();

        return result;
    }

    public void initFighter(){
        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Chrome memes");
        element.submit();
        sleep(3000);

        driver.navigate().to("http://wanna-joke.com/wp-content/uploads/2016/07/ram-chrome-parents.jpg");
        sleep(5000);
        driver.quit();
    }
    public void sleep(int pmiliseconds){
        try {
            Thread.sleep(pmiliseconds);
        } catch(InterruptedException e) {
            System.out.println("INTERRUPTION");
        }
    }
}