package com.entity.model;

import com.entity.KaifashangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 开发商
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public class KaifashangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
