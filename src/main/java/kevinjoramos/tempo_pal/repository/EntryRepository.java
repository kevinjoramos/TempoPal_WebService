package kevinjoramos.tempo_pal.repository;

import kevinjoramos.tempo_pal.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Integer> {}