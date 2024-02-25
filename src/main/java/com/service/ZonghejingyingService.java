package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghejingyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghejingyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghejingyingView;


/**
 * 综合经营
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZonghejingyingService extends IService<ZonghejingyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghejingyingVO> selectListVO(Wrapper<ZonghejingyingEntity> wrapper);
   	
   	ZonghejingyingVO selectVO(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
   	
   	List<ZonghejingyingView> selectListView(Wrapper<ZonghejingyingEntity> wrapper);
   	
   	ZonghejingyingView selectView(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghejingyingEntity> wrapper);
   	

}

