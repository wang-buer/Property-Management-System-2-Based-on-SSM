package com.entity.vo;

import com.entity.ShoufeibiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收费标准
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public class ShoufeibiaozhunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
