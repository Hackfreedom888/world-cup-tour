package com.entity.vo;

import com.entity.ZaixianshoupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Online Tickets
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class ZaixianshoupiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Name
	 */
	
	private String qiupiaomingcheng;
		
	/**
	 * Cover
	 */
	
	private String fengmian;
		
	/**
	 * Home
	 */
	
	private String zhuchangqiudui;
		
	/**
	 * Away
	 */
	
	private String kechangqiudui;
		
	/**
	 * Venue
	 */
	
	private String bisaididian;
		
	/**
	 * Time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bisaishijian;
		
	/**
	 * Introduction
	 */
	
	private String saishijieshao;
		
	/**
	 * Price
	 */
	
	private Float price;
		
	/**
	 * Seats
	 */
	
	private Integer number;
		
	/**
	 * Selected
	 */
	
	private String selected;
				
	
	/**
	 * 设置：Name
	 */
	 
	public void setQiupiaomingcheng(String qiupiaomingcheng) {
		this.qiupiaomingcheng = qiupiaomingcheng;
	}
	
	/**
	 * 获取：Name
	 */
	public String getQiupiaomingcheng() {
		return qiupiaomingcheng;
	}
				
	
	/**
	 * 设置：Cover
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：Cover
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：Home
	 */
	 
	public void setZhuchangqiudui(String zhuchangqiudui) {
		this.zhuchangqiudui = zhuchangqiudui;
	}
	
	/**
	 * 获取：Home
	 */
	public String getZhuchangqiudui() {
		return zhuchangqiudui;
	}
				
	
	/**
	 * 设置：Away
	 */
	 
	public void setKechangqiudui(String kechangqiudui) {
		this.kechangqiudui = kechangqiudui;
	}
	
	/**
	 * 获取：Away
	 */
	public String getKechangqiudui() {
		return kechangqiudui;
	}
				
	
	/**
	 * 设置：Venue
	 */
	 
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	
	/**
	 * 获取：Venue
	 */
	public String getBisaididian() {
		return bisaididian;
	}
				
	
	/**
	 * 设置：Time
	 */
	 
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	
	/**
	 * 获取：Time
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
				
	
	/**
	 * 设置：Introduction
	 */
	 
	public void setSaishijieshao(String saishijieshao) {
		this.saishijieshao = saishijieshao;
	}
	
	/**
	 * 获取：Introduction
	 */
	public String getSaishijieshao() {
		return saishijieshao;
	}
				
	
	/**
	 * 设置：Price
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：Price
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：Seats
	 */
	 
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	/**
	 * 获取：Seats
	 */
	public Integer getNumber() {
		return number;
	}
				
	
	/**
	 * 设置：Selected
	 */
	 
	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	/**
	 * 获取：Selected
	 */
	public String getSelected() {
		return selected;
	}
			
}
