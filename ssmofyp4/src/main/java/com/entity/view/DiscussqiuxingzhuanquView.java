package com.entity.view;

import com.entity.DiscussqiuxingzhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * Stars评论表
 * 后端Return视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要Return使用）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
@TableName("discussqiuxingzhuanqu")
public class DiscussqiuxingzhuanquView  extends DiscussqiuxingzhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussqiuxingzhuanquView(){
	}
 
 	public DiscussqiuxingzhuanquView(DiscussqiuxingzhuanquEntity discussqiuxingzhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, discussqiuxingzhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
