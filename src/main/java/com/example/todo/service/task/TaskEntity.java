package com.example.todo.service.task;

/**
 * DTOを使わない理由：DTOはプレゼンテーション層であり、層を跨いでの参照はよくない。
 * ビジネスロジック層の変更を、DTOに影響与えないために隔離している。
 * */
public record TaskEntity(
        long id,
        String summary,
        String description,
        TaskStatus status
) {
}
