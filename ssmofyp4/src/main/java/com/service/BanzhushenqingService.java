package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanzhushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanzhushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzhushenqingView;


/**
 * Moderator application
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface BanzhushenqingService extends IService<BanzhushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanzhushenqingVO> selectListVO(Wrapper<BanzhushenqingEntity> wrapper);
   	
   	BanzhushenqingVO selectVO(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
   	
   	List<BanzhushenqingView> selectListView(Wrapper<BanzhushenqingEntity> wrapper);
   	
   	BanzhushenqingView selectView(@Param("ew") Wrapper<BanzhushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanzhushenqingEntity> wrapper);
   	

}

