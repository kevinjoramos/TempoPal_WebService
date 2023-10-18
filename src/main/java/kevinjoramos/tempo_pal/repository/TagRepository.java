package kevinjoramos.tempo_pal.repository;

import kevinjoramos.tempo_pal.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Integer> {

    List<Tag> findTagsByUserId(long userId);

    Tag findTagByUserIdAndId(long userId, long tagId);
}
