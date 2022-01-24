package ru.sportmaster.src.model.tags;

public enum Tags {
    ENTITY, USERNAME, LINK;

    public static Tag getTag(Tags tags) {
        if (tags == null) {
            return null;
        }
        if (tags == ENTITY) {
            return new Entity();
        }
        if (tags == USERNAME) {
            return new Username();
        }
        if (tags == LINK) {
            return new Link();
        }
        return null;
    }
}
