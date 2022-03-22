package testClean;

import activities.whendo.EditTaskScreen;
import activities.whendo.ListScreen;
import activities.whendo.NewtareaScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;
import java.util.Date;

public class DeleteTaskTest {
    ListScreen listScreen = new ListScreen();
    NewtareaScreen newtareaScreen = new NewtareaScreen();
    EditTaskScreen editTaskScreen = new EditTaskScreen();

    @Test
    public void deleteTask() throws MalformedURLException, InterruptedException {
        String proyecto="Manuel"+new Date().getSeconds()+new Date().getMinutes();
        String descripcion = "Descripcion"+new Date().getSeconds();
        listScreen.newTareaButton.click();
        newtareaScreen.nameTareaTxtBox.setValue(proyecto);
        newtareaScreen.descriptionTxtBox.setValue(descripcion);
        newtareaScreen.saveTareaButton.click();

        Thread.sleep(2000);

        Assertions.assertTrue(listScreen.isTareaTitleDisplayed(proyecto),"Error no se creo el proyecto");

        listScreen.enterEditTask(proyecto);
        editTaskScreen.deleteTask.click();
        editTaskScreen.confirmDelete.click();
        Thread.sleep(2000);

        Assertions.assertTrue(!listScreen.isTareaTitleDisplayed(proyecto),"ERROR no se elimino la tarea");
    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
