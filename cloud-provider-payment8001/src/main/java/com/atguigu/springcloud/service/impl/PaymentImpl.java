package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 支付实现类
 * @ClassName: PaymentImpl
 * @Author: zxy
 * @Date: 2023/6/15 17:51
 */
@Service
public class PaymentImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public int insertId(Payment payment) {

        return paymentDao.insertId(payment);
    }

    @Override
    public Payment queryById(Long id) {
        return paymentDao.queryById(id);
    }
}
