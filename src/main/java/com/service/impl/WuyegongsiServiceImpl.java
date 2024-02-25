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


import com.dao.WuyegongsiDao;
import com.entity.WuyegongsiEntity;
import com.service.WuyegongsiService;
import com.entity.vo.WuyegongsiVO;
import com.entity.view.WuyegongsiView;

@Service("wuyegongsiService")
public class WuyegongsiServiceImpl extends ServiceImpl<WuyegongsiDao, WuyegongsiEntity> implements WuyegongsiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuyegongsiEntity> page = this.selectPage(
                new Query<WuyegongsiEntity>(params).getPage(),
                new EntityWrapper<WuyegongsiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuyegongsiEntity> wrapper) {
		  Page<WuyegongsiView> page =new Query<WuyegongsiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuyegongsiVO> selectListVO(Wrapper<WuyegongsiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuyegongsiVO selectVO(Wrapper<WuyegongsiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuyegongsiView> selectListView(Wrapper<WuyegongsiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuyegongsiView selectView(Wrapper<WuyegongsiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
