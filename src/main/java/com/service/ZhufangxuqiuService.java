package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhufangxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhufangxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhufangxuqiuView;


/**
 * 住房需求
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhufangxuqiuService extends IService<ZhufangxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhufangxuqiuVO> selectListVO(Wrapper<ZhufangxuqiuEntity> wrapper);
   	
   	ZhufangxuqiuVO selectVO(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
   	
   	List<ZhufangxuqiuView> selectListView(Wrapper<ZhufangxuqiuEntity> wrapper);
   	
   	ZhufangxuqiuView selectView(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhufangxuqiuEntity> wrapper);
   	

}

