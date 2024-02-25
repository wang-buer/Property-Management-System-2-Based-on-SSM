package com.entity.vo;

import com.entity.WuyegongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 物业公司
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public class WuyegongsiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 成立时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chenglishijian;
		
	/**
	 * 服务面积
	 */
	
	private String fuwumianji;
		
	/**
	 * 企业文化
	 */
	
	private String qiyewenhua;
		
	/**
	 * 注册资金
	 */
	
	private String zhucezijin;
		
	/**
	 * 资质荣誉
	 */
	
	private String zizhirongyu;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
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
				
	
	/**
	 * 设置：成立时间
	 */
	 
	public void setChenglishijian(Date chenglishijian) {
		this.chenglishijian = chenglishijian;
	}
	
	/**
	 * 获取：成立时间
	 */
	public Date getChenglishijian() {
		return chenglishijian;
	}
				
	
	/**
	 * 设置：服务面积
	 */
	 
	public void setFuwumianji(String fuwumianji) {
		this.fuwumianji = fuwumianji;
	}
	
	/**
	 * 获取：服务面积
	 */
	public String getFuwumianji() {
		return fuwumianji;
	}
				
	
	/**
	 * 设置：企业文化
	 */
	 
	public void setQiyewenhua(String qiyewenhua) {
		this.qiyewenhua = qiyewenhua;
	}
	
	/**
	 * 获取：企业文化
	 */
	public String getQiyewenhua() {
		return qiyewenhua;
	}
				
	
	/**
	 * 设置：注册资金
	 */
	 
	public void setZhucezijin(String zhucezijin) {
		this.zhucezijin = zhucezijin;
	}
	
	/**
	 * 获取：注册资金
	 */
	public String getZhucezijin() {
		return zhucezijin;
	}
				
	
	/**
	 * 设置：资质荣誉
	 */
	 
	public void setZizhirongyu(String zizhirongyu) {
		this.zizhirongyu = zizhirongyu;
	}
	
	/**
	 * 获取：资质荣誉
	 */
	public String getZizhirongyu() {
		return zizhirongyu;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
