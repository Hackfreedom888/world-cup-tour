package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuqiuzhoubianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuqiuzhoubianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuqiuzhoubianView;


/**
 * Merchants评论表
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscusszuqiuzhoubianService extends IService<DiscusszuqiuzhoubianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuqiuzhoubianVO> selectListVO(Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
   	
   	DiscusszuqiuzhoubianVO selectVO(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
   	
   	List<DiscusszuqiuzhoubianView> selectListView(Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
   	
   	DiscusszuqiuzhoubianView selectView(@Param("ew") Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuqiuzhoubianEntity> wrapper);
   	

}

