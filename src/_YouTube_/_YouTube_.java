package _YouTube_;

import Utilitily.BaseDriver;
import Utilitily.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _YouTube_ extends BaseDriver {
    @Test
    void Search (){
        _YouTubeFunctinatily_ elements = new _YouTubeFunctinatily_();

        wait.until(ExpectedConditions.elementToBeClickable(elements.Search)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.Search)).sendKeys("teoman kupa kızı sinek valesi");
        wait.until(ExpectedConditions.elementToBeClickable(elements.SearchClick)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.playmusic)).click();
        Tools.Bekle(15);
        wait.until(ExpectedConditions.elementToBeClickable(elements.likemusic)).click();

        wait.until(ExpectedConditions.urlContains("PtsMi4dtl1o"));

      //
    }
}
