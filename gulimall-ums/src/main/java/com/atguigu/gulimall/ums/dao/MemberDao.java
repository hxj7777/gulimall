package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hxj
 * @email hxj@atguigu.com
 * @date 2019-08-01 23:57:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
