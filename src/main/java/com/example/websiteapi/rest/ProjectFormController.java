package com.example.websiteapi.rest;

import com.example.websiteapi.entity.Project;
import com.example.websiteapi.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/projects")
public class ProjectFormController {

	private ProjectService projectService;

	public ProjectFormController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/list")
	public String listProjects(Model model) {
		List<Project> projects = projectService.findAll();
		model.addAttribute("projects", projects);
		return "/projects/projects_list";
	}

	@GetMapping("/showFormForAdd")
	public String showAddFormProject(Model model) {

		Project project = new Project();
		model.addAttribute("project", project);

		return "/projects/add_project";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("projectId") int id,
									Model model) {

		Project project = projectService.findById(id);
		model.addAttribute("project", project);

		return "/projects/add_project";
	}


	@PostMapping("/save")
	public String saveProject(@ModelAttribute("project") Project project) {

		projectService.save(project);

		return "redirect:/projects/list";
	}


	@GetMapping("/delete")
	public String delete(@RequestParam("projectId") int id) {

		projectService.deleteById(id);

		return "redirect:/projects/list";

	}

	@GetMapping("/search")
	public String search(@RequestParam("projectName") String name,
						 Model theModel) {

		List<Project> projects = projectService.searchBy(name);

		theModel.addAttribute("projects", projects);

		return "/projects/projects_list";

	}
	
}










