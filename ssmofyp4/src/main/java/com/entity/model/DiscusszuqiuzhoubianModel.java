package com.entity.model;

import com.entity.DiscusszuqiuzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Merchants评论表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
public class DiscusszuqiuzhoubianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
