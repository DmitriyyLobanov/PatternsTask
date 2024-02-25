package repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Executor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public static class ExecutorBuilder{
        private final Executor executor = new Executor();

        public ExecutorBuilder id(Long id){
            executor.setId(id);
            return this;
        }
        public ExecutorBuilder name(String name){
            executor.setName(name);
            return this;
        }
        public Executor build(){
            return executor;
        }
    }
}
