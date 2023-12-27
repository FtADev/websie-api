package com.example.websiteapi.service;

import com.example.websiteapi.doa.ProjectRepository;
import com.example.websiteapi.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAllByOrderByPriorityAsc();
    }

    @Override
    public Project findById(int id) {
        Optional<Project> result = projectRepository.findById(id);

        Project project = null;

        if (result.isPresent()) {
            project = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find project id - " + id);
        }

        return project;
    }

    @Override
    public void save(Project employee) {
        projectRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> searchBy(String theName) {

        List<Project> results = null;

        if (theName != null && (theName.trim().length() > 0)) {
            results = projectRepository.findByNameContainsAllIgnoreCase(theName);
        }
        else {
            results = findAll();
        }

        return results;
    }
}



