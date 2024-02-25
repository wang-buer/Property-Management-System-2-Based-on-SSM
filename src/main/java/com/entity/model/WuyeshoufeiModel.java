package com.entity.model;

import com.entity.WuyeshoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 物业收费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public class WuyeshoufeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 住户账号
	 */
	
	private String zhuhuzhanghao;
		
	/**
	 * 住户姓名
	 */
	
	private String zhuhuxingming;
		
	/**
	 * 住户号
	 */
	
	private String zhuhuhao;
		
	/**
	 * 物业费
	 */
	
	private Float wuyefei;
		
	/**
	 * 绿化养护
	 */
	
	private Float lvhuayanghu;
		
	/**
	 * 清洁卫生
	 */
	
	private Float qingjieweisheng;
		
	/**
	 * 设施维护
	 */
	
	private Float sheshiweihu;
		
	/**
	 * 其它收费
	 */
	
	private Float qitashoufei;
		
	/**
	 * 总金额
	 */
	
	private Float zongjine;
		
	/**
	 * 物业账号
	 */
	
	private String wuyezhanghao;
		
	/**
	 * 物业姓名
	 */
	
	private String wuyexingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：住户账号
	 */
	 
	public void setZhuhuzhanghao(String zhuhuzhanghao) {
		this.zhuhuzhanghao = zhuhuzhanghao;
	}
	
	/**
	 * 获取：住户账号
	 */
	public String getZhuhuzhanghao() {
		return zhuhuzhanghao;
	}
				
	
	/**
	 * 设置：住户姓名
	 */
	 
	public void setZhuhuxingming(String zhuhuxingming) {
		this.zhuhuxingming = zhuhuxingming;
	}
	
	/**
	 * 获取：住户姓名
	 */
	public String getZhuhuxingming() {
		return zhuhuxingming;
	}
				
	
	/**
	 * 设置：住户号
	 */
	 
	public void setZhuhuhao(String zhuhuhao) {
		this.zhuhuhao = zhuhuhao;
	}
	
	/**
	 * 获取：住户号
	 */
	public String getZhuhuhao() {
		return zhuhuhao;
	}
				
	
	/**
	 * 设置：物业费
	 */
	 
	public void setWuyefei(Float wuyefei) {
		this.wuyefei = wuyefei;
	}
	
	/**
	 * 获取：物业费
	 */
	public Float getWuyefei() {
		return wuyefei;
	}
				
	
	/**
	 * 设置：绿化养护
	 */
	 
	public void setLvhuayanghu(Float lvhuayanghu) {
		this.lvhuayanghu = lvhuayanghu;
	}
	
	/**
	 * 获取：绿化养护
	 */
	public Float getLvhuayanghu() {
		return lvhuayanghu;
	}
				
	
	/**
	 * 设置：清洁卫生
	 */
	 
	public void setQingjieweisheng(Float qingjieweisheng) {
		this.qingjieweisheng = qingjieweisheng;
	}
	
	/**
	 * 获取：清洁卫生
	 */
	public Float getQingjieweisheng() {
		return qingjieweisheng;
	}
				
	
	/**
	 * 设置：设施维护
	 */
	 
	public void setSheshiweihu(Float sheshiweihu) {
		this.sheshiweihu = sheshiweihu;
	}
	
	/**
	 * 获取：设施维护
	 */
	public Float getSheshiweihu() {
		return sheshiweihu;
	}
				
	
	/**
	 * 设置：其它收费
	 */
	 
	public void setQitashoufei(Float qitashoufei) {
		this.qitashoufei = qitashoufei;
	}
	
	/**
	 * 获取：其它收费
	 */
	public Float getQitashoufei() {
		return qitashoufei;
	}
				
	
	/**
	 * 设置：总金额
	 */
	 
	public void setZongjine(Float zongjine) {
		this.zongjine = zongjine;
	}
	
	/**
	 * 获取：总金额
	 */
	public Float getZongjine() {
		return zongjine;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
