package _YouTube_;

import Utilitily.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _YouTubeFunctinatily_ {
    public _YouTubeFunctinatily_() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath="(//input[@id='search'])")
    public WebElement Search;

    @FindBy(id="search-icon-legacy")
    public WebElement SearchClick;

    @FindBy(xpath="(//a[@id='video-title'])[1]")
    public WebElement playmusic;

    @FindBy(css="button[class='ytp-ad-skip-button-modern ytp-button']")
    public WebElement reklamatla;

    @FindBy(xpath="(//like-button-view-model[@class='YtLikeButtonViewModelHost'])[1]")
    public WebElement likemusic;

    @FindBy(css="")
    public WebElement S1earchClick;
}
