import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Flipkart {
    private static AndroidDriver driver;
    private static final int WAIT_TIME = 30;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Test");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("appPackage", "com.flipkart.android");
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("app", System.getProperty("user.dir")
                + "/src/test/resources/app/flipkart.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);

        Thread.sleep(4000);
        WebElement closeBtn = driver.findElement(By.id("btn_skip"));
        closeBtn.click();
        WebElement searchBox = driver.findElement(By.id("search_widget_textbox"));

        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.click();

        WebElement productSearch = driver.findElement(By.id("search_autoCompleteTextView"));
        productSearch.sendKeys("Watches");

        List<WebElement> searchResults = driver.findElements(By.id("txt_title"));
        searchResults.get(0).click();

        Thread.sleep(4000);
        List<WebElement> imageList = driver.findElements(By.xpath("//android.widget.ImageView"));
        imageList.get(0).click();

        Thread.sleep(6000);
        WebElement buyNow = driver.findElement(By.xpath("//android.widget.TextView[@text='BUY NOW']"));
        wait.until(ExpectedConditions.visibilityOf(buyNow));
        buyNow.click();

    }
}
