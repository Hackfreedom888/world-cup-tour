package com.entity.model;

import com.entity.AddressEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * Address
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
public class AddressModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * Address
	 */
	
	private String address;
		
	/**
	 * Customer
	 */
	
	private String name;
		
	/**
	 * Contact
	 */
	
	private String phone;
		
	/**
	 * 是否默认Address[是/否]
	 */
	
	private String isdefault;
				
	
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
	 * 设置：Customer
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取：Customer
	 */
	public String getName() {
		return name;
	}
				
	
	/**
	 * 设置：Contact
	 */
	 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * 获取：Contact
	 */
	public String getPhone() {
		return phone;
	}
				
	
	/**
	 * 设置：是否默认Address[是/否]
	 */
	 
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}
	
	/**
	 * 获取：是否默认Address[是/否]
	 */
	public String getIsdefault() {
		return isdefault;
	}
			
}
