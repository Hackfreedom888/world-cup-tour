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
 * Suggestion
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
@TableName("messages")
public class MessagesEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MessagesEntity() {
		
	}
	
	public MessagesEntity(T t) {
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
	 * 留言人id
	 */
					
	private Long userid;
	
	/**
	 * Username
	 */
					
	private String username;
	
	/**
	 * Image
	 */
					
	private String avatarurl;
	
	/**
	 * Content
	 */
					
	private String content;
	
	/**
	 * Image
	 */
					
	private String cpicture;
	
	/**
	 * Reply Content
	 */
					
	private String reply;
	
	/**
	 * Reply Image
	 */
					
	private String rpicture;
	
	
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
	 * 设置：留言人id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：留言人id
	 */
	public Long getUserid() {
		return userid;
	}
	/**
	 * 设置：Username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：Username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：Image
	 */
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}
	/**
	 * 获取：Image
	 */
	public String getAvatarurl() {
		return avatarurl;
	}
	/**
	 * 设置：Content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：Content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：Image
	 */
	public void setCpicture(String cpicture) {
		this.cpicture = cpicture;
	}
	/**
	 * 获取：Image
	 */
	public String getCpicture() {
		return cpicture;
	}
	/**
	 * 设置：Reply Content
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * 获取：Reply Content
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * 设置：Reply Image
	 */
	public void setRpicture(String rpicture) {
		this.rpicture = rpicture;
	}
	/**
	 * 获取：Reply Image
	 */
	public String getRpicture() {
		return rpicture;
	}

}
