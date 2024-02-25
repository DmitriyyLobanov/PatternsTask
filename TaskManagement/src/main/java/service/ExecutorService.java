package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.Executor;
import repository.ExecutorRepository;
import repository.Task;
import repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExecutorService {
    private final ExecutorRepository executorRepository;

    public List<Executor> findAll(){
        return  executorRepository.findAll();
    }
    public Optional<Executor> findById(Long id){
        return executorRepository.findById(id);
    }
    public Executor save(Executor executor){
        return executorRepository.save(executor);
    }
    public void deleteById(Long id){
        executorRepository.deleteById(id);
    }
}
