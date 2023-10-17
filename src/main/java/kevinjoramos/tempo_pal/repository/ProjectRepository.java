package kevinjoramos.tempo_pal.repository;

import kevinjoramos.tempo_pal.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    List<Project> findProjectsByUserId(long userId);

    Project findProjectByUserIdAndId(long userId, long projectId);
}
