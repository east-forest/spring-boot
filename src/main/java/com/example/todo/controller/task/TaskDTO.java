package com.example.todo.controller.task;

import com.example.todo.service.task.TaskEntity;

/**
 * DTO：データ受け渡し専用のクラス
 */
public record TaskDTO(
        long id,
        String summary,
        String description,
        String status
) {

    /**
     * Controllerには無駄な処理を書かないようにするために、DTOにて変換処理を行う。
     */
    public static TaskDTO toDto(TaskEntity entity) {
        return new TaskDTO(
                entity.id(),
                entity.summary(),
                entity.description(),
                entity.status().name()
        );
    }
}
