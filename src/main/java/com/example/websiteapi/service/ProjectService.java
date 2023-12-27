package com.example.websiteapi.service;

import com.example.websiteapi.entity.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> findAll();

    public Project findById(int id);

    public void save(Project project);

    public void deleteById(int id);

    public List<Project> searchBy(String name);
}
