package ru.sportmaster.src.model.tags;

public class Link implements Tag {

    @Override
    public String appendTag(String data) {
        return "<a href = \"" + data + "\">" + data + "</a>";
    }

}
