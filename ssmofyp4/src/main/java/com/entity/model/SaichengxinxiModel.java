package com.entity.model;

import com.entity.SaichengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Schedule info
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class SaichengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Cover
	 */
	
	private String fengmiantupian;
		
	/**
	 * State
	 */
	
	private String zhuangtai;
		
	/**
	 * Round
	 */
	
	private String lunci;
		
	/**
	 * Home
	 */
	
	private String zhudui;
		
	/**
	 * Away
	 */
	
	private String kedui;
		
	/**
	 * Venue
	 */
	
	private String saishididian;
		
	/**
	 * Time
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bisaishijian;
				
	
	/**
	 * 设置：Cover
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：Cover
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：State
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：State
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：Round
	 */
	 
	public void setLunci(String lunci) {
		this.lunci = lunci;
	}
	
	/**
	 * 获取：Round
	 */
	public String getLunci() {
		return lunci;
	}
				
	
	/**
	 * 设置：Home
	 */
	 
	public void setZhudui(String zhudui) {
		this.zhudui = zhudui;
	}
	
	/**
	 * 获取：Home
	 */
	public String getZhudui() {
		return zhudui;
	}
				
	
	/**
	 * 设置：Away
	 */
	 
	public void setKedui(String kedui) {
		this.kedui = kedui;
	}
	
	/**
	 * 获取：Away
	 */
	public String getKedui() {
		return kedui;
	}
				
	
	/**
	 * 设置：Venue
	 */
	 
	public void setSaishididian(String saishididian) {
		this.saishididian = saishididian;
	}
	
	/**
	 * 获取：Venue
	 */
	public String getSaishididian() {
		return saishididian;
	}
				
	
	/**
	 * 设置：Time
	 */
	 
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	
	/**
	 * 获取：Time
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
			
}
