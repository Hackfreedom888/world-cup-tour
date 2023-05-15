package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuxingzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuxingzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuxingzhuanquView;


/**
 * Stars
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface QiuxingzhuanquService extends IService<QiuxingzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuxingzhuanquVO> selectListVO(Wrapper<QiuxingzhuanquEntity> wrapper);
   	
   	QiuxingzhuanquVO selectVO(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
   	
   	List<QiuxingzhuanquView> selectListView(Wrapper<QiuxingzhuanquEntity> wrapper);
   	
   	QiuxingzhuanquView selectView(@Param("ew") Wrapper<QiuxingzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuxingzhuanquEntity> wrapper);
   	

}

