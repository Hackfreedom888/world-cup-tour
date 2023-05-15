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
 * Hotel Order
 * 数据库通用Operation实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@TableName("jiudianyuding")
public class JiudianyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudianyudingEntity() {
		
	}
	
	public JiudianyudingEntity(T t) {
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
	 * ID
	 */
					
	private String yudingdanhao;
	
	/**
	 * Name
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * Image
	 */
					
	private String jiudiantupian;
	
	/**
	 * Room Price
	 */
					
	private Integer kefangjiage;
	
	/**
	 * Remaining
	 */
					
	private Integer kefangshuliang;
	
	/**
	 * Days
	 */
					
	private Integer ruzhutianshu;
	
	/**
	 * Total Cost
	 */
					
	private Float zongjine;
	
	/**
	 * Time
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * Account
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * Name
	 */
					
	private String yonghuxingming;
	
	/**
	 * Telephone
	 */
					
	private String lianxifangshi;
	
	/**
	 * Paid？
	 */
					
	private String ispay;
	
	
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
	 * 设置：ID
	 */
	public void setYudingdanhao(String yudingdanhao) {
		this.yudingdanhao = yudingdanhao;
	}
	/**
	 * 获取：ID
	 */
	public String getYudingdanhao() {
		return yudingdanhao;
	}
	/**
	 * 设置：Name
	 */
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：Name
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
	/**
	 * 设置：Image
	 */
	public void setJiudiantupian(String jiudiantupian) {
		this.jiudiantupian = jiudiantupian;
	}
	/**
	 * 获取：Image
	 */
	public String getJiudiantupian() {
		return jiudiantupian;
	}
	/**
	 * 设置：Room Price
	 */
	public void setKefangjiage(Integer kefangjiage) {
		this.kefangjiage = kefangjiage;
	}
	/**
	 * 获取：Room Price
	 */
	public Integer getKefangjiage() {
		return kefangjiage;
	}
	/**
	 * 设置：Remaining
	 */
	public void setKefangshuliang(Integer kefangshuliang) {
		this.kefangshuliang = kefangshuliang;
	}
	/**
	 * 获取：Remaining
	 */
	public Integer getKefangshuliang() {
		return kefangshuliang;
	}
	/**
	 * 设置：Days
	 */
	public void setRuzhutianshu(Integer ruzhutianshu) {
		this.ruzhutianshu = ruzhutianshu;
	}
	/**
	 * 获取：Days
	 */
	public Integer getRuzhutianshu() {
		return ruzhutianshu;
	}
	/**
	 * 设置：Total Cost
	 */
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：Total Cost
	 */
	public Float getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：Time
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：Time
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：Account
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：Account
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
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
	 * 设置：Paid？
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：Paid？
	 */
	public String getIspay() {
		return ispay;
	}

}
