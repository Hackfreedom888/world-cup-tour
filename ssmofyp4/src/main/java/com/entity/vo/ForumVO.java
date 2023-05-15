package com.entity.vo;

import com.entity.ForumEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Forum
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class ForumVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
