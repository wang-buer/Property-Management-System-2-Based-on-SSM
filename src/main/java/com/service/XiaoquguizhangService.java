package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoquguizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoquguizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoquguizhangView;


/**
 * 小区规章
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface XiaoquguizhangService extends IService<XiaoquguizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoquguizhangVO> selectListVO(Wrapper<XiaoquguizhangEntity> wrapper);
   	
   	XiaoquguizhangVO selectVO(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
   	
   	List<XiaoquguizhangView> selectListView(Wrapper<XiaoquguizhangEntity> wrapper);
   	
   	XiaoquguizhangView selectView(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoquguizhangEntity> wrapper);
   	

}

