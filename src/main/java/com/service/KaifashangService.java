package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaifashangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaifashangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaifashangView;


/**
 * 开发商
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface KaifashangService extends IService<KaifashangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaifashangVO> selectListVO(Wrapper<KaifashangEntity> wrapper);
   	
   	KaifashangVO selectVO(@Param("ew") Wrapper<KaifashangEntity> wrapper);
   	
   	List<KaifashangView> selectListView(Wrapper<KaifashangEntity> wrapper);
   	
   	KaifashangView selectView(@Param("ew") Wrapper<KaifashangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaifashangEntity> wrapper);
   	

}

