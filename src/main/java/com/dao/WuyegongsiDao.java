package com.dao;

import com.entity.WuyegongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyegongsiVO;
import com.entity.view.WuyegongsiView;


/**
 * 物业公司
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface WuyegongsiDao extends BaseMapper<WuyegongsiEntity> {
	
	List<WuyegongsiVO> selectListVO(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
	
	WuyegongsiVO selectVO(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
	
	List<WuyegongsiView> selectListView(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);

	List<WuyegongsiView> selectListView(Pagination page,@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
	
	WuyegongsiView selectView(@Param("ew") Wrapper<WuyegongsiEntity> wrapper);
	

}
