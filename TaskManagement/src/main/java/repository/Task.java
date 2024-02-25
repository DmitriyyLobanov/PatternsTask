package repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements ITask{
    public enum Status{
        TO_DO,
        DOING,
        DONE
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String description;
    private Status status;
    private LocalDateTime creationTime;

    public static class TaskBuilder{
        private final Task task = new Task();

        public TaskBuilder id(Long id){
            task.setId(id);
            return this;
        }
        public TaskBuilder description(String description){
            task.setDescription(description);
            return this;
        }
        public TaskBuilder status(Status status){
            task.setStatus(status);
            return this;
        }
        public TaskBuilder creationTime(LocalDateTime creationTime){
            task.setCreationTime(creationTime);
            return this;
        }
        public Task build(){
            return task;
        }
    }

    }

