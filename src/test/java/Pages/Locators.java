package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Locators {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

     // Header menu locators
    @FindBy(xpath = "//*[text()='Tamam']")
    public List<WebElement> bastmm;
    @FindBy(css = "[class='hb2-col1']")
    public WebElement anasayfa;
    @FindBy(css = "[class='hb3-link hb3-cat']")
    public List<WebElement> headerRight;
    @FindBy(css = "[class='hb3-link']")
    public List<WebElement> headerCenter;
    @FindBy(xpath = "//*[@class='hb3-link'] [1]")
    public WebElement kampanyalar;
    @FindBy(xpath = "//*[@class='hb3-link'] [2]")
    public WebElement outlet;
    @FindBy(css = "[class='plp-title'] ")
    public WebElement control;
    @FindBy(css = "[class='pdp-title'] ")
    public WebElement urunControl;
    @FindBy(css = "[class='prd-row-title'] >a")
    public WebElement sepetControl;
    @FindBy(css = "[class='prd-row-title'] >a")
    public List<WebElement> sepetControlCoklu;
    @FindBy(css = "[class='hb3-col1']")
    public WebElement tumUrunler;
    @FindBy(css = "[class='hmm-menu-item hmm-menu-parent']")
    public List<WebElement> headerLeft;
    @FindBy(css = "button[id='addToCartButton']")
    public WebElement sepeteEkle;
    @FindBy(css = "a[class='btn btn-primary']")
    public WebElement sepetimeGit;
    @FindBy(css = "div[class='pac-buttons'] >a")
    public WebElement alsvrsDevamEt;
    @FindBy(css = "[class='pdp-seller-info'] >a")
    public WebElement urunSatici;
    @FindBy(css = "[class='pdp-seller-info'] >b")
    public WebElement urunSaticiB;
    @FindBy(css = "[class='prd-row-info1'] >b>a")
    public WebElement sepetSatici;
    @FindBy(css = "[class='cart-reset mnp-trigger']")
    public WebElement sepetiBosalt;
    @FindBy(css = "[id='js-remove-all']")
    public WebElement silOnay;
    @FindBy(css = "[class='cart-empty-info']")
    public WebElement sepetOnayi;
    @FindBy(css = "[class='btn btn-primary'] ")
    public WebElement alvrsBsla;
    @FindBy(xpath = "//a[@class=' prd-link ']")
    public WebElement altUrunler;
    @FindBy(css = "[id='search-input']")
    public WebElement searchBox;
    @FindBy(css = "[aria-label='Kelime Ara']")
    public WebElement searchBoxAra;
    @FindBy(css = "[class='btn-compare'] ")
    public WebElement comp;
    @FindBy(css = "[title='Karşılaştır'] ")
    public WebElement compA;
    @FindBy(css = "[class='cpp-bar-remove']")
    public List<WebElement> compExit;
    @FindBy(css = "[class='cpr-title']")
    public WebElement compCont;
    ////// right
    @FindBy(xpath = "//*[text()='Tüm Gaming Ürünleri']")
    public WebElement gaming;
    @FindBy(xpath = "//*[text()='Tüm Android Telefonlar']")
    public WebElement androidTel;
    @FindBy(xpath = "//*[text()='TV Askı Aparatı']")
    public WebElement tvAp;
    @FindBy(xpath = "//*[text()='Mikrodalga Fırın']")
    public WebElement mikFrn;
    @FindBy(xpath = "//*[text()='Dolap ve Keson']")
    public WebElement dolap;
    ///// left
    @FindBy(xpath = "//*[text()='Filtre Kahve Makinesi']")
    public WebElement kahveMak;
    @FindBy(xpath = "//*[text()='Tüm Saat ve Bileklik Aksesuarları']")
    public WebElement saatVBileklik;
    @FindBy(xpath = "//*[text()='Şarjlı Diş Fırçası ve Aksesuarları']")
    public WebElement disF;
    @FindBy(xpath = "//*[text()='Xbox Oyun Kolu ve Aksesuarları']")
    public WebElement xboxOyun;
    @FindBy(xpath = "//*[text()='DSLR Fotoğraf Makinesi Lensi']")
    public WebElement dlsrFoto;
    @FindBy(xpath = "//*[text()='Fitness & Kondisyon Aletleri']")
    public WebElement ftness;
    @FindBy(xpath = "//*[text()='Uzaktan Kumandalı Araba & Araçlar']")
    public WebElement arac;
    ////////

}
