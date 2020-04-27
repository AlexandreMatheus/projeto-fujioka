package br.com.alexandreccapi.AlexandreProjetoApi.Services;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Person;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.PersonRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.PersonDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDTO getPersonById(Long id) throws NotFoundException {
        Optional<Person> person = personRepository.findById(id);

        if (!person.isPresent()) {
            throw new NotFoundException("department not found!");
        }

        return new PersonDTO(person.get());
    }

    public List<PersonDTO> getPersons(){
        return new ArrayList<PersonDTO>(PersonDTO.converter(personRepository.findAll()));
    }
}
