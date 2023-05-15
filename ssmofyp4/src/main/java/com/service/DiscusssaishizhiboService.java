package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssaishizhiboEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssaishizhiboVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssaishizhiboView;


/**
 * Hot评论表
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusssaishizhiboService extends IService<DiscusssaishizhiboEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssaishizhiboVO> selectListVO(Wrapper<DiscusssaishizhiboEntity> wrapper);
   	
   	DiscusssaishizhiboVO selectVO(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
   	
   	List<DiscusssaishizhiboView> selectListView(Wrapper<DiscusssaishizhiboEntity> wrapper);
   	
   	DiscusssaishizhiboView selectView(@Param("ew") Wrapper<DiscusssaishizhiboEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssaishizhiboEntity> wrapper);
   	

}

