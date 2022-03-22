package activities.whendo;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class ListScreen {
    public Button newTareaButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public ListScreen(){}
    public boolean isTareaTitleDisplayed(String title){
        Label titleTarea = new Label(By.xpath("//android.widget.ListView//android.widget.TextView[@text='"+title+"']"));
        return titleTarea.isControlDisplayed();
    }

    public void enterEditTask(String title) throws MalformedURLException {
        Label titleTarea = new Label(By.xpath("//android.widget.ListView//android.widget.TextView[@text='"+title+"']"));
        titleTarea.click();
    }
}
