package com.entity.vo;

import com.entity.QiuduizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Teams
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class QiuduizhuanquVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Cover
	 */
	
	private String qiuduifengmian;
		
	/**
	 * Documentary
	 */
	
	private String jilupian;
		
	/**
	 * Head Coach
	 */
	
	private String zhujiaolian;
		
	/**
	 * Records
	 */
	
	private String qiuduizhanji;
		
	/**
	 * Recent Schedule
	 */
	
	private String jinqisaicheng;
		
	/**
	 * List
	 */
	
	private String qiuyuanmingdan;
		
	/**
	 * Team History
	 */
	
	private String qiuduilishi;
		
	/**
	 * Update time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：Cover
	 */
	 
	public void setQiuduifengmian(String qiuduifengmian) {
		this.qiuduifengmian = qiuduifengmian;
	}
	
	/**
	 * 获取：Cover
	 */
	public String getQiuduifengmian() {
		return qiuduifengmian;
	}
				
	
	/**
	 * 设置：Documentary
	 */
	 
	public void setJilupian(String jilupian) {
		this.jilupian = jilupian;
	}
	
	/**
	 * 获取：Documentary
	 */
	public String getJilupian() {
		return jilupian;
	}
				
	
	/**
	 * 设置：Head Coach
	 */
	 
	public void setZhujiaolian(String zhujiaolian) {
		this.zhujiaolian = zhujiaolian;
	}
	
	/**
	 * 获取：Head Coach
	 */
	public String getZhujiaolian() {
		return zhujiaolian;
	}
				
	
	/**
	 * 设置：Records
	 */
	 
	public void setQiuduizhanji(String qiuduizhanji) {
		this.qiuduizhanji = qiuduizhanji;
	}
	
	/**
	 * 获取：Records
	 */
	public String getQiuduizhanji() {
		return qiuduizhanji;
	}
				
	
	/**
	 * 设置：Recent Schedule
	 */
	 
	public void setJinqisaicheng(String jinqisaicheng) {
		this.jinqisaicheng = jinqisaicheng;
	}
	
	/**
	 * 获取：Recent Schedule
	 */
	public String getJinqisaicheng() {
		return jinqisaicheng;
	}
				
	
	/**
	 * 设置：List
	 */
	 
	public void setQiuyuanmingdan(String qiuyuanmingdan) {
		this.qiuyuanmingdan = qiuyuanmingdan;
	}
	
	/**
	 * 获取：List
	 */
	public String getQiuyuanmingdan() {
		return qiuyuanmingdan;
	}
				
	
	/**
	 * 设置：Team History
	 */
	 
	public void setQiuduilishi(String qiuduilishi) {
		this.qiuduilishi = qiuduilishi;
	}
	
	/**
	 * 获取：Team History
	 */
	public String getQiuduilishi() {
		return qiuduilishi;
	}
				
	
	/**
	 * 设置：Update time
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：Update time
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
