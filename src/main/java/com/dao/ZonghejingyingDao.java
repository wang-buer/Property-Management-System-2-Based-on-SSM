package com.dao;

import com.entity.ZonghejingyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghejingyingVO;
import com.entity.view.ZonghejingyingView;


/**
 * 综合经营
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZonghejingyingDao extends BaseMapper<ZonghejingyingEntity> {
	
	List<ZonghejingyingVO> selectListVO(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
	
	ZonghejingyingVO selectVO(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
	
	List<ZonghejingyingView> selectListView(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);

	List<ZonghejingyingView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
	
	ZonghejingyingView selectView(@Param("ew") Wrapper<ZonghejingyingEntity> wrapper);
	

}
