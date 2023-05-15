package com.entity.model;

import com.entity.MessagesEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Suggestion
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public class MessagesModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
