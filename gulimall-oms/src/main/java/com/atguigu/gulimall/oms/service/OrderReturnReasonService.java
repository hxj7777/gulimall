package com.atguigu.gulimall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.oms.entity.OrderReturnReasonEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 退货原因
 *
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageVo queryPage(QueryCondition params);
}

