package com.dao;

import com.entity.ZuqiuzhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuqiuzhoubianVO;
import com.entity.view.ZuqiuzhoubianView;


/**
 * Merchants
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface ZuqiuzhoubianDao extends BaseMapper<ZuqiuzhoubianEntity> {
	
	List<ZuqiuzhoubianVO> selectListVO(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	ZuqiuzhoubianVO selectVO(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	List<ZuqiuzhoubianView> selectListView(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);

	List<ZuqiuzhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	
	ZuqiuzhoubianView selectView(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
	

}
