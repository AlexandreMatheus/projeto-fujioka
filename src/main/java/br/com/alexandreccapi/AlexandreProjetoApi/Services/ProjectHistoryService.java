package br.com.alexandreccapi.AlexandreProjetoApi.Services;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.ProjectHistory;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.ProjectHistoryRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.ProjectHistoryDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectHistoryService {

    @Autowired
    private ProjectHistoryRepository projectHistoryRepository;

    public ProjectHistoryDTO getProjectHistoryById(Long id) throws NotFoundException {
        Optional<ProjectHistory> projectHistory = projectHistoryRepository.findById(id);

        if (!projectHistory.isPresent()) {
            throw new NotFoundException("department not found!");
        }

        return new ProjectHistoryDTO(projectHistory.get());
    }

    public List<ProjectHistoryDTO> getProjectsHistory(){
        return new ArrayList<ProjectHistoryDTO>(ProjectHistoryDTO.converter(projectHistoryRepository.findAll()));
    }


}
