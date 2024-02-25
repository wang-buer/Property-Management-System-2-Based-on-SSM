package com.dao;

import com.entity.KehujiedaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehujiedaiVO;
import com.entity.view.KehujiedaiView;


/**
 * 客户接待
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface KehujiedaiDao extends BaseMapper<KehujiedaiEntity> {
	
	List<KehujiedaiVO> selectListVO(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
	
	KehujiedaiVO selectVO(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
	
	List<KehujiedaiView> selectListView(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);

	List<KehujiedaiView> selectListView(Pagination page,@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
	
	KehujiedaiView selectView(@Param("ew") Wrapper<KehujiedaiEntity> wrapper);
	

}
