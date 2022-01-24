package ru.sportmaster.src.model.posts;

import ru.sportmaster.src.model.tags.Position;

import java.util.List;

public abstract class Post {
    public abstract List<Position> getTagMapping();
}
