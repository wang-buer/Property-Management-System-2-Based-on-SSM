package com.entity.vo;

import com.entity.ZonghejingyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 综合经营
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public class ZonghejingyingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 开展时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaizhanshijian;
		
	/**
	 * 开展地点
	 */
	
	private String kaizhandidian;
		
	/**
	 * 参与人
	 */
	
	private String canyuren;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 物业账号
	 */
	
	private String wuyezhanghao;
		
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
				
	
	/**
	 * 设置：开展时间
	 */
	 
	public void setKaizhanshijian(Date kaizhanshijian) {
		this.kaizhanshijian = kaizhanshijian;
	}
	
	/**
	 * 获取：开展时间
	 */
	public Date getKaizhanshijian() {
		return kaizhanshijian;
	}
				
	
	/**
	 * 设置：开展地点
	 */
	 
	public void setKaizhandidian(String kaizhandidian) {
		this.kaizhandidian = kaizhandidian;
	}
	
	/**
	 * 获取：开展地点
	 */
	public String getKaizhandidian() {
		return kaizhandidian;
	}
				
	
	/**
	 * 设置：参与人
	 */
	 
	public void setCanyuren(String canyuren) {
		this.canyuren = canyuren;
	}
	
	/**
	 * 获取：参与人
	 */
	public String getCanyuren() {
		return canyuren;
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
			
}
