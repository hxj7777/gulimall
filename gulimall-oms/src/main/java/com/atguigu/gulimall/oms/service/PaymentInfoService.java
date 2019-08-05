package com.atguigu.gulimall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.oms.entity.PaymentInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

