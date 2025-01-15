package com.example.newSection13.service.Impl;

import com.example.newSection13.model.dto.EmployeeDTO;
import com.example.newSection13.model.dto.EmployeeReqDTO;
import com.example.newSection13.model.dto.EmployeeResDTO;
import com.example.newSection13.model.dto.UpdateEmployeeReqDTO;
import com.example.newSection13.model.enitity.Employee;
import com.example.newSection13.model.mapper.EmployeeMapper;
import com.example.newSection13.repository.EmployeeRepo;
import com.example.newSection13.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeRepo employeeRepo;
    public EmployeeResDTO save(@RequestBody EmployeeReqDTO dto){
        Employee employee = this.employeeMapper.toEntity(dto);
        employee.setCreatedAt(LocalDateTime.now());
        Employee savedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(savedEmployee);
    }

    @Override
    public EmployeeResDTO update(UpdateEmployeeReqDTO dto) {
        Employee employee = this.employeeMapper.toEntity(dto);
        employee.setUpdatedAt(LocalDateTime.now());
        Employee updatedEmployee = this.employeeRepo.save(employee);
        return this.employeeMapper.toRespDTO(updatedEmployee);
    }

    @Override
    public void delete(Long Id) {
        Optional<Employee> employee = this.employeeRepo.findById(Id);
        employee.get().setDeletedAt(LocalDateTime.now());
        this.employeeRepo.save(employee.get());
    }

    @Override
    public EmployeeDTO get(Long Id) {
        Optional<Employee> employee = this.employeeRepo.findById(Id);
        System.out.println(employee);
        System.out.println(employee.get());
        return this.employeeMapper.toDTO(employee.get());
    }
}
