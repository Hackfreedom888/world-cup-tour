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
 * Forum
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("forum")
public class ForumEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ForumEntity() {
		
	}
	
	public ForumEntity(T t) {
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
	 * Post title
	 */
					
	private String title;
	
	/**
	 * 帖子Content
	 */
					
	private String content;
	
	/**
	 * 父节点id
	 */
					
	private Long parentid;
	
	/**
	 * Userid
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
	 * State
	 */
					
	private String isdone;
	
	
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
	@TableField(exist = false)
	private List<ForumEntity> childs;
	
	public List<ForumEntity> getChilds() {
		return childs;
	}

	public void setChilds(List<ForumEntity> childs) {
		this.childs = childs;
	}
	/**
	 * 设置：Post title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：Post title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：帖子Content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：帖子Content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：父节点id
	 */
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}
	/**
	 * 获取：父节点id
	 */
	public Long getParentid() {
		return parentid;
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
	 * 设置：State
	 */
	public void setIsdone(String isdone) {
		this.isdone = isdone;
	}
	/**
	 * 获取：State
	 */
	public String getIsdone() {
		return isdone;
	}

}
