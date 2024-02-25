package com.entity.view;

import com.entity.ZonghejingyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合经营
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@TableName("zonghejingying")
public class ZonghejingyingView  extends ZonghejingyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghejingyingView(){
	}
 
 	public ZonghejingyingView(ZonghejingyingEntity zonghejingyingEntity){
 	try {
			BeanUtils.copyProperties(this, zonghejingyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
