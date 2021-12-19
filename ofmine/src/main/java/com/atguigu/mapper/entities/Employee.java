package com.atguigu.mapper.entities;


import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chenrentong
 * @create 2021-12-19 11:28
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tabple_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer empId;//emp_id

    private String empName;//emp_name

    //@Column(name="emp_salary_apple")
    private Double empSalary;//emp_salary_apple

    private Integer empAge;//emp_age
}
