package com.example.todo.controller.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    @GetMapping("/tasks")
    public String list(Model model) {
        var task1 = new TaskDTO(1L, "Spring Bootを学ぶ", "TODOアプケーションを作る", "TODO");
        var task2 = new TaskDTO(2L, "Spring Securityを学ぶ", "ログイン機能を作る", "TODO");
        var taskList = List.of(task1, task2);
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
