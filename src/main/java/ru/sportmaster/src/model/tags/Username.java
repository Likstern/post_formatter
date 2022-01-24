package ru.sportmaster.src.model.tags;

public class Username implements Tag {

    @Override
    public String appendTag(String content) {
        return "<a href =\"http://twitter.com/" + content + "\">" + content + "</a>";
    }
}
