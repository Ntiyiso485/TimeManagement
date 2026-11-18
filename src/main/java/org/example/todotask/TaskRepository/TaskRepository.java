package org.example.todotask.TaskRepository;

import org.example.todotask.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    void deleteByDueDateLessThanEqual(LocalDateTime currentTime);

}