package com.entity.model;

import com.entity.BanzhushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Moderator application
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class BanzhushenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Name
	 */
	
	private String yonghuxingming;
		
	/**
	 * Image
	 */
	
	private String touxiang;
		
	/**
	 * Telephone
	 */
	
	private String lianxifangshi;
		
	/**
	 * Favorite Star
	 */
	
	private String xihuanqiuxing;
		
	/**
	 * Favorite Team
	 */
	
	private String xihuanqiudui;
		
	/**
	 * 个人介绍
	 */
	
	private String gerenjieshao;
		
	/**
	 * 申请理由
	 */
	
	private String shenqingliyou;
		
	/**
	 * Time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * Reply
	 */
	
	private String shhf;
				
	
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
	 * 设置：Favorite Star
	 */
	 
	public void setXihuanqiuxing(String xihuanqiuxing) {
		this.xihuanqiuxing = xihuanqiuxing;
	}
	
	/**
	 * 获取：Favorite Star
	 */
	public String getXihuanqiuxing() {
		return xihuanqiuxing;
	}
				
	
	/**
	 * 设置：Favorite Team
	 */
	 
	public void setXihuanqiudui(String xihuanqiudui) {
		this.xihuanqiudui = xihuanqiudui;
	}
	
	/**
	 * 获取：Favorite Team
	 */
	public String getXihuanqiudui() {
		return xihuanqiudui;
	}
				
	
	/**
	 * 设置：个人介绍
	 */
	 
	public void setGerenjieshao(String gerenjieshao) {
		this.gerenjieshao = gerenjieshao;
	}
	
	/**
	 * 获取：个人介绍
	 */
	public String getGerenjieshao() {
		return gerenjieshao;
	}
				
	
	/**
	 * 设置：申请理由
	 */
	 
	public void setShenqingliyou(String shenqingliyou) {
		this.shenqingliyou = shenqingliyou;
	}
	
	/**
	 * 获取：申请理由
	 */
	public String getShenqingliyou() {
		return shenqingliyou;
	}
				
	
	/**
	 * 设置：Time
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：Time
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：Reply
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：Reply
	 */
	public String getShhf() {
		return shhf;
	}
			
}
