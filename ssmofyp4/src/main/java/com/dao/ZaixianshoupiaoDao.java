package com.dao;

import com.entity.ZaixianshoupiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixianshoupiaoVO;
import com.entity.view.ZaixianshoupiaoView;


/**
 * Online Tickets
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface ZaixianshoupiaoDao extends BaseMapper<ZaixianshoupiaoEntity> {
	
	List<ZaixianshoupiaoVO> selectListVO(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
	
	ZaixianshoupiaoVO selectVO(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
	
	List<ZaixianshoupiaoView> selectListView(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);

	List<ZaixianshoupiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
	
	ZaixianshoupiaoView selectView(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
	

}
