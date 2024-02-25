package com.dao;

import com.entity.WuyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuyeVO;
import com.entity.view.WuyeView;


/**
 * 物业
 * 
 * @author 
 * @email 
 * @date 2022-02-27 18:41:02
 */
public interface WuyeDao extends BaseMapper<WuyeEntity> {
	
	List<WuyeVO> selectListVO(@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	WuyeVO selectVO(@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	List<WuyeView> selectListView(@Param("ew") Wrapper<WuyeEntity> wrapper);

	List<WuyeView> selectListView(Pagination page,@Param("ew") Wrapper<WuyeEntity> wrapper);
	
	WuyeView selectView(@Param("ew") Wrapper<WuyeEntity> wrapper);
	

}
