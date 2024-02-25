package com.entity.view;

import com.entity.KehujiedaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客户接待
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@TableName("kehujiedai")
public class KehujiedaiView  extends KehujiedaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KehujiedaiView(){
	}
 
 	public KehujiedaiView(KehujiedaiEntity kehujiedaiEntity){
 	try {
			BeanUtils.copyProperties(this, kehujiedaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
