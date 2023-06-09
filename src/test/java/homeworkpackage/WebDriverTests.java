package homeworkpackage;

import homeworkpackage.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class WebDriverTests {

    public static String env = System.getProperty("env");

    @Test
    @Tag("remote")
    public void mobileRemote() {
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getPlatformName()).isEqualTo("IOS");
        assertThat(config.getDeviceName()).isEqualTo("IPhone 14 Pro Max");
        assertThat(config.getPlatformVersion()).isEqualTo("14");
    }

    @Test
    @Tag("local")
    public void mobileLocal() {
        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

        assertThat(config.getPlatformName()).isEqualTo("Android");
        assertThat(config.getDeviceName()).isEqualTo("Google Pixel 5");
        assertThat(config.getPlatformVersion()).isEqualTo("12");
    }

}
