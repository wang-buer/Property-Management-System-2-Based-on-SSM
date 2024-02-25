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


import com.dao.KaifashangDao;
import com.entity.KaifashangEntity;
import com.service.KaifashangService;
import com.entity.vo.KaifashangVO;
import com.entity.view.KaifashangView;

@Service("kaifashangService")
public class KaifashangServiceImpl extends ServiceImpl<KaifashangDao, KaifashangEntity> implements KaifashangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaifashangEntity> page = this.selectPage(
                new Query<KaifashangEntity>(params).getPage(),
                new EntityWrapper<KaifashangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaifashangEntity> wrapper) {
		  Page<KaifashangView> page =new Query<KaifashangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaifashangVO> selectListVO(Wrapper<KaifashangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaifashangVO selectVO(Wrapper<KaifashangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaifashangView> selectListView(Wrapper<KaifashangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaifashangView selectView(Wrapper<KaifashangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
