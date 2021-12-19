package com.atguigu.mapper.mine;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * @author chenrentong
 * @create 2021-12-19 18:10
 */
public interface MyMapper<T>
        extends SelectAllMapper<T>,SelectByExampleMapper<T>{


}
