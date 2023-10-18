package kevinjoramos.tempo_pal.repository;

import kevinjoramos.tempo_pal.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

    List<Entry> findEntriesByUserId(long userId);

    List<Entry> findEntriesByUserIdAndProjectId(long userId, long projectId);

    List<Entry> findEntriesByUserIdAndTagId(long userId, long tagId);

    Entry findEntryByUserIdAndId(long userId, long entryId);
}