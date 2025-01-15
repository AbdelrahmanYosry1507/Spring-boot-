package com.example.newSection13.model.mapper;

import com.example.newSection13.model.dto.EmployeeDTO;
import com.example.newSection13.model.dto.EmployeeReqDTO;
import com.example.newSection13.model.dto.EmployeeResDTO;
import com.example.newSection13.model.dto.UpdateEmployeeReqDTO;
import com.example.newSection13.model.enitity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-10T22:22:19+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeReqDTO employeeReqDTO) {
        if ( employeeReqDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.username( employeeReqDTO.getUsername() );
        employee.fullName( employeeReqDTO.getFullName() );
        employee.password( employeeReqDTO.getPassword() );
        employee.email( employeeReqDTO.getEmail() );

        return employee.build();
    }

    @Override
    public Employee toEntity(EmployeeResDTO employeeResDTO) {
        if ( employeeResDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.username( employeeResDTO.getUsername() );
        employee.fullName( employeeResDTO.getFullName() );
        employee.email( employeeResDTO.getEmail() );

        return employee.build();
    }

    @Override
    public Employee toEntity(UpdateEmployeeReqDTO updateEmployeeReqDTO) {
        if ( updateEmployeeReqDTO == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.Id( updateEmployeeReqDTO.Id );
        employee.fullName( updateEmployeeReqDTO.getFullName() );
        employee.password( updateEmployeeReqDTO.getPassword() );
        employee.email( updateEmployeeReqDTO.getEmail() );

        return employee.build();
    }

    @Override
    public EmployeeResDTO toRespDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeResDTO.EmployeeResDTOBuilder employeeResDTO = EmployeeResDTO.builder();

        employeeResDTO.username( employee.getUsername() );
        employeeResDTO.fullName( employee.getFullName() );
        employeeResDTO.email( employee.getEmail() );

        return employeeResDTO.build();
    }

    @Override
    public EmployeeDTO toDTO(Employee entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeDTO.EmployeeDTOBuilder employeeDTO = EmployeeDTO.builder();

        employeeDTO.username( entity.getUsername() );
        employeeDTO.fullName( entity.getFullName() );
        employeeDTO.password( entity.getPassword() );
        employeeDTO.email( entity.getEmail() );
        employeeDTO.createdAt( entity.getCreatedAt() );
        employeeDTO.updatedAt( entity.getUpdatedAt() );
        employeeDTO.deletedAt( entity.getDeletedAt() );

        return employeeDTO.build();
    }
}
