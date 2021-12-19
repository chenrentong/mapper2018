package com.atguigu.mapper.services;

import com.atguigu.mapper.mappers.EmployeeMapper;
import com.atguigu.mapper.entities.Employee;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author chenrentong
 * @create 2021-12-19 12:32
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getOne(Employee employeeQueryCondition) {

        return employeeMapper.selectOne(employeeQueryCondition);
    }

    public Employee getEmployeeById(Integer empId) {
        return employeeMapper.selectByPrimaryKey(empId);
    }

    public boolean isExists(Integer empId) {
        return employeeMapper.existsWithPrimaryKey(empId);
    }

    public void saveEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void saveEmployeeSelective(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    public void updateEmployeeSelective(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeMapper.delete(employee);
    }

    public void removeEmployeeById(Integer empId) {
        employeeMapper.deleteByPrimaryKey(empId);
    }

    public List<Employee> getEmpListByExample(Example example) {
        return employeeMapper.selectByExample(example);
    }

    public List<Employee> getEmpListByRowBounds(RowBounds rowBounds) {
        return employeeMapper.selectByRowBounds(null, rowBounds);
    }
}
