package testClean;

import activities.whendo.EditTaskScreen;
import activities.whendo.ListScreen;
import activities.whendo.NewTaskScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;
import java.util.Date;

public class DeleteTaskTest {
    ListScreen listScreen = new ListScreen();
    NewTaskScreen newTaskScreen = new NewTaskScreen();
    EditTaskScreen editTaskScreen = new EditTaskScreen();

    @Test
    public void deleteTask() throws MalformedURLException, InterruptedException {
        String taskTitle="Manuel"+new Date().getSeconds()+new Date().getMinutes();
        String description = "Descripcion"+new Date().getSeconds();
        listScreen.newTaskButton.click();
        newTaskScreen.nameTaskTxtBox.setValue(taskTitle);
        newTaskScreen.descriptionTxtBox.setValue(description);
        newTaskScreen.saveTaskButton.click();

        Thread.sleep(2000);

        Assertions.assertTrue(listScreen.isTaskTitleDisplayed(taskTitle),"Error no se creo el proyecto");

        listScreen.enterEditTask(taskTitle);
        editTaskScreen.deleteTask.click();
        editTaskScreen.confirmDelete.click();
        Thread.sleep(2000);

        Assertions.assertTrue(!listScreen.isTaskTitleDisplayed(taskTitle),"ERROR no se elimino la tarea");
    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
