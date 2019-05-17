import org.openqa.selenium.remote.DesiredCapabilities;

public class Flipkart {

    public static void main(String[] args) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Test");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");

    }
}
