package com.shanghai.bank.modules.integral.dao;

import com.shanghai.bank.modules.integral.entity.Integral;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 14:11
 */
@Mapper
public interface IntegralDao {

    /**
     * 通过ID查找
     * @param id
     * @return
     */
    Integral getById(Integer id);
}
