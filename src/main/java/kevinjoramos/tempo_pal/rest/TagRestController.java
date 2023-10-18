package kevinjoramos.tempo_pal.rest;

import kevinjoramos.tempo_pal.entity.Tag;
import kevinjoramos.tempo_pal.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/{userId}")
public class TagRestController {

    private TagService tagService;

    @Autowired
    public TagRestController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/tags")
    public List<Tag> findAll(
        @PathVariable int userId
    ) {
        return tagService.findAllUserTags(userId);
    }

    @GetMapping("/tags/{tagId}")
    public Tag findTag(
        @PathVariable int userId,
        @PathVariable int tagId
    ) {
        return tagService.findUserTag(userId, tagId);
    }

    @PostMapping("/tags")
    public Tag addTag(
        @PathVariable int userId,
        @RequestBody Tag tag
    ) {
        return tagService.createUserTag(userId, tag);
    }

    @PutMapping("/tags")
    public Tag updateTag(
        @PathVariable int userId,
        @RequestBody Tag tag
    ) {
        return tagService.updateUserTag(userId, tag);
    }

    @DeleteMapping("/tags/{tagId}")
    public void deleteTag(
        @PathVariable int userId,
        @PathVariable int tagId
    ) {
        tagService.deleteById(userId, tagId);
    }

}
