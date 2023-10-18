package kevinjoramos.tempo_pal.service;

import jakarta.transaction.Transactional;
import kevinjoramos.tempo_pal.entity.Project;
import kevinjoramos.tempo_pal.repository.ProjectRepository;
import kevinjoramos.tempo_pal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAllUserProjects(int userId) {
        return projectRepository.findProjectsByUserId(userId);
    }

    @Override
    public Project findUserProject(int userId, int projectId) {
        return projectRepository.findProjectByUserIdAndId(userId, projectId);
    }

    @Transactional
    @Override
    public Project createUserProject(int userId, Project project) {
        project.setId(0);
        project.setUserId(userId);
        return projectRepository.save(project);
    }

    @Transactional
    @Override
    public Project updateUserProject(int userId, Project project) {
        return projectRepository.save(project);
    }

    @Transactional
    @Override
    public void deleteById(int userId, int projectId) {
        projectRepository.deleteById(projectId);
    }
}
