package kevinjoramos.tempo_pal.rest;

import kevinjoramos.tempo_pal.entity.Project;
import kevinjoramos.tempo_pal.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/{userId}")
public class ProjectRestController {

    ProjectService projectService;

    @Autowired
    public ProjectRestController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List<Project> findAll(
        @PathVariable int userId
    ) {
        return projectService.findAllUserProjects(userId);
    }

    @GetMapping("/projects/{projectId}")
    public Project findProject(
        @PathVariable int userId,
        @PathVariable int projectId
    ) {
        return projectService.findUserProject(userId, projectId);
    }

    @PostMapping("/projects")
    public Project addProject(
        @PathVariable int userId,
        @RequestBody Project project
    ) {
        return projectService.createUserProject(userId, project);
    }


    @PutMapping("/projects")
    public Project updateProject(
        @PathVariable int userId,
        @RequestBody Project project
    ) {
        return projectService.updateUserProject(userId, project);
    }

    @DeleteMapping("/projects/{projectId}")
    public void deleteProject(
        @PathVariable int userId,
        @PathVariable int projectId
    ) {
        projectService.deleteById(userId, projectId);
    }
}
