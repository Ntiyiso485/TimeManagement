package org.example.todotask.Scheduler;

import org.example.todotask.TaskRepository.TaskRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskScheduler {

    private final TaskRepository taskRepository;

    public TaskScheduler(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Scheduled(fixedRate = 60000)
    public void deleteExpiredTasks() {

        LocalDateTime currentTime = LocalDateTime.now();

        taskRepository.deleteByDueDateLessThanEqual(currentTime);

        System.out.println("Checking and deleting expired tasks...");
    }
}
