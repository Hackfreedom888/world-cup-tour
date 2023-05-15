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
 * Moderator application
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("banzhushenqing")
public class BanzhushenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanzhushenqingEntity() {
		
	}
	
	public BanzhushenqingEntity(T t) {
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
	 * Account
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * Name
	 */
					
	private String yonghuxingming;
	
	/**
	 * Image
	 */
					
	private String touxiang;
	
	/**
	 * Telephone
	 */
					
	private String lianxifangshi;
	
	/**
	 * Favorite Star
	 */
					
	private String xihuanqiuxing;
	
	/**
	 * Favorite Team
	 */
					
	private String xihuanqiudui;
	
	/**
	 * 个人介绍
	 */
					
	private String gerenjieshao;
	
	/**
	 * 申请理由
	 */
					
	private String shenqingliyou;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * Reply
	 */
					
	private String shhf;
	
	
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
	 * 设置：Account
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：Account
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：Name
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：Name
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：Image
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：Image
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：Telephone
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：Telephone
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：Favorite Star
	 */
	public void setXihuanqiuxing(String xihuanqiuxing) {
		this.xihuanqiuxing = xihuanqiuxing;
	}
	/**
	 * 获取：Favorite Star
	 */
	public String getXihuanqiuxing() {
		return xihuanqiuxing;
	}
	/**
	 * 设置：Favorite Team
	 */
	public void setXihuanqiudui(String xihuanqiudui) {
		this.xihuanqiudui = xihuanqiudui;
	}
	/**
	 * 获取：Favorite Team
	 */
	public String getXihuanqiudui() {
		return xihuanqiudui;
	}
	/**
	 * 设置：个人介绍
	 */
	public void setGerenjieshao(String gerenjieshao) {
		this.gerenjieshao = gerenjieshao;
	}
	/**
	 * 获取：个人介绍
	 */
	public String getGerenjieshao() {
		return gerenjieshao;
	}
	/**
	 * 设置：申请理由
	 */
	public void setShenqingliyou(String shenqingliyou) {
		this.shenqingliyou = shenqingliyou;
	}
	/**
	 * 获取：申请理由
	 */
	public String getShenqingliyou() {
		return shenqingliyou;
	}
	/**
	 * 设置：Time
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：Time
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：Reply
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：Reply
	 */
	public String getShhf() {
		return shhf;
	}

}
