package ru.sportmaster.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sportmaster.src.PostFormatter;


public class FeedTest {

    @Test
    public void checkFeedContent() {
        var input = "Obama visited Facebook headquarters: http://bit.ly/xyz @elversatil";
        var expectedOutput = "<strong>Obama</strong> visited <strong>Facebook</strong> headquarters: <a href = \"http://bit.ly/xyz\">http://bit.ly/xyz</a> <a href =\"http://twitter.com/@elversatil\">@elversatil</a>";
        Assertions.assertEquals(expectedOutput, new PostFormatter(input).format());
    }
}
