package com.entity.model;

import com.entity.RemenjingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Popular Sites
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class RemenjingdianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Image
	 */
	
	private String tupian;
		
	/**
	 * Level
	 */
	
	private String dengji;
		
	/**
	 * Type
	 */
	
	private String jingdianleixing;
		
	/**
	 * Opening Time
	 */
	
	private String kaifangshijian;
		
	/**
	 * Tickets Price
	 */
	
	private Float menpiaojiage;
		
	/**
	 * Number
	 */
	
	private Integer shuliang;
		
	/**
	 * Location
	 */
	
	private String jingdianweizhi;
		
	/**
	 * Notice
	 */
	
	private String goupiaoxuzhi;
		
	/**
	 * Tips
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：Image
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：Image
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：Level
	 */
	 
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	
	/**
	 * 获取：Level
	 */
	public String getDengji() {
		return dengji;
	}
				
	
	/**
	 * 设置：Type
	 */
	 
	public void setJingdianleixing(String jingdianleixing) {
		this.jingdianleixing = jingdianleixing;
	}
	
	/**
	 * 获取：Type
	 */
	public String getJingdianleixing() {
		return jingdianleixing;
	}
				
	
	/**
	 * 设置：Opening Time
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：Opening Time
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：Tickets Price
	 */
	 
	public void setMenpiaojiage(Float menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	
	/**
	 * 获取：Tickets Price
	 */
	public Float getMenpiaojiage() {
		return menpiaojiage;
	}
				
	
	/**
	 * 设置：Number
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：Number
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：Location
	 */
	 
	public void setJingdianweizhi(String jingdianweizhi) {
		this.jingdianweizhi = jingdianweizhi;
	}
	
	/**
	 * 获取：Location
	 */
	public String getJingdianweizhi() {
		return jingdianweizhi;
	}
				
	
	/**
	 * 设置：Notice
	 */
	 
	public void setGoupiaoxuzhi(String goupiaoxuzhi) {
		this.goupiaoxuzhi = goupiaoxuzhi;
	}
	
	/**
	 * 获取：Notice
	 */
	public String getGoupiaoxuzhi() {
		return goupiaoxuzhi;
	}
				
	
	/**
	 * 设置：Tips
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：Tips
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
