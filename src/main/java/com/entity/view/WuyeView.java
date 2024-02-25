package com.entity.view;

import com.entity.WuyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("wuye")
public class WuyeView  extends WuyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyeView(){
	}
 
 	public WuyeView(WuyeEntity wuyeEntity){
 	try {
			BeanUtils.copyProperties(this, wuyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
