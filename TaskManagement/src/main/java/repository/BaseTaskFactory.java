package repository;

public class BaseTaskFactory implements TaskFactory{

    @Override
    public ITask createTask(Long id) {
        Task.TaskBuilder builder = new Task.TaskBuilder();
        builder.id(id);
        return builder.build();
    }
}
