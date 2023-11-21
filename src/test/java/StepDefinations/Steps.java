package StepDefinations;

import Pages.Locators;
import Utility.GWD;
import io.github.sukgu.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Steps extends GWD {

    Actions actions = new Actions(GWD.getDriver());
    Action action;
    Locators locator = new Locators();
    Parent parent = new Parent();

    @BeforeClass
    public static void openpage() {
        getDriver().get("https://www.teknosa.com/");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.teknosa.com/");
    }

    public void closeTheCookies() {
        if (locator.bastmm.size() != 0)
            parent.clickElement(locator.bastmm.get(0));

        Shadow shadow = new Shadow(GWD.getDriver());
        WebElement Webelement = shadow.findElement("[id='31cd32c1-b03e-4463-948d-1347667e64a4']");
        parent.clickElement(Webelement);
    }

    public void headerMenuRight(List<WebElement> elements) {
        List<String> headerMenu = new ArrayList<>();
        headerMenu.add("Telefon & Aksesuar");
        headerMenu.add("Bilgisayar & Tablet");
        headerMenu.add("TV, Ses ve Görüntü");
        headerMenu.add("Beyaz Eşya & Ev Aletleri");
        headerMenu.add("Ev, Ofis, Müzik, Spor Outdoor");

        for (int i = 0; i < elements.size(); i++) {
            Assert.assertEquals(elements.get(i).getAttribute("title"), headerMenu.get(i));
        }

        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                action = actions.moveToElement(element).build();
                action.perform();
                GWD.Pause();
            }
        }
    }

    public void headerMenuCenter(List<WebElement> elements) {
        List<String> headerMenu = new ArrayList<>();
        headerMenu.add("Kampanyalar");
        headerMenu.add("Outlet");

        for (int i = 0; i < elements.size(); i++) {
            Assert.assertEquals(elements.get(i).getAttribute("title"), headerMenu.get(i));
        }
    }

    public void headerMenuCenterV2(List<WebElement> elements) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getAttribute("title").equals("Kampanyalar")) {
                parent.clickElement(locator.kampanyalar);
                Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.teknosa.com/kampanyalar");
                parent.clickElement(locator.anasayfa);
            } else {
                parent.clickElement(locator.outlet);
                parent.verifyContainsTextFunction(locator.control, "Outlet Ürün Fiyatları ve Teşhir Ürünleri");
                parent.clickElement(locator.anasayfa);
            }
        }
    }

    public void headerMenuLeft(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                action = actions.moveToElement(element).build();
                action.perform();
                GWD.Pause();
            }
        }

    }

    public void headerMenuControlRight(List<WebElement> elements) {
        for (int i = 0; i < elements.size(); i++) {
            switch (elements.get(i).getAttribute("title")) {
                case "Telefon & Aksesuar":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.androidTel);
                    parent.verifyContainsTextFunction(locator.control, "Android Telefon Fiyatları ve Modelleri");
                    break;

                case "Bilgisayar & Tablet":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.gaming);
                    parent.verifyContainsTextFunction(locator.control, "Gaming Ürünleri Fiyatları ve Modelleri");
                    break;

                case "TV, Ses ve Görüntü":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.tvAp);
                    parent.verifyContainsTextFunction(locator.control, "TV Askı Aparatı Fiyatları ve Modelleri");
                    break;

                case "Beyaz Eşya & Ev Aletleri":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.mikFrn);
                    parent.verifyContainsTextFunction(locator.control, "Mikrodalga Fırın Fiyatları ve Modelleri");
                    break;

                case "Ev, Ofis, Müzik, Spor Outdoor":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.dolap);
                    parent.verifyContainsTextFunction(locator.control, "Ofis Masası Fiyatları ve Modelleri");
                    break;

            }
        }

    }

    public void headerMenuControlLeft(List<WebElement> elements) {
        for (int i = 0; i < elements.size(); i++) {
            switch (elements.get(i).getText()) {
                case "Elektrikli Ev Aletleri":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.kahveMak);
                    parent.verifyContainsTextFunction(locator.control, "Filtre Kahve Makinesi Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Giyilebilir Teknoloji":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.saatVBileklik);
                    parent.verifyContainsTextFunction(locator.control, "Saat ve Bileklik Aksesuarı Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Kişisel Bakım":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.disF);
                    parent.verifyContainsTextFunction(locator.control, "Şarjlı Diş Fırçası ve Aksesuarları Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Konsol, Oyun ve Oyuncu Ekipmanları":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.xboxOyun);
                    parent.verifyContainsTextFunction(locator.control, "Xbox Oyun Kolu ve Aksesuarları Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Fotoğraf Makinesi ve Kamera":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.dlsrFoto);
                    parent.verifyContainsTextFunction(locator.control, "DSLR Fotoğraf Makinesi Lensi Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Spor Outdoor":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.ftness);
                    parent.verifyContainsTextFunction(locator.control, "Fitness & Kondisyon Aletleri Fiyatları ve Modelleri");
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Hobi ve Eğlence":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.arac);
                    parent.verifyContainsTextFunction(locator.control, "Uzaktan Kumandalı Araba & Araçlar Fiyatları ve Modelleri");
                    break;

            }
        }

    }

    public void addToCartFromHeaderMenuRight(List<WebElement> elements) {
        for (int i = 0; i < elements.size(); i++) {
            switch (elements.get(i).getAttribute("title")) {
                case "Telefon & Aksesuar":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.androidTel);
                    parent.verifyContainsTextFunction(locator.control, "Android Telefon Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTexttv = locator.urunControl.getText();
                    String controlSaticitv = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTexttv);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticitv);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    break;


                case "Bilgisayar & Tablet":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.gaming);
                    parent.verifyContainsTextFunction(locator.control, "Gaming Ürünleri Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextpc = locator.urunControl.getText();
                    String controlSaticipc = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextpc);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticipc);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);

                    break;

                case "TV, Ses ve Görüntü":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.tvAp);
                    parent.verifyContainsTextFunction(locator.control, "TV Askı Aparatı Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextgrt = locator.urunControl.getText();
                    String controlSaticigrt = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextgrt);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticigrt);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    break;

                case "Beyaz Eşya & Ev Aletleri":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.mikFrn);
                    parent.verifyContainsTextFunction(locator.control, "Mikrodalga Fırın Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextbe = locator.urunControl.getText();
                    String controlSaticibe = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextbe);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticibe);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    break;

                case "Ev, Ofis, Müzik, Spor Outdoor":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.dolap);
                    parent.verifyContainsTextFunction(locator.control, "Ofis Masası Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextso = locator.urunControl.getText();
                    String controlSaticiso = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextso);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiso);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    break;

            }
        }

    }

    public void addToCartFromHeaderMenuLeft(List<WebElement> elements) {
        for (int i = 0; i < elements.size(); i++) {
            switch (elements.get(i).getText()) {
                case "Elektrikli Ev Aletleri":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.kahveMak);
                    parent.verifyContainsTextFunction(locator.control, "Filtre Kahve Makinesi Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextEa = locator.urunControl.getText();
                    String controlSaticiEa = locator.urunSaticiB.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextEa);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiEa);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Giyilebilir Teknoloji":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.saatVBileklik);
                    parent.verifyContainsTextFunction(locator.control, "Saat ve Bileklik Aksesuarı Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextGt = locator.urunControl.getText();
                    String controlSaticiGt = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextGt);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiGt);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Kişisel Bakım":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.disF);
                    parent.verifyContainsTextFunction(locator.control, "Şarjlı Diş Fırçası ve Aksesuarları Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextKb = locator.urunControl.getText();
                    String controlSaticiKb = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextKb);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiKb);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Konsol, Oyun ve Oyuncu Ekipmanları":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.xboxOyun);
                    parent.verifyContainsTextFunction(locator.control, "Xbox Oyun Kolu ve Aksesuarları Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextKoo = locator.urunControl.getText();
                    String controlSaticiKoo = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextKoo);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiKoo);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    parent.clickElement(locator.tumUrunler);
                    break;

                case "Fotoğraf Makinesi ve Kamera":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.dlsrFoto);
                    parent.verifyContainsTextFunction(locator.control, "DSLR Fotoğraf Makinesi Lensi Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextFmk = locator.urunControl.getText();
                    String controlSaticiFmk = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextFmk);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiFmk);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    parent.clickElement(locator.tumUrunler);
                    break;


                case "Hobi ve Eğlence":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.arac);
                    parent.verifyContainsTextFunction(locator.control, "Uzaktan Kumandalı Araba & Araçlar Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    String controlTextHe = locator.urunControl.getText();
                    String controlSaticiHe = locator.urunSatici.getText();
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    parent.verifyContainsTextFunction(locator.sepetControl, controlTextHe);
                    parent.verifyContainsTextFunction(locator.sepetSatici, controlSaticiHe);
                    parent.clickElement(locator.sepetiBosalt);
                    parent.clickElementJvs(locator.silOnay);
                    parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
                    parent.clickElementJvs(locator.alvrsBsla);
                    break;

            }
        }


    }

    public void addToCartFromHeaderMenuRightV2(List<WebElement> elements) {
        List<String> sepettekiUrunler = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            switch (elements.get(i).getAttribute("title")) {
                case "Telefon & Aksesuar":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.androidTel);
                    parent.verifyContainsTextFunction(locator.control, "Android Telefon Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    sepettekiUrunler.add(locator.urunControl.getText());
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.alsvrsDevamEt);

                    break;

                case "Bilgisayar & Tablet":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.gaming);
                    parent.verifyContainsTextFunction(locator.control, "Gaming Ürünleri Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    sepettekiUrunler.add(locator.urunControl.getText());
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.alsvrsDevamEt);
                    break;

                case "TV, Ses ve Görüntü":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.tvAp);
                    parent.verifyContainsTextFunction(locator.control, "TV Askı Aparatı Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    sepettekiUrunler.add(locator.urunControl.getText());
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.alsvrsDevamEt);
                    break;

                case "Beyaz Eşya & Ev Aletleri":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.mikFrn);
                    parent.verifyContainsTextFunction(locator.control, "Mikrodalga Fırın Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    sepettekiUrunler.add(locator.urunControl.getText());
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.alsvrsDevamEt);
                    break;

                case "Ev, Ofis, Müzik, Spor Outdoor":
                    action = actions.moveToElement(elements.get(i)).build();
                    action.perform();
                    GWD.Pause();
                    parent.clickElement(locator.dolap);
                    parent.verifyContainsTextFunction(locator.control, "Ofis Masası Fiyatları ve Modelleri");

                    parent.clickElementJvs(locator.altUrunler);
                    sepettekiUrunler.add(locator.urunControl.getText());
                    parent.clickElementJvs(locator.sepeteEkle);
                    parent.clickElementJvs(locator.sepetimeGit);
                    break;
            }
        }
        Collections.reverse(sepettekiUrunler);
        for (int i = 0; i < sepettekiUrunler.size(); i++) {
            Assert.assertTrue(locator.sepetControlCoklu.get(i).getText().contains(sepettekiUrunler.get(i)));
        }
        parent.clickElementJvs(locator.sepetiBosalt);
        parent.clickElementJvs(locator.silOnay);
        parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
        parent.clickElementJvs(locator.alvrsBsla);
    }

    public void addToCartFromSearchBox(String text) {
        parent.clickElementJvs(locator.searchBox);
        parent.sendKeysFunc(locator.searchBox, text);
        parent.clickElementJvs(locator.searchBoxAra);
        parent.verifyContainsTextFunction(locator.control, text);

        parent.clickElementJvs(locator.altUrunler);
        String controlText = locator.urunControl.getText();
        parent.clickElementJvs(locator.sepeteEkle);
        parent.clickElementJvs(locator.sepetimeGit);
        parent.verifyContainsTextFunction(locator.sepetControl, controlText);
        parent.clickElementJvs(locator.sepetiBosalt);
        parent.clickElementJvs(locator.silOnay);
        parent.verifyContainsTextFunction(locator.sepetOnayi, "Sepetinizde henüz ürün bulunmuyor");
        parent.clickElementJvs(locator.alvrsBsla);
    }

    public void searchFromSearchBox(String text){
        parent.clickElementJvs(locator.searchBox);
        parent.sendKeysFunc(locator.searchBox, text);
        parent.clickElementJvs(locator.searchBoxAra);
        parent.verifyContainsTextFunction(locator.control, text);
    }

    public void outOfComparison(List<WebElement> elements){
        for (int i = 0; i < elements.size(); i++) {
            parent.clickElementJvs(elements.get(i));
        }
    }

    @AfterClass
    public static void closepage() {
        GWD.quitDriver();
    }
}
