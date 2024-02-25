package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.Executor;
import repository.Task;
import service.TaskManagementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    private TaskManagementService facade;

    public TaskController(TaskManagementService facade) {
        this.facade = facade;
    }

    @GetMapping("/allTasks")
    public List<Task> findAllTasks(){
        return facade.getTaskService().findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable Long id){
        Optional<Task> task = facade.getTaskService().findById(id);
        return task.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return facade.getTaskService().save(task);
    }
    @PutMapping("/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable Long id){
        task.setId(id);
        return facade.getTaskService().save(task);
    }
    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id){
        facade.getTaskService().deleteById(id);
    }


    @GetMapping("/allExecutor")
    public List<Executor> findAllExecutors(){
        return facade.getExecutorService().findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Executor> findExecutorById(@PathVariable Long id){
        Optional<Executor> executor = facade.getExecutorService().findById(id);
        return executor.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
    @PostMapping
    public Executor saveExecutor(@RequestBody Executor executor){
        return facade.getExecutorService().save(executor);
    }
    @PutMapping("/{id}")
    public Executor updateExecutor(@RequestBody Executor executor, @PathVariable Long id){
        executor.setId(id);
        return facade.getExecutorService().save(executor);
    }
    @DeleteMapping("/{id}")
    public void deleteExecutorById(@PathVariable Long id){
        facade.getExecutorService().deleteById(id);
    }

}
