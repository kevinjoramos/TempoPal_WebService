package kevinjoramos.tempo_pal.service;

import kevinjoramos.tempo_pal.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUser(int userId);

    User createUser(User user);

    User updateUser(User user);

    void deleteById(int userId);
}
