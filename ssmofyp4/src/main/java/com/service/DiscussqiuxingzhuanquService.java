package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuxingzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuxingzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuxingzhuanquView;


/**
 * Stars评论表
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscussqiuxingzhuanquService extends IService<DiscussqiuxingzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuxingzhuanquVO> selectListVO(Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
   	
   	DiscussqiuxingzhuanquVO selectVO(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
   	
   	List<DiscussqiuxingzhuanquView> selectListView(Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
   	
   	DiscussqiuxingzhuanquView selectView(@Param("ew") Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuxingzhuanquEntity> wrapper);
   	

}

