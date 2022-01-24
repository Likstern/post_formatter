package ru.sportmaster.src.model.tags;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Position {
    private int start;
    private int end;
    private Tags tagType;
}
