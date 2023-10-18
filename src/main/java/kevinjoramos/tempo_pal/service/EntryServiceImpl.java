package kevinjoramos.tempo_pal.service;

import jakarta.transaction.Transactional;
import kevinjoramos.tempo_pal.entity.Entry;
import kevinjoramos.tempo_pal.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {

    private EntryRepository entryRepository;

    @Autowired
    public EntryServiceImpl(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @Override
    public List<Entry> findAllUserEntries(int userId) {
        return entryRepository.findEntriesByUserId(userId);
    }

    @Override
    public Entry findUserEntry(int userId, int entryId) {
        return entryRepository.findEntryByUserIdAndId(userId, entryId);
    }

    @Transactional
    @Override
    public Entry createUserEntry(int userId, Entry entry) {
        entry.setId(0);
        entry.setUserId(userId);
        return entryRepository.save(entry);
    }

    @Transactional
    @Override
    public Entry updateUserEntry(int userId, Entry entry) {
        return entryRepository.save(entry);
    }

    @Transactional
    @Override
    public void deleteById(int userId, int entryId) {
        entryRepository.deleteById(entryId);
    }
}
