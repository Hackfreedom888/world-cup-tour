package com.dao;

import com.entity.QiuduizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuduizhuanquVO;
import com.entity.view.QiuduizhuanquView;


/**
 * Teams
 * 
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface QiuduizhuanquDao extends BaseMapper<QiuduizhuanquEntity> {
	
	List<QiuduizhuanquVO> selectListVO(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
	
	QiuduizhuanquVO selectVO(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
	
	List<QiuduizhuanquView> selectListView(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);

	List<QiuduizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
	
	QiuduizhuanquView selectView(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
	

}
