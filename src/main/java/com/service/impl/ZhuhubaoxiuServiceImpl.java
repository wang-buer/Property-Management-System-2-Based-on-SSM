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


import com.dao.ZhuhubaoxiuDao;
import com.entity.ZhuhubaoxiuEntity;
import com.service.ZhuhubaoxiuService;
import com.entity.vo.ZhuhubaoxiuVO;
import com.entity.view.ZhuhubaoxiuView;

@Service("zhuhubaoxiuService")
public class ZhuhubaoxiuServiceImpl extends ServiceImpl<ZhuhubaoxiuDao, ZhuhubaoxiuEntity> implements ZhuhubaoxiuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuhubaoxiuEntity> page = this.selectPage(
                new Query<ZhuhubaoxiuEntity>(params).getPage(),
                new EntityWrapper<ZhuhubaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuhubaoxiuEntity> wrapper) {
		  Page<ZhuhubaoxiuView> page =new Query<ZhuhubaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuhubaoxiuVO> selectListVO(Wrapper<ZhuhubaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuhubaoxiuVO selectVO(Wrapper<ZhuhubaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuhubaoxiuView> selectListView(Wrapper<ZhuhubaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuhubaoxiuView selectView(Wrapper<ZhuhubaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
