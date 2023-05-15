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
 * Address
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("address")
public class AddressEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AddressEntity() {
		
	}
	
	public AddressEntity(T t) {
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
	 * Address
	 */
					
	private String address;
	
	/**
	 * Customer
	 */
					
	private String name;
	
	/**
	 * Contact
	 */
					
	private String phone;
	
	/**
	 * 是否默认Address[是/否]
	 */
					
	private String isdefault;
	
	
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
	 * 设置：Address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：Address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：Customer
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：Customer
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：Contact
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：Contact
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：是否默认Address[是/否]
	 */
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	/**
	 * 获取：是否默认Address[是/否]
	 */
	public String getIsdefault() {
		return isdefault;
	}

}
