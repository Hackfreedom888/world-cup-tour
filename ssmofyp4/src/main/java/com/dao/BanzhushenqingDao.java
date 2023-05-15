package com.dao;

import com.entity.BanzhushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanzhushenqingVO;
import com.entity.view.BanzhushenqingView;


/**
 * Moderator application
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface BanzhushenqingDao extends BaseMapper<BanzhushenqingEntity> {
	
	List<BanzhushenqingVO> selectListVO(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
	
	BanzhushenqingVO selectVO(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
	
	List<BanzhushenqingView> selectListView(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);

	List<BanzhushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
	
	BanzhushenqingView selectView(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
	

}
