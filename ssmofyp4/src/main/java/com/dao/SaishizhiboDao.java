package com.dao;

import com.entity.SaishizhiboEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishizhiboVO;
import com.entity.view.SaishizhiboView;


/**
 * Hot
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface SaishizhiboDao extends BaseMapper<SaishizhiboEntity> {
	
	List<SaishizhiboVO> selectListVO(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
	
	SaishizhiboVO selectVO(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
	
	List<SaishizhiboView> selectListView(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);

	List<SaishizhiboView> selectListView(Pagination page,@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
	
	SaishizhiboView selectView(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
	

}
