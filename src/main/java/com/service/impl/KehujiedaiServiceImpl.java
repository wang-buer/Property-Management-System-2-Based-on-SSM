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


import com.dao.KehujiedaiDao;
import com.entity.KehujiedaiEntity;
import com.service.KehujiedaiService;
import com.entity.vo.KehujiedaiVO;
import com.entity.view.KehujiedaiView;

@Service("kehujiedaiService")
public class KehujiedaiServiceImpl extends ServiceImpl<KehujiedaiDao, KehujiedaiEntity> implements KehujiedaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehujiedaiEntity> page = this.selectPage(
                new Query<KehujiedaiEntity>(params).getPage(),
                new EntityWrapper<KehujiedaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehujiedaiEntity> wrapper) {
		  Page<KehujiedaiView> page =new Query<KehujiedaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehujiedaiVO> selectListVO(Wrapper<KehujiedaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehujiedaiVO selectVO(Wrapper<KehujiedaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehujiedaiView> selectListView(Wrapper<KehujiedaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehujiedaiView selectView(Wrapper<KehujiedaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
