package br.com.alexandreccapi.AlexandreProjetoApi.Services;

import br.com.alexandreccapi.AlexandreProjetoApi.Domain.Department;
import br.com.alexandreccapi.AlexandreProjetoApi.Repository.DepartmentRepository;
import br.com.alexandreccapi.AlexandreProjetoApi.Services.Dto.DepartmentDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentDTO getDepartmentById(Long id) throws NotFoundException {
        Optional<Department> department = departmentRepository.findById(id);

        if (!department.isPresent()) {
            throw new NotFoundException("department not found!");
        }

        return new DepartmentDTO(department.get());
    }

    public List<DepartmentDTO> getDepartments(){
        return new ArrayList<DepartmentDTO>(DepartmentDTO.converter(departmentRepository.findAll()));
    }

}
