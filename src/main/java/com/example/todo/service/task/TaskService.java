package com.example.todo.service.task;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    public List<TaskEntity> findAll() {
        var task1 = new TaskEntity(1L, "Spring Bootを学ぶ", "TODOアプケーションを作る", TaskStatus.TODO);
        var task2 = new TaskEntity(2L, "Spring Securityを学ぶ", "ログイン機能を作る", TaskStatus.DONE);
        return List.of(task1, task2);
    }
}
