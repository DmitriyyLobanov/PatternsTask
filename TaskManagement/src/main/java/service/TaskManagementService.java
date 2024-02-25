package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskManagementService implements TaskManagementServiceFacade{
    private TaskService taskService;
    private ExecutorService executorService;

    @Autowired
    public TaskManagementService(TaskService taskService, ExecutorService executorService) {
        this.taskService = taskService;
        this.executorService = executorService;
    }

    public TaskService getTaskService() {
        return taskService;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }
}
