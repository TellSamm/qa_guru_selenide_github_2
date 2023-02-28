import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionsTest {

    @BeforeAll
    static void openPracticeForm() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        open("https://github.com");
        System.out.println("*Start test info!*");

    }

    @Test
    void hoverSolutionsTest(){
        $("[aria-label=Global]").$(byText("Solutions")).hover();
        $("div[class^='Header'] a[href~='/enterprise']").click();
        $("div[class^='col'] h1[class^='h1-mktg']").shouldHave(text("Build like the best"));
    }
}
