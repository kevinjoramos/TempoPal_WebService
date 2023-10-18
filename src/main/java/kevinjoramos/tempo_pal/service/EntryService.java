package kevinjoramos.tempo_pal.service;

import kevinjoramos.tempo_pal.entity.Entry;

import java.util.List;

public interface EntryService {
    List<Entry> findAllUserEntries(int userId);

    Entry findUserEntry(int userId, int entryId);

    Entry createUserEntry(int userId, Entry entry);

    Entry updateUserEntry(int userId, Entry entry);

    void deleteById(int userId, int entryId);
}
