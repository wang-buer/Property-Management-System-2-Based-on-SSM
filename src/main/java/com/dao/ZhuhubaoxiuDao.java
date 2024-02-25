package com.dao;

import com.entity.ZhuhubaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuhubaoxiuVO;
import com.entity.view.ZhuhubaoxiuView;


/**
 * 住户报修
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhuhubaoxiuDao extends BaseMapper<ZhuhubaoxiuEntity> {
	
	List<ZhuhubaoxiuVO> selectListVO(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
	
	ZhuhubaoxiuVO selectVO(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
	
	List<ZhuhubaoxiuView> selectListView(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);

	List<ZhuhubaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
	
	ZhuhubaoxiuView selectView(@Param("ew") Wrapper<ZhuhubaoxiuEntity> wrapper);
	

}
