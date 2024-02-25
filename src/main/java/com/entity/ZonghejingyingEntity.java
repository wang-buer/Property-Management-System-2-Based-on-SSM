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
 * 综合经营
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@TableName("zonghejingying")
public class ZonghejingyingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZonghejingyingEntity() {
		
	}
	
	public ZonghejingyingEntity(T t) {
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
	 * 标题名称
	 */
					
	private String biaotimingcheng;
	
	/**
	 * 开展时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：标题名称
	 */
	public void setBiaotimingcheng(String biaotimingcheng) {
		this.biaotimingcheng = biaotimingcheng;
	}
	/**
	 * 获取：标题名称
	 */
	public String getBiaotimingcheng() {
		return biaotimingcheng;
	}
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
