package com.atguigu.mapper.mappers;

import com.atguigu.mapper.entities.Employee;
import com.atguigu.mapper.mine.MyMapper;
import org.apache.ibatis.annotations.CacheNamespace;

/**
 * @author chenrentong
 * @create 2021-12-19 12:30
 */
@CacheNamespace
public interface EmployeeMapper extends MyMapper<Employee> {
}
