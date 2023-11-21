package Test;

import Pages.Locators;
import StepDefinations.Parent;
import StepDefinations.Steps;
import Utility.GWD;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Tests extends Parent {

    /******************************/
    // Before Running Tests   Steps.openpage();          update steps according to test condition.
    //                        steps.closeTheCookies();
    //                        Steps.closepage();
    /****************************/
    Locators locator = new Locators();
    Steps steps = new Steps();

    @Test(priority = 1)
    void HeaderMenuTest() {
        Steps.openpage();
        steps.closeTheCookies();

        steps.headerMenuRight(locator.headerRight);
        clickElement(locator.tumUrunler);
        steps.headerMenuLeft(locator.headerLeft);
        steps.headerMenuCenter(locator.headerCenter);
        steps.headerMenuCenterV2(locator.headerCenter);

//        Steps.closepage();
    }

    @Test(priority = 2)
    void HeaderMenuControl() {
//        Steps.openpage();
//        steps.closeTheCookies();

        steps.headerMenuControlRight(locator.headerRight);
        clickElement(locator.anasayfa);
        clickElement(locator.tumUrunler);
        steps.headerMenuControlLeft(locator.headerLeft);
        clickElement(locator.anasayfa);

//        Steps.closepage();
    }

    @Test(priority = 3)
    void AddToCartFromHeaderMenu() {
//        Steps.openpage();
//        steps.closeTheCookies();

        steps.addToCartFromHeaderMenuRight(locator.headerRight);
        clickElement(locator.tumUrunler);
        steps.addToCartFromHeaderMenuLeft(locator.headerLeft);
        steps.addToCartFromHeaderMenuRightV2(locator.headerRight);
        clickElement(locator.anasayfa);

//        Steps.closepage();

    }

    @Test(priority = 4)
    @Parameters("searchText")
    void AddToCartFromSearchBox(String text) {
//        Steps.openpage();
//        steps.closeTheCookies();

        steps.addToCartFromSearchBox(text);
        clickElement(locator.anasayfa);

//        Steps.closepage();
    }

    @Test(priority = 5)
    void productComparison() {
//        Steps.openpage();
//        steps.closeTheCookies();

        steps.searchFromSearchBox("samsung telefon");
        clickElementJvs(locator.altUrunler);
        clickElementJvs(locator.comp);
        steps.searchFromSearchBox("oppo telefon");
        clickElementJvs(locator.altUrunler);
        clickElementJvs(locator.comp);
        clickElementJvs(locator.compA);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains("karsilastir"));
        steps.outOfComparison(locator.compExit);
        verifyContainsTextFunction(locator.compCont,"Karşılaştırılacak Ürün Bulunamadı.");
        clickElement(locator.anasayfa);

        Steps.closepage();
    }
}
