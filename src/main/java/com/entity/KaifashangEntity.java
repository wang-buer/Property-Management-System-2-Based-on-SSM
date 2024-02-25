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
 * 开发商
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("kaifashang")
public class KaifashangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaifashangEntity() {
		
	}
	
	public KaifashangEntity(T t) {
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
	 * 开发商名称
	 */
					
	private String kaifashangmingcheng;
	
	/**
	 * 资质级别
	 */
					
	private String zizhijibie;
	
	/**
	 * 经营地址
	 */
					
	private String jingyingdizhi;
	
	/**
	 * 法人
	 */
					
	private String faren;
	
	/**
	 * 营业执照
	 */
					
	private String yingyezhizhao;
	
	/**
	 * 电话
	 */
					
	private String dianhua;
	
	/**
	 * 邮编
	 */
					
	private String youbian;
	
	/**
	 * 企业概况
	 */
					
	private String qiyegaikuang;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：开发商名称
	 */
	public void setKaifashangmingcheng(String kaifashangmingcheng) {
		this.kaifashangmingcheng = kaifashangmingcheng;
	}
	/**
	 * 获取：开发商名称
	 */
	public String getKaifashangmingcheng() {
		return kaifashangmingcheng;
	}
	/**
	 * 设置：资质级别
	 */
	public void setZizhijibie(String zizhijibie) {
		this.zizhijibie = zizhijibie;
	}
	/**
	 * 获取：资质级别
	 */
	public String getZizhijibie() {
		return zizhijibie;
	}
	/**
	 * 设置：经营地址
	 */
	public void setJingyingdizhi(String jingyingdizhi) {
		this.jingyingdizhi = jingyingdizhi;
	}
	/**
	 * 获取：经营地址
	 */
	public String getJingyingdizhi() {
		return jingyingdizhi;
	}
	/**
	 * 设置：法人
	 */
	public void setFaren(String faren) {
		this.faren = faren;
	}
	/**
	 * 获取：法人
	 */
	public String getFaren() {
		return faren;
	}
	/**
	 * 设置：营业执照
	 */
	public void setYingyezhizhao(String yingyezhizhao) {
		this.yingyezhizhao = yingyezhizhao;
	}
	/**
	 * 获取：营业执照
	 */
	public String getYingyezhizhao() {
		return yingyezhizhao;
	}
	/**
	 * 设置：电话
	 */
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
	/**
	 * 设置：邮编
	 */
	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}
	/**
	 * 获取：邮编
	 */
	public String getYoubian() {
		return youbian;
	}
	/**
	 * 设置：企业概况
	 */
	public void setQiyegaikuang(String qiyegaikuang) {
		this.qiyegaikuang = qiyegaikuang;
	}
	/**
	 * 获取：企业概况
	 */
	public String getQiyegaikuang() {
		return qiyegaikuang;
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

}
