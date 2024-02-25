package com.entity.vo;

import com.entity.ZhufangxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 住房需求
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public class ZhufangxuqiuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物业账号
	 */
	
	private String wuyezhanghao;
		
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
		
	/**
	 * 需求
	 */
	
	private String xuqiu;
		
	/**
	 * 是否解决
	 */
	
	private String shifoujiejue;
		
	/**
	 * 需求人
	 */
	
	private String xuqiuren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：物业账号
	 */
	 
	public void setWuyezhanghao(String wuyezhanghao) {
		this.wuyezhanghao = wuyezhanghao;
	}
	
	/**
	 * 获取：物业账号
	 */
	public String getWuyezhanghao() {
		return wuyezhanghao;
	}
				
	
	/**
	 * 设置：物业姓名
	 */
	 
	public void setWuyexingming(String wuyexingming) {
		this.wuyexingming = wuyexingming;
	}
	
	/**
	 * 获取：物业姓名
	 */
	public String getWuyexingming() {
		return wuyexingming;
	}
				
	
	/**
	 * 设置：需求
	 */
	 
	public void setXuqiu(String xuqiu) {
		this.xuqiu = xuqiu;
	}
	
	/**
	 * 获取：需求
	 */
	public String getXuqiu() {
		return xuqiu;
	}
				
	
	/**
	 * 设置：是否解决
	 */
	 
	public void setShifoujiejue(String shifoujiejue) {
		this.shifoujiejue = shifoujiejue;
	}
	
	/**
	 * 获取：是否解决
	 */
	public String getShifoujiejue() {
		return shifoujiejue;
	}
				
	
	/**
	 * 设置：需求人
	 */
	 
	public void setXuqiuren(String xuqiuren) {
		this.xuqiuren = xuqiuren;
	}
	
	/**
	 * 获取：需求人
	 */
	public String getXuqiuren() {
		return xuqiuren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
