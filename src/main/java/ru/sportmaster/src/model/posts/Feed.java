package ru.sportmaster.src.model.posts;

import ru.sportmaster.src.model.tags.Tags;
import ru.sportmaster.src.model.tags.Position;

import java.util.ArrayList;
import java.util.List;

public class Feed extends Post {

    @Override
    public List<Position> getTagMapping() {
        List<Position> mapping = new ArrayList<>();
        var m1 = new Position(14, 22, Tags.ENTITY);
        mapping.add(m1);

        var m2 = new Position(0, 5, Tags.ENTITY);
        mapping.add(m2);

        var m3 = new Position(55, 66, Tags.USERNAME);
        mapping.add(m3);

        var m4 = new Position(37, 54, Tags.LINK);
        mapping.add(m4);

        return mapping;
    }
}

