package com.entity.model;

import com.entity.ZuqiuzhoubianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Merchants
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class ZuqiuzhoubianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Name
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * Cover
	 */
	
	private String shangpinfengmian;
		
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * Brand
	 */
	
	private String pinpai;
		
	/**
	 * Size
	 */
	
	private String guige;
		
	/**
	 * Details
	 */
	
	private String chanpinxiangqing;
		
	/**
	 * Limit
	 */
	
	private Integer onelimittimes;
		
	/**
	 * Remaining
	 */
	
	private Integer alllimittimes;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * Price
	 */
	
	private Float price;
		
	/**
	 * Group Price
	 */
	
	private Float groupprice;
		
	/**
	 * Group number
	 */
	
	private Integer grouppeople;
		
	/**
	 * Current Number
	 */
	
	private Integer curpeople;
				
	
	/**
	 * 设置：Name
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：Name
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：Cover
	 */
	 
	public void setShangpinfengmian(String shangpinfengmian) {
		this.shangpinfengmian = shangpinfengmian;
	}
	
	/**
	 * 获取：Cover
	 */
	public String getShangpinfengmian() {
		return shangpinfengmian;
	}
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：Brand
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：Brand
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：Size
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：Size
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：Details
	 */
	 
	public void setChanpinxiangqing(String chanpinxiangqing) {
		this.chanpinxiangqing = chanpinxiangqing;
	}
	
	/**
	 * 获取：Details
	 */
	public String getChanpinxiangqing() {
		return chanpinxiangqing;
	}
				
	
	/**
	 * 设置：Limit
	 */
	 
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	
	/**
	 * 获取：Limit
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
				
	
	/**
	 * 设置：Remaining
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：Remaining
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：Price
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：Price
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：Group Price
	 */
	 
	public void setGroupprice(Float groupprice) {
		this.groupprice = groupprice;
	}
	
	/**
	 * 获取：Group Price
	 */
	public Float getGroupprice() {
		return groupprice;
	}
				
	
	/**
	 * 设置：Group number
	 */
	 
	public void setGrouppeople(Integer grouppeople) {
		this.grouppeople = grouppeople;
	}
	
	/**
	 * 获取：Group number
	 */
	public Integer getGrouppeople() {
		return grouppeople;
	}
				
	
	/**
	 * 设置：Current Number
	 */
	 
	public void setCurpeople(Integer curpeople) {
		this.curpeople = curpeople;
	}
	
	/**
	 * 获取：Current Number
	 */
	public Integer getCurpeople() {
		return curpeople;
	}
			
}
