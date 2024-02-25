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


import com.dao.ZhufangxuqiuDao;
import com.entity.ZhufangxuqiuEntity;
import com.service.ZhufangxuqiuService;
import com.entity.vo.ZhufangxuqiuVO;
import com.entity.view.ZhufangxuqiuView;

@Service("zhufangxuqiuService")
public class ZhufangxuqiuServiceImpl extends ServiceImpl<ZhufangxuqiuDao, ZhufangxuqiuEntity> implements ZhufangxuqiuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhufangxuqiuEntity> page = this.selectPage(
                new Query<ZhufangxuqiuEntity>(params).getPage(),
                new EntityWrapper<ZhufangxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhufangxuqiuEntity> wrapper) {
		  Page<ZhufangxuqiuView> page =new Query<ZhufangxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhufangxuqiuVO> selectListVO(Wrapper<ZhufangxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhufangxuqiuVO selectVO(Wrapper<ZhufangxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhufangxuqiuView> selectListView(Wrapper<ZhufangxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhufangxuqiuView selectView(Wrapper<ZhufangxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
