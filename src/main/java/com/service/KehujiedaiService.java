package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehujiedaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehujiedaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehujiedaiView;


/**
 * 客户接待
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface KehujiedaiService extends IService<KehujiedaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehujiedaiVO> selectListVO(Wrapper<KehujiedaiEntity> wrapper);
   	
   	KehujiedaiVO selectVO(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
   	
   	List<KehujiedaiView> selectListView(Wrapper<KehujiedaiEntity> wrapper);
   	
   	KehujiedaiView selectView(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehujiedaiEntity> wrapper);
   	

}

