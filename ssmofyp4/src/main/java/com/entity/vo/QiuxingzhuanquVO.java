package com.entity.vo;

import com.entity.QiuxingzhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * Stars
 * 手机端接口Return实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class QiuxingzhuanquVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Image
	 */
	
	private String touxiang;
		
	/**
	 * Highlight
	 */
	
	private String gerenjijin;
		
	/**
	 * Jersey number
	 */
	
	private Integer qiuyihaoma;
		
	/**
	 * Position
	 */
	
	private String qiuchangweizhi;
		
	/**
	 * Team
	 */
	
	private String suoshuqiudui;
		
	/**
	 * Height
	 */
	
	private String shengao;
		
	/**
	 * Weight
	 */
	
	private String tizhong;
		
	/**
	 * Birthday
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengri;
		
	/**
	 * Age
	 */
	
	private Integer nianling;
		
	/**
	 * Background
	 */
	
	private String qiuyuanlvli;
				
	
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
	 * 设置：Highlight
	 */
	 
	public void setGerenjijin(String gerenjijin) {
		this.gerenjijin = gerenjijin;
	}
	
	/**
	 * 获取：Highlight
	 */
	public String getGerenjijin() {
		return gerenjijin;
	}
				
	
	/**
	 * 设置：Jersey number
	 */
	 
	public void setQiuyihaoma(Integer qiuyihaoma) {
		this.qiuyihaoma = qiuyihaoma;
	}
	
	/**
	 * 获取：Jersey number
	 */
	public Integer getQiuyihaoma() {
		return qiuyihaoma;
	}
				
	
	/**
	 * 设置：Position
	 */
	 
	public void setQiuchangweizhi(String qiuchangweizhi) {
		this.qiuchangweizhi = qiuchangweizhi;
	}
	
	/**
	 * 获取：Position
	 */
	public String getQiuchangweizhi() {
		return qiuchangweizhi;
	}
				
	
	/**
	 * 设置：Team
	 */
	 
	public void setSuoshuqiudui(String suoshuqiudui) {
		this.suoshuqiudui = suoshuqiudui;
	}
	
	/**
	 * 获取：Team
	 */
	public String getSuoshuqiudui() {
		return suoshuqiudui;
	}
				
	
	/**
	 * 设置：Height
	 */
	 
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	
	/**
	 * 获取：Height
	 */
	public String getShengao() {
		return shengao;
	}
				
	
	/**
	 * 设置：Weight
	 */
	 
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	
	/**
	 * 获取：Weight
	 */
	public String getTizhong() {
		return tizhong;
	}
				
	
	/**
	 * 设置：Birthday
	 */
	 
	public void setShengri(Date shengri) {
		this.shengri = shengri;
	}
	
	/**
	 * 获取：Birthday
	 */
	public Date getShengri() {
		return shengri;
	}
				
	
	/**
	 * 设置：Age
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：Age
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：Background
	 */
	 
	public void setQiuyuanlvli(String qiuyuanlvli) {
		this.qiuyuanlvli = qiuyuanlvli;
	}
	
	/**
	 * 获取：Background
	 */
	public String getQiuyuanlvli() {
		return qiuyuanlvli;
	}
			
}
