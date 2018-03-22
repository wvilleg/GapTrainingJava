import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    public static WebDriver driver;
    public static void main(String[] args) {

        SeleniumBase seleniumBase = new SeleniumBase();
        driver = seleniumBase.chooseYourFighter("Chrome");
        driver.navigate().to("https://www.google.com/");
        takeScreenshot();
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Selenium");
        element.submit();
        takeScreenshot();
        driver.quit();

    }

    public static void takeScreenshot(){
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("gapAtTrainningJava/resources/"+System.currentTimeMillis()+".png"));
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    }

