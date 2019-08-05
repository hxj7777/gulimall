package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
