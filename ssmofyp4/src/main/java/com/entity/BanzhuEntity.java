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
 * Moderator
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("banzhu")
public class BanzhuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanzhuEntity() {
		
	}
	
	public BanzhuEntity(T t) {
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
					
	private String banzhuzhanghao;
	
	/**
	 * Password
	 */
					
	private String mima;
	
	/**
	 * Name
	 */
					
	private String banzhuxingming;
	
	/**
	 * Image
	 */
					
	private String touxiang;
	
	/**
	 * Telephone
	 */
					
	private String lianxifangshi;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chuangjianshijian;
	
	/**
	 * 余额
	 */
					
	private Float money;
	
	
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
	public void setBanzhuzhanghao(String banzhuzhanghao) {
		this.banzhuzhanghao = banzhuzhanghao;
	}
	/**
	 * 获取：Account
	 */
	public String getBanzhuzhanghao() {
		return banzhuzhanghao;
	}
	/**
	 * 设置：Password
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：Password
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：Name
	 */
	public void setBanzhuxingming(String banzhuxingming) {
		this.banzhuxingming = banzhuxingming;
	}
	/**
	 * 获取：Name
	 */
	public String getBanzhuxingming() {
		return banzhuxingming;
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
	 * 设置：Time
	 */
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	/**
	 * 获取：Time
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
	/**
	 * 设置：余额
	 */
	public void setMoney(Float money) {
		this.money = money;
	}
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}

}
