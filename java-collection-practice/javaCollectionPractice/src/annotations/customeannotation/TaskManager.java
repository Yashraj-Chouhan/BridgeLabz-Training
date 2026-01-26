package annotations.customeannotation;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Yashraj")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
