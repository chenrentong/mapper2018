package com.atguigu.mapper.mine;

import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @author chenrentong
 * @create 2021-12-19 21:54
 */
public interface MyBatchUpdateMapper<T> {

    @UpdateProvider(type=MyBatchUpdateProvider.class, method="dynamicSQL")
    void batchUpdate(List<T> list);
}
