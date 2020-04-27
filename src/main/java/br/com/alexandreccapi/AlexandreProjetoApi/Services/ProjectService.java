package br.com.alexandreccapi.AlexandreProjetoApi.Services;

import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.ProjectDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Project;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectDTO getProjectById(Long id) throws NotFoundException {
        Optional<Project> project = projectRepository.findById(id);

        if (!project.isPresent()) {
            throw new NotFoundException("department not found!");
        }

        return new ProjectDTO(project.get());
    }

    public List<ProjectDTO> getProjects(){
        return new ArrayList<ProjectDTO>(ProjectDTO.converter(projectRepository.findAll()));
    }
}
