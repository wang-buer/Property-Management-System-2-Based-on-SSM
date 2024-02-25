package com.dao;

import com.entity.WuyeshoufeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeshoufeiVO;
import com.entity.view.WuyeshoufeiView;


/**
 * 物业收费
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface WuyeshoufeiDao extends BaseMapper<WuyeshoufeiEntity> {
	
	List<WuyeshoufeiVO> selectListVO(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	WuyeshoufeiVO selectVO(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	List<WuyeshoufeiView> selectListView(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);

	List<WuyeshoufeiView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	
	WuyeshoufeiView selectView(@Param("ew") Wrapper<WuyeshoufeiEntity> wrapper);
	

}
