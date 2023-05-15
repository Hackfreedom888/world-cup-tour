package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * Online Tickets
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("zaixianshoupiao")
public class ZaixianshoupiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZaixianshoupiaoEntity() {
		
	}
	
	public ZaixianshoupiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * ID
	 */
					
	private String changcibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：ID
	 */
	public void setChangcibianhao(String changcibianhao) {
		this.changcibianhao = changcibianhao;
	}
	/**
	 * 获取：ID
	 */
	public String getChangcibianhao() {
		return changcibianhao;
	}
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
