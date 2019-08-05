package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-02 16:06:36
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
