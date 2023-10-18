package kevinjoramos.tempo_pal.service;

import jakarta.transaction.Transactional;
import kevinjoramos.tempo_pal.entity.Tag;
import kevinjoramos.tempo_pal.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public List<Tag> findAllUserTags(int userId) {
        return tagRepository.findTagsByUserId(userId);
    }

    @Override
    public Tag findUserTag(int userId, int tagId) {
        return tagRepository.findTagByUserIdAndId(userId, tagId);
    }

    @Transactional
    @Override
    public Tag createUserTag(int userId, Tag tag) {
        tag.setId(0);
        tag.setUserId(userId);
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public Tag updateUserTag(int userId, Tag tag) {
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public void deleteById(int userId, int tagId) {
        tagRepository.deleteById(tagId);
    }
}
