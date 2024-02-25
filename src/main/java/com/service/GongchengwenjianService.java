package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongchengwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongchengwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongchengwenjianView;


/**
 * 工程文件
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface GongchengwenjianService extends IService<GongchengwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongchengwenjianVO> selectListVO(Wrapper<GongchengwenjianEntity> wrapper);
   	
   	GongchengwenjianVO selectVO(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
   	
   	List<GongchengwenjianView> selectListView(Wrapper<GongchengwenjianEntity> wrapper);
   	
   	GongchengwenjianView selectView(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongchengwenjianEntity> wrapper);
   	

}

