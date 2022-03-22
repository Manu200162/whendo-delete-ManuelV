package activities.whendo;

import controles.Button;
import org.openqa.selenium.By;

public class EditTaskScreen {
    public Button deleteTask = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDelete = new Button(By.id("android:id/button1"));
}
