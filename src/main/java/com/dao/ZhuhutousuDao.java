package com.dao;

import com.entity.ZhuhutousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuhutousuVO;
import com.entity.view.ZhuhutousuView;


/**
 * 住户投诉
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhuhutousuDao extends BaseMapper<ZhuhutousuEntity> {
	
	List<ZhuhutousuVO> selectListVO(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
	
	ZhuhutousuVO selectVO(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
	
	List<ZhuhutousuView> selectListView(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);

	List<ZhuhutousuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
	
	ZhuhutousuView selectView(@Param("ew") Wrapper<ZhuhutousuEntity> wrapper);
	

}
