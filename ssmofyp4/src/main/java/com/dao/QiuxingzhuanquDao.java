package com.dao;

import com.entity.QiuxingzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuxingzhuanquVO;
import com.entity.view.QiuxingzhuanquView;


/**
 * Stars
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface QiuxingzhuanquDao extends BaseMapper<QiuxingzhuanquEntity> {
	
	List<QiuxingzhuanquVO> selectListVO(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
	
	QiuxingzhuanquVO selectVO(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
	
	List<QiuxingzhuanquView> selectListView(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);

	List<QiuxingzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
	
	QiuxingzhuanquView selectView(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
	

}
