package br.com.alexandreccapi.AlexandreProjetoApi.Repository;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
