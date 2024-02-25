package com.entity.view;

import com.entity.WuyegongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物业公司
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("wuyegongsi")
public class WuyegongsiView  extends WuyegongsiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuyegongsiView(){
	}
 
 	public WuyegongsiView(WuyegongsiEntity wuyegongsiEntity){
 	try {
			BeanUtils.copyProperties(this, wuyegongsiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
