package com.entity.model;

import com.entity.OrdersEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 订单
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class OrdersModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品表名
	 */
	
	private String tablename;
		
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
	 * Price
	 */
	
	private Float price;
		
	/**
	 * Discount
	 */
	
	private Float discountprice;
		
	/**
	 * Total Price
	 */
	
	private Float total;
		
	/**
	 * Discount Total Price
	 */
	
	private Float discounttotal;
		
	/**
	 * Pay Method
	 */
	
	private Integer type;
		
	/**
	 * State
	 */
	
	private String status;
		
	/**
	 * Address
	 */
	
	private String address;
		
	/**
	 * Contact
	 */
	
	private String tel;
		
	/**
	 * Customer
	 */
	
	private String consignee;
		
	/**
	 * Tips
	 */
	
	private String remark;
		
	/**
	 * 物流
	 */
	
	private String logistics;
		
	/**
	 * Group ID
	 */
	
	private String groupno;
				
	
	/**
	 * 设置：商品表名
	 */
	 
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	/**
	 * 获取：商品表名
	 */
	public String getTablename() {
		return tablename;
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
	 * 设置：Discount
	 */
	 
	public void setDiscountprice(Float discountprice) {
		this.discountprice = discountprice;
	}
	
	/**
	 * 获取：Discount
	 */
	public Float getDiscountprice() {
		return discountprice;
	}
				
	
	/**
	 * 设置：Total Price
	 */
	 
	public void setTotal(Float total) {
		this.total = total;
	}
	
	/**
	 * 获取：Total Price
	 */
	public Float getTotal() {
		return total;
	}
				
	
	/**
	 * 设置：Discount Total Price
	 */
	 
	public void setDiscounttotal(Float discounttotal) {
		this.discounttotal = discounttotal;
	}
	
	/**
	 * 获取：Discount Total Price
	 */
	public Float getDiscounttotal() {
		return discounttotal;
	}
				
	
	/**
	 * 设置：Pay Method
	 */
	 
	public void setType(Integer type) {
		this.type = type;
	}
	
	/**
	 * 获取：Pay Method
	 */
	public Integer getType() {
		return type;
	}
				
	
	/**
	 * 设置：State
	 */
	 
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * 获取：State
	 */
	public String getStatus() {
		return status;
	}
				
	
	/**
	 * 设置：Address
	 */
	 
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 获取：Address
	 */
	public String getAddress() {
		return address;
	}
				
	
	/**
	 * 设置：Contact
	 */
	 
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	/**
	 * 获取：Contact
	 */
	public String getTel() {
		return tel;
	}
				
	
	/**
	 * 设置：Customer
	 */
	 
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	
	/**
	 * 获取：Customer
	 */
	public String getConsignee() {
		return consignee;
	}
				
	
	/**
	 * 设置：Tips
	 */
	 
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 获取：Tips
	 */
	public String getRemark() {
		return remark;
	}
				
	
	/**
	 * 设置：物流
	 */
	 
	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}
	
	/**
	 * 获取：物流
	 */
	public String getLogistics() {
		return logistics;
	}
				
	
	/**
	 * 设置：Group ID
	 */
	 
	public void setGroupno(String groupno) {
		this.groupno = groupno;
	}
	
	/**
	 * 获取：Group ID
	 */
	public String getGroupno() {
		return groupno;
	}
			
}
