package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuqiuzhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuqiuzhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuqiuzhoubianView;


/**
 * Merchants
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface ZuqiuzhoubianService extends IService<ZuqiuzhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuqiuzhoubianVO> selectListVO(Wrapper<ZuqiuzhoubianEntity> wrapper);
   	
   	ZuqiuzhoubianVO selectVO(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
   	
   	List<ZuqiuzhoubianView> selectListView(Wrapper<ZuqiuzhoubianEntity> wrapper);
   	
   	ZuqiuzhoubianView selectView(@Param("ew") Wrapper<ZuqiuzhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuqiuzhoubianEntity> wrapper);
   	

}

