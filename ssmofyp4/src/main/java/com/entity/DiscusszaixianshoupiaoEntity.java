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
 * Online Tickets评论表
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
@TableName("discusszaixianshoupiao")
public class DiscusszaixianshoupiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiscusszaixianshoupiaoEntity() {
		
	}
	
	public DiscusszaixianshoupiaoEntity(T t) {
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
	 * 关联表id
	 */
					
	private Long refid;
	
	/**
	 * Userid
	 */
					
	private Long userid;
	
	/**
	 * Image
	 */
					
	private String avatarurl;
	
	/**
	 * Username
	 */
					
	private String nickname;
	
	/**
	 * 评论Content
	 */
					
	private String content;
	
	/**
	 * Reply Content
	 */
					
	private String reply;
	
	
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
	 * 设置：关联表id
	 */
	public void setRefid(Long refid) {
		this.refid = refid;
	}
	/**
	 * 获取：关联表id
	 */
	public Long getRefid() {
		return refid;
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
	 * 设置：Username
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：Username
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：评论Content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：评论Content
	 */
	public String getContent() {
		return content;
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

}
