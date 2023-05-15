package com.entity.view;

import com.entity.MenpiaoyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * Tickets Order
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("menpiaoyuding")
public class MenpiaoyudingView  extends MenpiaoyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenpiaoyudingView(){
	}
 
 	public MenpiaoyudingView(MenpiaoyudingEntity menpiaoyudingEntity){
 	try {
			BeanUtils.copyProperties(this, menpiaoyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
