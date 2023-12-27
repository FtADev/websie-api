package com.example.websiteapi.doa;

import com.example.websiteapi.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

    //JPA will understand the pattern from method name
    // In this method, JPA will call "from Project order by priority asc"
    public List<Project> findAllByOrderByPriorityAsc();

    public List<Project> findAll();

    // search by name
    public List<Project> findByNameContainsAllIgnoreCase(String name);
}
