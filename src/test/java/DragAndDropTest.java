import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

    @BeforeAll
    static void openHerokuApp() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://the-internet.herokuapp.com/drag_and_drop");
        System.out.println("*Start test info!*");

    }

    @Test
    void DragAndDrop (){
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
