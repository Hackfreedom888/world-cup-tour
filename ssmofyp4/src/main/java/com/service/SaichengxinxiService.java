package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaichengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaichengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaichengxinxiView;


/**
 * Schedule info
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface SaichengxinxiService extends IService<SaichengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaichengxinxiVO> selectListVO(Wrapper<SaichengxinxiEntity> wrapper);
   	
   	SaichengxinxiVO selectVO(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
   	
   	List<SaichengxinxiView> selectListView(Wrapper<SaichengxinxiEntity> wrapper);
   	
   	SaichengxinxiView selectView(@Param("ew") Wrapper<SaichengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaichengxinxiEntity> wrapper);
   	

}

