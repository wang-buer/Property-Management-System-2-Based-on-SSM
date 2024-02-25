package com.entity.vo;

import com.entity.KehujiedaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客户接待
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public class KehujiedaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 客户手机
	 */
	
	private String kehushouji;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 接待时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiedaishijian;
		
	/**
	 * 内容
	 */
	
	private String neirong;
				
	
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
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：客户手机
	 */
	 
	public void setKehushouji(String kehushouji) {
		this.kehushouji = kehushouji;
	}
	
	/**
	 * 获取：客户手机
	 */
	public String getKehushouji() {
		return kehushouji;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：接待时间
	 */
	 
	public void setJiedaishijian(Date jiedaishijian) {
		this.jiedaishijian = jiedaishijian;
	}
	
	/**
	 * 获取：接待时间
	 */
	public Date getJiedaishijian() {
		return jiedaishijian;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
			
}
