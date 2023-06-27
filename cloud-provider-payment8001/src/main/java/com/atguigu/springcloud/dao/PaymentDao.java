package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @ClassName: PaymentDao
 * @Author: zxy
 * @Date: 2023/6/15 17:25
 */
@Mapper
public interface PaymentDao {

    int insertId(Payment payment);

    Payment queryById(@Param("id") Long id);

}
