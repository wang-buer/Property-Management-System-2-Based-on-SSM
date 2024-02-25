package com.entity.vo;

import com.entity.FangchanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房产信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public class FangchanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
