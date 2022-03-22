package activities.whendo;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class NewTaskScreen {
    public TextBox nameTaskTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox descriptionTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

}
