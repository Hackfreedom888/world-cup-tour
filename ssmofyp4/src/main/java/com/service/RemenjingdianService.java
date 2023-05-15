package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenjingdianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenjingdianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenjingdianView;


/**
 * Popular Sites
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface RemenjingdianService extends IService<RemenjingdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenjingdianVO> selectListVO(Wrapper<RemenjingdianEntity> wrapper);
   	
   	RemenjingdianVO selectVO(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
   	
   	List<RemenjingdianView> selectListView(Wrapper<RemenjingdianEntity> wrapper);
   	
   	RemenjingdianView selectView(@Param("ew") Wrapper<RemenjingdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenjingdianEntity> wrapper);
   	

}

