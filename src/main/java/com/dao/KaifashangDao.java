package com.dao;

import com.entity.KaifashangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaifashangVO;
import com.entity.view.KaifashangView;


/**
 * 开发商
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface KaifashangDao extends BaseMapper<KaifashangEntity> {
	
	List<KaifashangVO> selectListVO(@Param("ew") Wrapper<KaifashangEntity> wrapper);
	
	KaifashangVO selectVO(@Param("ew") Wrapper<KaifashangEntity> wrapper);
	
	List<KaifashangView> selectListView(@Param("ew") Wrapper<KaifashangEntity> wrapper);

	List<KaifashangView> selectListView(Pagination page,@Param("ew") Wrapper<KaifashangEntity> wrapper);
	
	KaifashangView selectView(@Param("ew") Wrapper<KaifashangEntity> wrapper);
	

}
