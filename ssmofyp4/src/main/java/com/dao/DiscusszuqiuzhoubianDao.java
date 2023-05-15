package com.dao;

import com.entity.DiscusszuqiuzhoubianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuqiuzhoubianVO;
import com.entity.view.DiscusszuqiuzhoubianView;


/**
 * Merchants评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusszuqiuzhoubianDao extends BaseMapper<DiscusszuqiuzhoubianEntity> {
	
	List<DiscusszuqiuzhoubianVO> selectListVO(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
	
	DiscusszuqiuzhoubianVO selectVO(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
	
	List<DiscusszuqiuzhoubianView> selectListView(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);

	List<DiscusszuqiuzhoubianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
	
	DiscusszuqiuzhoubianView selectView(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
	

}
