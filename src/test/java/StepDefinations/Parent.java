package StepDefinations;

import Utility.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait= new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(25));

    public void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",element);
    }

    public void clickElementJvs(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        ((JavascriptExecutor)GWD.getDriver()).executeScript("arguments[0].click();",element);
    }

    public void verifyContainsTextFunction(WebElement element,String expected){
        wait.until(ExpectedConditions.textToBePresentInElement(element,expected));
        Assert.assertTrue(element.getText().toLowerCase().contains(expected.toLowerCase()));
    }

    public void sendKeysFunc(WebElement element,String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }
}
