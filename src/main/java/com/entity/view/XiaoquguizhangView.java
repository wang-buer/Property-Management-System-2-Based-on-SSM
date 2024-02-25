package com.entity.view;

import com.entity.XiaoquguizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小区规章
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
@TableName("xiaoquguizhang")
public class XiaoquguizhangView  extends XiaoquguizhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoquguizhangView(){
	}
 
 	public XiaoquguizhangView(XiaoquguizhangEntity xiaoquguizhangEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoquguizhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
