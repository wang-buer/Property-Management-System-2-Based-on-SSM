package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuhubaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuhubaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuhubaoxiuView;


/**
 * 住户报修
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhuhubaoxiuService extends IService<ZhuhubaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuhubaoxiuVO> selectListVO(Wrapper<ZhuhubaoxiuEntity> wrapper);
   	
   	ZhuhubaoxiuVO selectVO(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
   	
   	List<ZhuhubaoxiuView> selectListView(Wrapper<ZhuhubaoxiuEntity> wrapper);
   	
   	ZhuhubaoxiuView selectView(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuhubaoxiuEntity> wrapper);
   	

}

