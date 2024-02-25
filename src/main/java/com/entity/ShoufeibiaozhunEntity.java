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
 * 收费标准
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("shoufeibiaozhun")
public class ShoufeibiaozhunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShoufeibiaozhunEntity() {
		
	}
	
	public ShoufeibiaozhunEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 服务类别
	 */
					
	private String fuwuleibie;
	
	/**
	 * 住宅类型
	 */
					
	private String zhuzhaileixing;
	
	/**
	 * 现行价
	 */
					
	private String xianxingjia;
	
	/**
	 * 车位费
	 */
					
	private String cheweifei;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 发布人
	 */
					
	private String faburen;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：服务类别
	 */
	public void setFuwuleibie(String fuwuleibie) {
		this.fuwuleibie = fuwuleibie;
	}
	/**
	 * 获取：服务类别
	 */
	public String getFuwuleibie() {
		return fuwuleibie;
	}
	/**
	 * 设置：住宅类型
	 */
	public void setZhuzhaileixing(String zhuzhaileixing) {
		this.zhuzhaileixing = zhuzhaileixing;
	}
	/**
	 * 获取：住宅类型
	 */
	public String getZhuzhaileixing() {
		return zhuzhaileixing;
	}
	/**
	 * 设置：现行价
	 */
	public void setXianxingjia(String xianxingjia) {
		this.xianxingjia = xianxingjia;
	}
	/**
	 * 获取：现行价
	 */
	public String getXianxingjia() {
		return xianxingjia;
	}
	/**
	 * 设置：车位费
	 */
	public void setCheweifei(String cheweifei) {
		this.cheweifei = cheweifei;
	}
	/**
	 * 获取：车位费
	 */
	public String getCheweifei() {
		return cheweifei;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：发布人
	 */
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}

}
