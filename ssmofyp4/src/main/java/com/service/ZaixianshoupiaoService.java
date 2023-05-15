package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixianshoupiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixianshoupiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixianshoupiaoView;


/**
 * Online Tickets
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface ZaixianshoupiaoService extends IService<ZaixianshoupiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixianshoupiaoVO> selectListVO(Wrapper<ZaixianshoupiaoEntity> wrapper);
   	
   	ZaixianshoupiaoVO selectVO(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
   	
   	List<ZaixianshoupiaoView> selectListView(Wrapper<ZaixianshoupiaoEntity> wrapper);
   	
   	ZaixianshoupiaoView selectView(@Param("ew") Wrapper<ZaixianshoupiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixianshoupiaoEntity> wrapper);
   	

}

