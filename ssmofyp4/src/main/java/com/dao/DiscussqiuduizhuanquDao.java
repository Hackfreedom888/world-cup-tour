package com.dao;

import com.entity.DiscussqiuduizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuduizhuanquVO;
import com.entity.view.DiscussqiuduizhuanquView;


/**
 * Teams评论表
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscussqiuduizhuanquDao extends BaseMapper<DiscussqiuduizhuanquEntity> {
	
	List<DiscussqiuduizhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
	
	DiscussqiuduizhuanquVO selectVO(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
	
	List<DiscussqiuduizhuanquView> selectListView(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);

	List<DiscussqiuduizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
	
	DiscussqiuduizhuanquView selectView(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
	

}
