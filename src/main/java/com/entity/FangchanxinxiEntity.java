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
 * 房产信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("fangchanxinxi")
public class FangchanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangchanxinxiEntity() {
		
	}
	
	public FangchanxinxiEntity(T t) {
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
	 * 房产编号
	 */
					
	private String fangchanbianhao;
	
	/**
	 * 房产名称
	 */
					
	private String fangchanmingcheng;
	
	/**
	 * 楼层数
	 */
					
	private String loucengshu;
	
	/**
	 * 建造面积
	 */
					
	private String jianzaomianji;
	
	/**
	 * 房产性质
	 */
					
	private String fangchanxingzhi;
	
	/**
	 * 房号
	 */
					
	private String fanghao;
	
	/**
	 * 房屋状态
	 */
					
	private String fangwuzhuangtai;
	
	/**
	 * 房屋图片
	 */
					
	private String fangwutupian;
	
	
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
	 * 设置：房产编号
	 */
	public void setFangchanbianhao(String fangchanbianhao) {
		this.fangchanbianhao = fangchanbianhao;
	}
	/**
	 * 获取：房产编号
	 */
	public String getFangchanbianhao() {
		return fangchanbianhao;
	}
	/**
	 * 设置：房产名称
	 */
	public void setFangchanmingcheng(String fangchanmingcheng) {
		this.fangchanmingcheng = fangchanmingcheng;
	}
	/**
	 * 获取：房产名称
	 */
	public String getFangchanmingcheng() {
		return fangchanmingcheng;
	}
	/**
	 * 设置：楼层数
	 */
	public void setLoucengshu(String loucengshu) {
		this.loucengshu = loucengshu;
	}
	/**
	 * 获取：楼层数
	 */
	public String getLoucengshu() {
		return loucengshu;
	}
	/**
	 * 设置：建造面积
	 */
	public void setJianzaomianji(String jianzaomianji) {
		this.jianzaomianji = jianzaomianji;
	}
	/**
	 * 获取：建造面积
	 */
	public String getJianzaomianji() {
		return jianzaomianji;
	}
	/**
	 * 设置：房产性质
	 */
	public void setFangchanxingzhi(String fangchanxingzhi) {
		this.fangchanxingzhi = fangchanxingzhi;
	}
	/**
	 * 获取：房产性质
	 */
	public String getFangchanxingzhi() {
		return fangchanxingzhi;
	}
	/**
	 * 设置：房号
	 */
	public void setFanghao(String fanghao) {
		this.fanghao = fanghao;
	}
	/**
	 * 获取：房号
	 */
	public String getFanghao() {
		return fanghao;
	}
	/**
	 * 设置：房屋状态
	 */
	public void setFangwuzhuangtai(String fangwuzhuangtai) {
		this.fangwuzhuangtai = fangwuzhuangtai;
	}
	/**
	 * 获取：房屋状态
	 */
	public String getFangwuzhuangtai() {
		return fangwuzhuangtai;
	}
	/**
	 * 设置：房屋图片
	 */
	public void setFangwutupian(String fangwutupian) {
		this.fangwutupian = fangwutupian;
	}
	/**
	 * 获取：房屋图片
	 */
	public String getFangwutupian() {
		return fangwutupian;
	}

}
