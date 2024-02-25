package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuhutousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuhutousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuhutousuView;


/**
 * 住户投诉
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhuhutousuService extends IService<ZhuhutousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuhutousuVO> selectListVO(Wrapper<ZhuhutousuEntity> wrapper);
   	
   	ZhuhutousuVO selectVO(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
   	
   	List<ZhuhutousuView> selectListView(Wrapper<ZhuhutousuEntity> wrapper);
   	
   	ZhuhutousuView selectView(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuhutousuEntity> wrapper);
   	

}

