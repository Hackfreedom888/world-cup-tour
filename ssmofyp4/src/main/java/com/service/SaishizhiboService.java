package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishizhiboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishizhiboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishizhiboView;


/**
 * Hot
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface SaishizhiboService extends IService<SaishizhiboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishizhiboVO> selectListVO(Wrapper<SaishizhiboEntity> wrapper);
   	
   	SaishizhiboVO selectVO(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
   	
   	List<SaishizhiboView> selectListView(Wrapper<SaishizhiboEntity> wrapper);
   	
   	SaishizhiboView selectView(@Param("ew") Wrapper<SaishizhiboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishizhiboEntity> wrapper);
   	

}

