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
 * 物业公司
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("wuyegongsi")
public class WuyegongsiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuyegongsiEntity() {
		
	}
	
	public WuyegongsiEntity(T t) {
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
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 成立时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
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
