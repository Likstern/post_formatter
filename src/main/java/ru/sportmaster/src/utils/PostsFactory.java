package ru.sportmaster.src.utils;

import lombok.SneakyThrows;
import ru.sportmaster.src.model.posts.Post;
import ru.sportmaster.src.model.posts.Feed;

public class PostsFactory {

    @SneakyThrows
    public static Post getPost(String content) {
        if (content.matches("^.*: (http|https):\\/\\/.* @\\w+$")) {
            return new Feed();
        }
        throw new Exception("Не известный тип контента");
    }
}
