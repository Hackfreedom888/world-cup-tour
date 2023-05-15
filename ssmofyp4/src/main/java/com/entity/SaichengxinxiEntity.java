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
 * Schedule info
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("saichengxinxi")
public class SaichengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaichengxinxiEntity() {
		
	}
	
	public SaichengxinxiEntity(T t) {
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
					
	private String saishimingcheng;
	
	/**
	 * Cover
	 */
					
	private String fengmiantupian;
	
	/**
	 * State
	 */
					
	private String zhuangtai;
	
	/**
	 * Round
	 */
					
	private String lunci;
	
	/**
	 * Home
	 */
					
	private String zhudui;
	
	/**
	 * Away
	 */
					
	private String kedui;
	
	/**
	 * Venue
	 */
					
	private String saishididian;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date bisaishijian;
	
	
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
	public void setSaishimingcheng(String saishimingcheng) {
		this.saishimingcheng = saishimingcheng;
	}
	/**
	 * 获取：Name
	 */
	public String getSaishimingcheng() {
		return saishimingcheng;
	}
	/**
	 * 设置：Cover
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：Cover
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：State
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：State
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：Round
	 */
	public void setLunci(String lunci) {
		this.lunci = lunci;
	}
	/**
	 * 获取：Round
	 */
	public String getLunci() {
		return lunci;
	}
	/**
	 * 设置：Home
	 */
	public void setZhudui(String zhudui) {
		this.zhudui = zhudui;
	}
	/**
	 * 获取：Home
	 */
	public String getZhudui() {
		return zhudui;
	}
	/**
	 * 设置：Away
	 */
	public void setKedui(String kedui) {
		this.kedui = kedui;
	}
	/**
	 * 获取：Away
	 */
	public String getKedui() {
		return kedui;
	}
	/**
	 * 设置：Venue
	 */
	public void setSaishididian(String saishididian) {
		this.saishididian = saishididian;
	}
	/**
	 * 获取：Venue
	 */
	public String getSaishididian() {
		return saishididian;
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

}
