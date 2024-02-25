package com.dao;

import com.entity.ZhufangxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhufangxuqiuVO;
import com.entity.view.ZhufangxuqiuView;


/**
 * 住房需求
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
public interface ZhufangxuqiuDao extends BaseMapper<ZhufangxuqiuEntity> {
	
	List<ZhufangxuqiuVO> selectListVO(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
	
	ZhufangxuqiuVO selectVO(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
	
	List<ZhufangxuqiuView> selectListView(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);

	List<ZhufangxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
	
	ZhufangxuqiuView selectView(@Param("ew") Wrapper<ZhufangxuqiuEntity> wrapper);
	

}
