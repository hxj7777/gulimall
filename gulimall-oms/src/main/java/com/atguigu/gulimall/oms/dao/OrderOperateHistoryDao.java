package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
