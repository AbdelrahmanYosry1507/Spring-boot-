package com.example.newSection13.model.mapper;

import com.example.newSection13.model.dto.EmployeeDTO;
import com.example.newSection13.model.dto.EmployeeReqDTO;
import com.example.newSection13.model.dto.EmployeeResDTO;
import com.example.newSection13.model.dto.UpdateEmployeeReqDTO;
import com.example.newSection13.model.enitity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity(EmployeeReqDTO employeeReqDTO);
    Employee toEntity(EmployeeResDTO employeeResDTO);
    Employee toEntity(UpdateEmployeeReqDTO updateEmployeeReqDTO);
    EmployeeResDTO toRespDTO(Employee employee);
    public EmployeeDTO toDTO(Employee entity);
}
