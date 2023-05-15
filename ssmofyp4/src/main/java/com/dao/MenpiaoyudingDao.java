package com.dao;

import com.entity.MenpiaoyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenpiaoyudingVO;
import com.entity.view.MenpiaoyudingView;


/**
 * Tickets Order
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface MenpiaoyudingDao extends BaseMapper<MenpiaoyudingEntity> {
	
	List<MenpiaoyudingVO> selectListVO(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
	
	MenpiaoyudingVO selectVO(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
	
	List<MenpiaoyudingView> selectListView(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);

	List<MenpiaoyudingView> selectListView(Pagination page,@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
	
	MenpiaoyudingView selectView(@Param("ew") Wrapper<MenpiaoyudingEntity> wrapper);
	

}
