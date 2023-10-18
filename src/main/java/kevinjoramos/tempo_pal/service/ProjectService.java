package kevinjoramos.tempo_pal.service;

import kevinjoramos.tempo_pal.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAllUserProjects(int userId);

    Project findUserProject(int userId, int projectId);

    Project createUserProject(int userId, Project project);

    Project updateUserProject(int userId, Project project);

    void deleteById(int userId, int projectId);
}
