package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuduizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuduizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuduizhuanquView;


/**
 * Teams评论表
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public interface DiscussqiuduizhuanquService extends IService<DiscussqiuduizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuduizhuanquVO> selectListVO(Wrapper<DiscussqiuduizhuanquEntity> wrapper);
   	
   	DiscussqiuduizhuanquVO selectVO(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
   	
   	List<DiscussqiuduizhuanquView> selectListView(Wrapper<DiscussqiuduizhuanquEntity> wrapper);
   	
   	DiscussqiuduizhuanquView selectView(@Param("ew") Wrapper<DiscussqiuduizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuduizhuanquEntity> wrapper);
   	

}

