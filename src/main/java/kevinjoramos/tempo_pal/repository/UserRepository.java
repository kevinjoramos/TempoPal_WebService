package kevinjoramos.tempo_pal.repository;

import kevinjoramos.tempo_pal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
