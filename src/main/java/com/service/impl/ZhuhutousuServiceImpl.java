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


import com.dao.ZhuhutousuDao;
import com.entity.ZhuhutousuEntity;
import com.service.ZhuhutousuService;
import com.entity.vo.ZhuhutousuVO;
import com.entity.view.ZhuhutousuView;

@Service("zhuhutousuService")
public class ZhuhutousuServiceImpl extends ServiceImpl<ZhuhutousuDao, ZhuhutousuEntity> implements ZhuhutousuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuhutousuEntity> page = this.selectPage(
                new Query<ZhuhutousuEntity>(params).getPage(),
                new EntityWrapper<ZhuhutousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuhutousuEntity> wrapper) {
		  Page<ZhuhutousuView> page =new Query<ZhuhutousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuhutousuVO> selectListVO(Wrapper<ZhuhutousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuhutousuVO selectVO(Wrapper<ZhuhutousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuhutousuView> selectListView(Wrapper<ZhuhutousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuhutousuView selectView(Wrapper<ZhuhutousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
