package com.atguigu.mapper.test;

import com.atguigu.mapper.entities.Employee;
import com.atguigu.mapper.services.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author chenrentong
 * @create 2021-12-19 21:17
 */
public class MyMapperTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        List<Employee> empList = employeeService.getAll();
        for (Employee employee : empList) {
            System.out.println(employee);
        }

        context.close();
    }
}
