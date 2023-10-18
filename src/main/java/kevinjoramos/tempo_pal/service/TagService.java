package kevinjoramos.tempo_pal.service;

import kevinjoramos.tempo_pal.entity.Tag;

import java.util.List;

public interface TagService {
    List<Tag> findAllUserTags(int userId);

    Tag findUserTag(int userId, int tagId);

    Tag createUserTag(int userId, Tag tag);

    Tag updateUserTag(int userId, Tag tag);

    void deleteById(int userId, int tagId);
}
