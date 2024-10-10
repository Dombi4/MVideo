import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.MVObFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class RunTest {
    private WebDriver driver;
    @BeforeAll
    public static void checkBr(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    public void setupBr(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mvideo.ru/");
        // driver.manage().window().maximize();
        String location = "//button[@class='location-confirm mv-main-button--primary mv-main-button--medium mv-button mv-main-button']";
        WebElement locationElem = driver.findElement(By.xpath(location));
        locationElem.click();
    }
    @AfterEach
    public void driverDown(){
        if (driver != null){
            driver.quit();
        }
    }
    @Test()
    public void test1(){
        MVObFactory.clickCatalog(driver);
        MVObFactory.mouseInSmart(driver);
        MVObFactory.clickSmartSams(driver);
        String oldList = "//div[@class='product-cards-layout product-cards-layout--list']";
        List<WebElement> oldListElems = driver.findElements(By.xpath(oldList));
        MVObFactory.clickSortMaxReit(driver);
        List<WebElement> newElems = driver.findElements(By.xpath(oldList));
        boolean a = true;
        if (oldListElems.equals(newElems)){
            a = false;
            System.out.println("EQUALS");}else {
            System.out.println("NOT EQUALS");
        }
        assert a;
    }
    @Test
    public void test2()  {
        MVObFactory.clickCatalog(driver);
        MVObFactory.mouseInTablet(driver);
        MVObFactory.clickTablets(driver);
        String oldList = "//div[@class='product-cards-row ng-star-inserted']";
        List<WebElement> oldListElems = driver.findElements(By.xpath(oldList));
        MVObFactory.clickSortHichPrise(driver);
        List<WebElement> newElems = driver.findElements(By.xpath(oldList));
        boolean a = true;
        if (oldListElems.equals(newElems)){
            a = false;
            System.out.println("EQUALS");
        }else {
            System.out.println("NOT EQUALS");
        }
        assert a;
    }
}
