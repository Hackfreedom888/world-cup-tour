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
 * Tickets Order
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("menpiaoyuding")
public class MenpiaoyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MenpiaoyudingEntity() {
		
	}
	
	public MenpiaoyudingEntity(T t) {
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
	 * Order Id
	 */
					
	private String dingdanbianhao;
	
	/**
	 * Name
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * Image
	 */
					
	private String tupian;
	
	/**
	 * Type
	 */
					
	private String jingdianleixing;
	
	/**
	 * Tickets Price
	 */
					
	private Float menpiaojiage;
	
	/**
	 * Number
	 */
					
	private Integer shuliang;
	
	/**
	 * Total Cost
	 */
					
	private Float zongjine;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date goupiaoshijian;
	
	/**
	 * Account
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * Name
	 */
					
	private String yonghuxingming;
	
	/**
	 * Telephone
	 */
					
	private String lianxifangshi;
	
	/**
	 * Paid？
	 */
					
	private String ispay;
	
	
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
	 * 设置：Order Id
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：Order Id
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：Total Cost
	 */
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：Total Cost
	 */
	public Float getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：Time
	 */
	public void setGoupiaoshijian(Date goupiaoshijian) {
		this.goupiaoshijian = goupiaoshijian;
	}
	/**
	 * 获取：Time
	 */
	public Date getGoupiaoshijian() {
		return goupiaoshijian;
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
	 * 设置：Paid？
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：Paid？
	 */
	public String getIspay() {
		return ispay;
	}

}
