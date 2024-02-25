package com.dao;

import com.entity.XiaoqugaikuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoqugaikuangVO;
import com.entity.view.XiaoqugaikuangView;


/**
 * 小区概况
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface XiaoqugaikuangDao extends BaseMapper<XiaoqugaikuangEntity> {
	
	List<XiaoqugaikuangVO> selectListVO(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
	
	XiaoqugaikuangVO selectVO(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
	
	List<XiaoqugaikuangView> selectListView(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);

	List<XiaoqugaikuangView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
	
	XiaoqugaikuangView selectView(@Param("ew") Wrapper<XiaoqugaikuangEntity> wrapper);
	

}
