import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test extends SeleniumBase{


    public static void main(String[] args) {

    SeleniumBase.chooseYourFighter("Chrome");

    driver.navigate().to("https://www.solarwinds.com/network-performance-monitor/registration");

    driver.findElement(By.id("ci_firstName")).click();
    driver.findElement(By.id("ci_firstName")).sendKeys("Wendy");
    driver.findElement(By.id("ci_lastName")).sendKeys("Villegas");
    driver.findElement(By.id("ci_company")).sendKeys("Solarwinds");
    driver.findElement(By.id("ci_email")).sendKeys("QAAteamtestWendy@solarwinds.com");
    driver.findElement(By.id("ci_phone")).sendKeys("12345678908");
    driver.findElement(By.xpath("//button[@id='regFormSubmit']")).click();


    sleep(5000);

    JavascriptExecutor js = (JavascriptExecutor)driver;
    if (js.executeScript("return document.readyState").toString().equals("complete")){
        System.out.println("Page Is loaded.");
    }

    //sleep(10000);
    System.out.println(driver.findElement(By.className("h1")).getText());
    System.out.println(driver.findElement(By.xpath("//a[@href='https://support.solarwinds.com/Success_Center/Network_Performance_Monitor_%28NPM%29/Network_Performance_Monitor_Getting_Started_Guide']")).getText());
    System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-12 getting-started']//ul//li//p//a[@href='https://thwack.solarwinds.com/welcome']")).getText());
    System.out.println(driver.findElement(By.xpath("//a[@href='/company/home']")).getText());

    System.out.println(driver.findElement(By.cssSelector("div.container-fluid:nth-child(1) nav.navbar.navbar-default div.container div.collapse.navbar-collapse ul.nav.navbar-nav li.menu-toggle.separator:nth-child(5) > a.dropdown-toggle.menu-headline")).getText());
    System.out.println(driver.findElement(By.cssSelector("div.container-fluid:nth-child(1) div.container:nth-child(2) div.row div.col-sm-8 div.container-fluid.postRegistration div.container div.row div.col-sm-8.confirmation-download > span.subheadline")).getText());

    driver.quit();



    }
    public static void sleep(int pmiliseconds){
        try {
            Thread.sleep(pmiliseconds);
        } catch(InterruptedException e) {
            System.out.println("INTERRUPTION");
        }
    }
}
