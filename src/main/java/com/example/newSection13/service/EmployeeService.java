package com.example.newSection13.service;

import com.example.newSection13.model.dto.EmployeeDTO;
import com.example.newSection13.model.dto.EmployeeReqDTO;
import com.example.newSection13.model.dto.EmployeeResDTO;
import com.example.newSection13.model.dto.UpdateEmployeeReqDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {
    public EmployeeResDTO save(EmployeeReqDTO dto);
    public EmployeeResDTO update(UpdateEmployeeReqDTO dto);
    public void delete(Long Id);
    public EmployeeDTO get(Long Id);
}
