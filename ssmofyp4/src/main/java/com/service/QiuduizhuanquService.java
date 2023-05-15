package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuduizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuduizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuduizhuanquView;


/**
 * Teams
 *
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public interface QiuduizhuanquService extends IService<QiuduizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuduizhuanquVO> selectListVO(Wrapper<QiuduizhuanquEntity> wrapper);
   	
   	QiuduizhuanquVO selectVO(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
   	
   	List<QiuduizhuanquView> selectListView(Wrapper<QiuduizhuanquEntity> wrapper);
   	
   	QiuduizhuanquView selectView(@Param("ew") Wrapper<QiuduizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuduizhuanquEntity> wrapper);
   	

}

