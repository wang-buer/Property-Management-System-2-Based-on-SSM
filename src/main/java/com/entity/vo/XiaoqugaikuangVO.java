package com.entity.vo;

import com.entity.XiaoqugaikuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 小区概况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public class XiaoqugaikuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 现有户数
	 */
	
	private String xianyouhushu;
		
	/**
	 * 楼栋数
	 */
	
	private String loudongshu;
		
	/**
	 * 开发商
	 */
	
	private String kaifashang;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 建成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianchengshijian;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：现有户数
	 */
	 
	public void setXianyouhushu(String xianyouhushu) {
		this.xianyouhushu = xianyouhushu;
	}
	
	/**
	 * 获取：现有户数
	 */
	public String getXianyouhushu() {
		return xianyouhushu;
	}
				
	
	/**
	 * 设置：楼栋数
	 */
	 
	public void setLoudongshu(String loudongshu) {
		this.loudongshu = loudongshu;
	}
	
	/**
	 * 获取：楼栋数
	 */
	public String getLoudongshu() {
		return loudongshu;
	}
				
	
	/**
	 * 设置：开发商
	 */
	 
	public void setKaifashang(String kaifashang) {
		this.kaifashang = kaifashang;
	}
	
	/**
	 * 获取：开发商
	 */
	public String getKaifashang() {
		return kaifashang;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：建成时间
	 */
	 
	public void setJianchengshijian(Date jianchengshijian) {
		this.jianchengshijian = jianchengshijian;
	}
	
	/**
	 * 获取：建成时间
	 */
	public Date getJianchengshijian() {
		return jianchengshijian;
	}
			
}
