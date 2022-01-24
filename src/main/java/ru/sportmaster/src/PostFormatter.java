package ru.sportmaster.src;

import ru.sportmaster.src.model.tags.Position;
import ru.sportmaster.src.model.tags.Tags;

import java.util.Comparator;
import java.util.List;

import static ru.sportmaster.src.utils.PostsFactory.getPost;

public class PostFormatter {

    String post;

    public PostFormatter(String post) {
        this.post = post;
    }

    public String format() {
        var postMapping = getPost(post);
        var tagMapping = postMapping.getTagMapping();

        Comparator<Position> tagIndexComparator = (m1, m2) -> {
            var value1 = m1.getStart();
            var value2 = m2.getStart();
            return Integer.compare(value1, value2);
        };

        tagMapping.sort(tagIndexComparator);
        return getFormattedPostContent(post, tagMapping);
    }

    private String getFormattedPostContent(String post, List<Position> tagMapping) {
        var counter = 0;
        var postBuilder = new StringBuilder(post);

        for (Position position : tagMapping) {
            var start = position.getStart();
            var end = position.getEnd();
            var tag = Tags.getTag(position.getTagType());
            removeSnippet(postBuilder, start + counter, end + counter);
            var updatedTextSnippet = tag.appendTag(post.substring(start, end));
            appendTag(postBuilder, updatedTextSnippet, start + counter);
            counter += updatedTextSnippet.length() - (end - start);
        }
        return postBuilder.toString();
    }

    private void removeSnippet(StringBuilder builder, int start, int end) {
        builder.delete(start, end);
    }

    private void appendTag(StringBuilder builder, String updatedTextSnippet, int offset) {
        builder.insert(offset, updatedTextSnippet);
    }
}
