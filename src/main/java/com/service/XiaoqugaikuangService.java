package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoqugaikuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoqugaikuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoqugaikuangView;


/**
 * 小区概况
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface XiaoqugaikuangService extends IService<XiaoqugaikuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoqugaikuangVO> selectListVO(Wrapper<XiaoqugaikuangEntity> wrapper);
   	
   	XiaoqugaikuangVO selectVO(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
   	
   	List<XiaoqugaikuangView> selectListView(Wrapper<XiaoqugaikuangEntity> wrapper);
   	
   	XiaoqugaikuangView selectView(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoqugaikuangEntity> wrapper);
   	

}

