package com.dao;

import com.entity.SaichengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaichengxinxiVO;
import com.entity.view.SaichengxinxiView;


/**
 * Schedule info
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface SaichengxinxiDao extends BaseMapper<SaichengxinxiEntity> {
	
	List<SaichengxinxiVO> selectListVO(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
	
	SaichengxinxiVO selectVO(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
	
	List<SaichengxinxiView> selectListView(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);

	List<SaichengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
	
	SaichengxinxiView selectView(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
	

}
