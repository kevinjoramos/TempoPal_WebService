package kevinjoramos.tempo_pal.rest;

import kevinjoramos.tempo_pal.entity.Entry;
import kevinjoramos.tempo_pal.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/{userId}")
public class EntryRestController {

    private EntryService entryService;

    @Autowired
    public EntryRestController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping("/entries")
    public List<Entry> findAll(
            @PathVariable int userId
    ) {
        return entryService.findAllUserEntries(userId);
    }

    @GetMapping("/entries/{entryId}")
    public Entry findEntry(
            @PathVariable int userId,
            @PathVariable int entryId
    ) {
        return entryService.findUserEntry(userId,entryId);
    }

    @PostMapping("/entries")
    public Entry addEntry(
            @PathVariable int userId,
            @RequestBody Entry entry
    ) {
        return entryService.createUserEntry(userId, entry);
    }

    @PutMapping("/entries")
    public Entry updateEntry(
            @PathVariable int userId,
            @RequestBody Entry entry
    ) {
        return entryService.updateUserEntry(userId, entry);
    }

    @DeleteMapping("/entries/{entryId}")
    public void deleteEntry(
            @PathVariable int userId,
            @PathVariable int entryId
    ) {
        entryService.deleteById(userId, entryId);
    }
}
