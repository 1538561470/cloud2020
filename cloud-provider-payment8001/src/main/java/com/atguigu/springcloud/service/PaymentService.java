package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 支付接口
 * @ClassName: PaymentService
 * @Author: zxy
 * @Date: 2023/6/15 17:50
 */
public interface PaymentService {
    int insertId(Payment payment);

    Payment queryById(@Param("id") Long id);
}
