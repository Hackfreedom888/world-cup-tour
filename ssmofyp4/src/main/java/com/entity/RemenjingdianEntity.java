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
 * Popular Sites
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("remenjingdian")
public class RemenjingdianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RemenjingdianEntity() {
		
	}
	
	public RemenjingdianEntity(T t) {
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
	 * Name
	 */
					
	private String jingdianmingcheng;
	
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
	 * 设置：Name
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：Name
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
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
