package kevinjoramos.tempo_pal.service;

import jakarta.transaction.Transactional;
import kevinjoramos.tempo_pal.entity.User;
import kevinjoramos.tempo_pal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return  userRepository.findAll();
    }

    @Override
    public User findUser(int userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isEmpty()) {
            throw new RuntimeException("User does not exist.");
        }

        return user.get();
    }

    @Transactional
    @Override
    public User createUser(User user) {
        user.setId(0);
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void deleteById(int userId) {
        userRepository.deleteById(userId);
    }
}
