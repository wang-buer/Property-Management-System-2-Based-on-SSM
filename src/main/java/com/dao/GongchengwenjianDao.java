package com.dao;

import com.entity.GongchengwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongchengwenjianVO;
import com.entity.view.GongchengwenjianView;


/**
 * 工程文件
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface GongchengwenjianDao extends BaseMapper<GongchengwenjianEntity> {
	
	List<GongchengwenjianVO> selectListVO(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
	
	GongchengwenjianVO selectVO(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
	
	List<GongchengwenjianView> selectListView(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);

	List<GongchengwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
	
	GongchengwenjianView selectView(@Param("ew") Wrapper<GongchengwenjianEntity> wrapper);
	

}
