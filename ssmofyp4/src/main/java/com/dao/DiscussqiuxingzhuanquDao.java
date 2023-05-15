package com.dao;

import com.entity.DiscussqiuxingzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuxingzhuanquVO;
import com.entity.view.DiscussqiuxingzhuanquView;


/**
 * Stars评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscussqiuxingzhuanquDao extends BaseMapper<DiscussqiuxingzhuanquEntity> {
	
	List<DiscussqiuxingzhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
	
	DiscussqiuxingzhuanquVO selectVO(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
	
	List<DiscussqiuxingzhuanquView> selectListView(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);

	List<DiscussqiuxingzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
	
	DiscussqiuxingzhuanquView selectView(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
	

}
