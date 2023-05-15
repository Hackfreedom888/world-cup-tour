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
 * Hotel Information
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("jiudianxinxi")
public class JiudianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudianxinxiEntity() {
		
	}
	
	public JiudianxinxiEntity(T t) {
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
					
	private String jiudianmingcheng;
	
	/**
	 * Image
	 */
					
	private String jiudiantupian;
	
	/**
	 * Type
	 */
					
	private String leibie;
	
	/**
	 * Star
	 */
					
	private String xingji;
	
	/**
	 * Room Type
	 */
					
	private String fangjianleixing;
	
	/**
	 * Address
	 */
					
	private String jiudiandizhi;
	
	/**
	 * Room Price
	 */
					
	private Float kefangjiage;
	
	/**
	 * Remaining
	 */
					
	private Integer kefangshuliang;
	
	/**
	 * Contact
	 */
					
	private String lianxidianhua;
	
	/**
	 * Introduction
	 */
					
	private String jiudianjieshao;
	
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
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：Name
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
	/**
	 * 设置：Image
	 */
	public void setJiudiantupian(String jiudiantupian) {
		this.jiudiantupian = jiudiantupian;
	}
	/**
	 * 获取：Image
	 */
	public String getJiudiantupian() {
		return jiudiantupian;
	}
	/**
	 * 设置：Type
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：Type
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：Star
	 */
	public void setXingji(String xingji) {
		this.xingji = xingji;
	}
	/**
	 * 获取：Star
	 */
	public String getXingji() {
		return xingji;
	}
	/**
	 * 设置：Room Type
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：Room Type
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：Address
	 */
	public void setJiudiandizhi(String jiudiandizhi) {
		this.jiudiandizhi = jiudiandizhi;
	}
	/**
	 * 获取：Address
	 */
	public String getJiudiandizhi() {
		return jiudiandizhi;
	}
	/**
	 * 设置：Room Price
	 */
	public void setKefangjiage(Float kefangjiage) {
		this.kefangjiage = kefangjiage;
	}
	/**
	 * 获取：Room Price
	 */
	public Float getKefangjiage() {
		return kefangjiage;
	}
	/**
	 * 设置：Remaining
	 */
	public void setKefangshuliang(Integer kefangshuliang) {
		this.kefangshuliang = kefangshuliang;
	}
	/**
	 * 获取：Remaining
	 */
	public Integer getKefangshuliang() {
		return kefangshuliang;
	}
	/**
	 * 设置：Contact
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：Contact
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：Introduction
	 */
	public void setJiudianjieshao(String jiudianjieshao) {
		this.jiudianjieshao = jiudianjieshao;
	}
	/**
	 * 获取：Introduction
	 */
	public String getJiudianjieshao() {
		return jiudianjieshao;
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
