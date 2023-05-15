package com.dao;

import com.entity.JiudianyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianyudingVO;
import com.entity.view.JiudianyudingView;


/**
 * Hotel Order
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface JiudianyudingDao extends BaseMapper<JiudianyudingEntity> {
	
	List<JiudianyudingVO> selectListVO(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	JiudianyudingVO selectVO(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	List<JiudianyudingView> selectListView(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);

	List<JiudianyudingView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	
	JiudianyudingView selectView(@Param("ew") Wrapper<JiudianyudingEntity> wrapper);
	

}
