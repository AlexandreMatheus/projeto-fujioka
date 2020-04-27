package br.com.alexandreccapi.AlexandreProjetoApi.Repository;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
