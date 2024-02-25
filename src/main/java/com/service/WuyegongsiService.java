package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuyegongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuyegongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuyegongsiView;


/**
 * 物业公司
 *
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface WuyegongsiService extends IService<WuyegongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuyegongsiVO> selectListVO(Wrapper<WuyegongsiEntity> wrapper);
   	
   	WuyegongsiVO selectVO(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
   	
   	List<WuyegongsiView> selectListView(Wrapper<WuyegongsiEntity> wrapper);
   	
   	WuyegongsiView selectView(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuyegongsiEntity> wrapper);
   	

}

