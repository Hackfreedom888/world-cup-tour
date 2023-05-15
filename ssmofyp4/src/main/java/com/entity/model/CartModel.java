package com.entity.model;

import com.entity.CartEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 购物车表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class CartModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Userid
	 */
	
	private Long userid;
		
	/**
	 * 商品id
	 */
	
	private Long goodid;
		
	/**
	 * Name
	 */
	
	private String goodname;
		
	/**
	 * Image
	 */
	
	private String picture;
		
	/**
	 * Number
	 */
	
	private Integer buynumber;
		
	/**
	 * 单价
	 */
	
	private Float price;
		
	/**
	 * 会员价
	 */
	
	private Float discountprice;
				
	
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
	 * 设置：商品id
	 */
	 
	public void setGoodid(Long goodid) {
		this.goodid = goodid;
	}
	
	/**
	 * 获取：商品id
	 */
	public Long getGoodid() {
		return goodid;
	}
				
	
	/**
	 * 设置：Name
	 */
	 
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	
	/**
	 * 获取：Name
	 */
	public String getGoodname() {
		return goodname;
	}
				
	
	/**
	 * 设置：Image
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：Image
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：Number
	 */
	 
	public void setBuynumber(Integer buynumber) {
		this.buynumber = buynumber;
	}
	
	/**
	 * 获取：Number
	 */
	public Integer getBuynumber() {
		return buynumber;
	}
				
	
	/**
	 * 设置：单价
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：单价
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：会员价
	 */
	 
	public void setDiscountprice(Float discountprice) {
		this.discountprice = discountprice;
	}
	
	/**
	 * 获取：会员价
	 */
	public Float getDiscountprice() {
		return discountprice;
	}
			
}
