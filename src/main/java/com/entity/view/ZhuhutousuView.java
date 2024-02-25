package com.entity.view;

import com.entity.ZhuhutousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 住户投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@TableName("zhuhutousu")
public class ZhuhutousuView  extends ZhuhutousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuhutousuView(){
	}
 
 	public ZhuhutousuView(ZhuhutousuEntity zhuhutousuEntity){
 	try {
			BeanUtils.copyProperties(this, zhuhutousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
