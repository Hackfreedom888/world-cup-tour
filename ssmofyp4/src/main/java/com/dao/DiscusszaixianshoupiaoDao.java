package com.dao;

import com.entity.DiscusszaixianshoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixianshoupiaoVO;
import com.entity.view.DiscusszaixianshoupiaoView;


/**
 * Online Tickets评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusszaixianshoupiaoDao extends BaseMapper<DiscusszaixianshoupiaoEntity> {
	
	List<DiscusszaixianshoupiaoVO> selectListVO(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
	
	DiscusszaixianshoupiaoVO selectVO(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
	
	List<DiscusszaixianshoupiaoView> selectListView(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);

	List<DiscusszaixianshoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
	
	DiscusszaixianshoupiaoView selectView(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
	

}
