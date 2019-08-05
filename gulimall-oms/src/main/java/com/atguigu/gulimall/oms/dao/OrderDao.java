package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
