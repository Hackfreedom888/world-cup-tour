package com.dao;

import com.entity.DiscusssaishizhiboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssaishizhiboVO;
import com.entity.view.DiscusssaishizhiboView;


/**
 * Hot评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusssaishizhiboDao extends BaseMapper<DiscusssaishizhiboEntity> {
	
	List<DiscusssaishizhiboVO> selectListVO(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
	
	DiscusssaishizhiboVO selectVO(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
	
	List<DiscusssaishizhiboView> selectListView(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);

	List<DiscusssaishizhiboView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
	
	DiscusssaishizhiboView selectView(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
	

}
