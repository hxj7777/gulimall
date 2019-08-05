package com.atguigu.gulimall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 订单
 *
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

