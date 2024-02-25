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


import com.dao.ZonghejingyingDao;
import com.entity.ZonghejingyingEntity;
import com.service.ZonghejingyingService;
import com.entity.vo.ZonghejingyingVO;
import com.entity.view.ZonghejingyingView;

@Service("zonghejingyingService")
public class ZonghejingyingServiceImpl extends ServiceImpl<ZonghejingyingDao, ZonghejingyingEntity> implements ZonghejingyingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghejingyingEntity> page = this.selectPage(
                new Query<ZonghejingyingEntity>(params).getPage(),
                new EntityWrapper<ZonghejingyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghejingyingEntity> wrapper) {
		  Page<ZonghejingyingView> page =new Query<ZonghejingyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghejingyingVO> selectListVO(Wrapper<ZonghejingyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghejingyingVO selectVO(Wrapper<ZonghejingyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghejingyingView> selectListView(Wrapper<ZonghejingyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghejingyingView selectView(Wrapper<ZonghejingyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
