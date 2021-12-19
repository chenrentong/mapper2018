package com.atguigu.mapper.services;

import com.atguigu.mapper.entities.Employee;
import com.atguigu.mapper.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrentong
 * @create 2021-12-19 12:32
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    public void batchUpdateEmp(List<Employee> empList) {
        employeeMapper.batchUpdate(empList);
    }
}
