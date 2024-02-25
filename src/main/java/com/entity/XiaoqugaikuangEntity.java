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
 * 小区概况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("xiaoqugaikuang")
public class XiaoqugaikuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoqugaikuangEntity() {
		
	}
	
	public XiaoqugaikuangEntity(T t) {
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
	 * 小区名称
	 */
					
	private String xiaoqumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianchengshijian;
	
	
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
	 * 设置：小区名称
	 */
	public void setXiaoqumingcheng(String xiaoqumingcheng) {
		this.xiaoqumingcheng = xiaoqumingcheng;
	}
	/**
	 * 获取：小区名称
	 */
	public String getXiaoqumingcheng() {
		return xiaoqumingcheng;
	}
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
