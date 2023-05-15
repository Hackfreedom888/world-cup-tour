package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixianshoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixianshoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixianshoupiaoView;


/**
 * Online Tickets评论表
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusszaixianshoupiaoService extends IService<DiscusszaixianshoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixianshoupiaoVO> selectListVO(Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
   	
   	DiscusszaixianshoupiaoVO selectVO(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
   	
   	List<DiscusszaixianshoupiaoView> selectListView(Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
   	
   	DiscusszaixianshoupiaoView selectView(@Param("ew") Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixianshoupiaoEntity> wrapper);
   	

}

