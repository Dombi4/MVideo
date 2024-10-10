package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MVObFactory {

    public static void clickCatalog(WebDriver driver){
        String catalog = "//button[@class = 'catalog-button ng-tns-c1511632439-1 mv-main-button--large mv-main-button--primary mv-button mv-main-button']";
        WebElement catalogElem = driver.findElement(By.xpath(catalog));
        catalogElem.click();
    }
    public static void mouseInSmart(WebDriver driver){
        String smart = "//a[text() = 'Смартфоны и гаджеты']";
        WebElement smartElem = driver.findElement(By.xpath(smart));
        new Actions(driver).moveToElement(smartElem).perform();
    }
    public static void clickSmartSams(WebDriver driver){
        String samsung = "//a[@title='Смартфоны Samsung']";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement samsungElem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(samsung)));
        samsungElem.click();
    }
    public static void clickSortMaxReit(WebDriver driver){
        String sort = "//span[text()='Сначала популярные']";
        WebElement sortElem = driver.findElement(By.xpath(sort));
        sortElem.click();
        String sort2 = "//div[text()=' Сначала с высоким рейтингом ']";
        WebElement sort2Elem = driver.findElement(By.xpath(sort2));
        sort2Elem.click();
    }
    public static void mouseInTablet(WebDriver driver){
        String nout = "//a[text() = 'Ноутбуки и компьютеры']";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement noutElem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nout)));
        new Actions(driver).moveToElement(noutElem).perform();
    }
    public static void clickTablets(WebDriver driver){
        String tablet = "//a[@title='Все планшеты']";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement tabletElem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tablet)));
        tabletElem.click();
    }
    public static void clickSortHichPrise(WebDriver driver){
        String sort = "//span[text()='Сначала популярные']";
        WebElement sortElem = driver.findElement(By.xpath(sort));
        sortElem.click();
        String sort2 = "//div[text()=' Сначала дороже ']";
        WebElement sort2Elem = driver.findElement(By.xpath(sort2));
        sort2Elem.click();
    }

}
