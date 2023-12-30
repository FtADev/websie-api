package com.example.websiteapi.rest;

import com.example.websiteapi.entity.Project;
import com.example.websiteapi.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProjectRestController {

    private final ProjectService projectService;

    public ProjectRestController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public List<Project> listProjects() {
        List<Project> projects = projectService.findAllByOrderByPriorityAsc();
        return projects;
    }

    @GetMapping("/list-with-image")
    public List<Project> listWithImageProjects() {
        List<Project> projects = projectService.findAllWithImage();
        return projects;
    }

    @PutMapping("/update")
    public String updateProject(@RequestBody Project project) {

        projectService.save(project);

        return "updated";
    }


    @PostMapping("/add")
    public String addProject(@RequestBody Project project) {

        projectService.save(project);

        return "saved";
    }


    @DeleteMapping("/delete")
    public String delete(@RequestParam("projectId") int id) {

        projectService.deleteById(id);

        return "Deleted";

    }

    @GetMapping("/search")
    public List<Project> search(@RequestParam("projectName") String name) {

        List<Project> projects = projectService.searchBy(name);

        return projects;
    }

}










