package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongchengwenjianDao;
import com.entity.GongchengwenjianEntity;
import com.service.GongchengwenjianService;
import com.entity.vo.GongchengwenjianVO;
import com.entity.view.GongchengwenjianView;

@Service("gongchengwenjianService")
public class GongchengwenjianServiceImpl extends ServiceImpl<GongchengwenjianDao, GongchengwenjianEntity> implements GongchengwenjianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongchengwenjianEntity> page = this.selectPage(
                new Query<GongchengwenjianEntity>(params).getPage(),
                new EntityWrapper<GongchengwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongchengwenjianEntity> wrapper) {
		  Page<GongchengwenjianView> page =new Query<GongchengwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongchengwenjianVO> selectListVO(Wrapper<GongchengwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongchengwenjianVO selectVO(Wrapper<GongchengwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongchengwenjianView> selectListView(Wrapper<GongchengwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongchengwenjianView selectView(Wrapper<GongchengwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
