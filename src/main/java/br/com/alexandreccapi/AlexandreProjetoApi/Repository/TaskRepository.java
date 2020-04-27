package br.com.alexandreccapi.AlexandreProjetoApi.Repository;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStartDateBetween(Date anoInicial, Date anoFinal);

    List<Task> findByStartDateBetweenAndStatus(Date anoInicial, Date anoFinal, Long status);

    List<Task> findByTaskPointsBetween(Long pontoInicial, Long pontoFinal);
}
