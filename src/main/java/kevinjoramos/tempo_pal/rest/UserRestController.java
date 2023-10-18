package kevinjoramos.tempo_pal.rest;

import kevinjoramos.tempo_pal.entity.User;
import kevinjoramos.tempo_pal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAllUsers();
    }

    @GetMapping("/users/{userId}")
    public User findUser(
        @PathVariable int userId
    ) {
        return userService.findUser(userId);
    }

    @PostMapping("/users")
    public User addUser(
        @RequestBody User user
    ) {
        return userService.createUser(user);
    }


    @PutMapping("/users")
    public User updateUser(
            @RequestBody User user
    ) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(
            @PathVariable int userId
    ) {
        userService.deleteById(userId);
    }
}
