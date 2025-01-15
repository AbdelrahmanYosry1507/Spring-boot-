package com.example.newSection13.controller;

import com.example.newSection13.model.dto.EmployeeDTO;
import com.example.newSection13.model.dto.EmployeeReqDTO;
import com.example.newSection13.model.dto.EmployeeResDTO;
import com.example.newSection13.model.dto.UpdateEmployeeReqDTO;
import com.example.newSection13.model.enitity.Employee;
import com.example.newSection13.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("get-employee")
    public String getEmployee(){
        return "employee";
    }
    @GetMapping("get-employee-RequestParam")
    public String getEmployeeByPathParam(@RequestParam(name = "username") String username){
        return username;
    }
    @PostMapping("save")
    public EmployeeResDTO save(@RequestBody @Valid EmployeeReqDTO dto){
        return this.employeeService.save(dto);
    }
    @PostMapping("update")
    public EmployeeResDTO update(@RequestBody UpdateEmployeeReqDTO dto) {
        return this.employeeService.update(dto);
    }
    @GetMapping("deleteById")
    public void deleteById(@RequestParam Long Id) {
        this.employeeService.delete(Id);
    }
    @GetMapping("get")
    public EmployeeDTO get(@RequestParam Long Id) {
        return this.employeeService.get(Id);
    }

}
