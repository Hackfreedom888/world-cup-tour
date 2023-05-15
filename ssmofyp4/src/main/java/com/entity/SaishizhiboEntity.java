package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * Hot
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("saishizhibo")
public class SaishizhiboEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaishizhiboEntity() {
		
	}
	
	public SaishizhiboEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * Name
	 */
					
	private String bisaimingcheng;
	
	/**
	 * Image
	 */
					
	private String bisaitupian;
	
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
					
	private String bisaididian;
	
	/**
	 * Vedio
	 */
					
	private String bisaishipin;
	
	/**
	 * Live link
	 */
					
	private String wenzizhibo;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date bisaishijian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：Name
	 */
	public void setBisaimingcheng(String bisaimingcheng) {
		this.bisaimingcheng = bisaimingcheng;
	}
	/**
	 * 获取：Name
	 */
	public String getBisaimingcheng() {
		return bisaimingcheng;
	}
	/**
	 * 设置：Image
	 */
	public void setBisaitupian(String bisaitupian) {
		this.bisaitupian = bisaitupian;
	}
	/**
	 * 获取：Image
	 */
	public String getBisaitupian() {
		return bisaitupian;
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
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	/**
	 * 获取：Venue
	 */
	public String getBisaididian() {
		return bisaididian;
	}
	/**
	 * 设置：Vedio
	 */
	public void setBisaishipin(String bisaishipin) {
		this.bisaishipin = bisaishipin;
	}
	/**
	 * 获取：Vedio
	 */
	public String getBisaishipin() {
		return bisaishipin;
	}
	/**
	 * 设置：Live link
	 */
	public void setWenzizhibo(String wenzizhibo) {
		this.wenzizhibo = wenzizhibo;
	}
	/**
	 * 获取：Live link
	 */
	public String getWenzizhibo() {
		return wenzizhibo;
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
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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

}