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
 * 收藏表
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("storeup")
public class StoreupEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public StoreupEntity() {
		
	}
	
	public StoreupEntity(T t) {
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
	 * Userid
	 */
					
	private Long userid;
	
	/**
	 * 商品id
	 */
					
	private Long refid;
	
	/**
	 * 表名
	 */
					
	private String tablename;
	
	/**
	 * 名称
	 */
					
	private String name;
	
	/**
	 * Image
	 */
					
	private String picture;
	
	/**
	 * 类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)
	 */
					
	private String type;
	
	/**
	 * 推荐类型
	 */
					
	private String inteltype;
	
	/**
	 * Tips
	 */
					
	private String remark;
	
	
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
	 * 设置：Userid
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：Userid
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置：商品id
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	/**
	 * 获取：商品id
	 */
	public Long getRefid() {
		return refid;
	}
	/**
	 * 设置：表名
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	/**
	 * 获取：表名
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：Image
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * 获取：Image
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * 设置：类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：推荐类型
	 */
	public void setInteltype(String inteltype) {
		this.inteltype = inteltype;
	}
	/**
	 * 获取：推荐类型
	 */
	public String getInteltype() {
		return inteltype;
	}
	/**
	 * 设置：Tips
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：Tips
	 */
	public String getRemark() {
		return remark;
	}

}
