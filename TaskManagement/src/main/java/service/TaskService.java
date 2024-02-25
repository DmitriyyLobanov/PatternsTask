package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.Task;
import repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> findAll(){
        return  taskRepository.findAll();
    }
    public Optional<Task> findById(Long id){
        return taskRepository.findById(id);
    }
    public Task save(Task task){
        return taskRepository.save(task);
    }
    public void deleteById(Long id){
        taskRepository.deleteById(id);
    }
}
