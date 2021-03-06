package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;

import java.util.List;
import java.util.Locale;


/**
 * 商品三级分类
 *
 * @author hxj
 * @email lfy@atguigu.com
 * @date 2019-08-01 19:49:22
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

    List<CategoryEntity> getCategoryByLevel(Integer level);
}

