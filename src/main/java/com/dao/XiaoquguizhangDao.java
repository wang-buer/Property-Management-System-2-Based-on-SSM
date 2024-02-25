package com.dao;

import com.entity.XiaoquguizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoquguizhangVO;
import com.entity.view.XiaoquguizhangView;


/**
 * 小区规章
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface XiaoquguizhangDao extends BaseMapper<XiaoquguizhangEntity> {
	
	List<XiaoquguizhangVO> selectListVO(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
	
	XiaoquguizhangVO selectVO(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
	
	List<XiaoquguizhangView> selectListView(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);

	List<XiaoquguizhangView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
	
	XiaoquguizhangView selectView(@Param("ew") Wrapper<XiaoquguizhangEntity> wrapper);
	

}
