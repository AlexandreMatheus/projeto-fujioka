package br.com.alexandreccapi.AlexandreProjetoApi.Repository;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.ProjectHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {


}
