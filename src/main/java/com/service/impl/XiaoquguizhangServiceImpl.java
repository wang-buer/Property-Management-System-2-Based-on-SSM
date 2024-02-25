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


import com.dao.XiaoquguizhangDao;
import com.entity.XiaoquguizhangEntity;
import com.service.XiaoquguizhangService;
import com.entity.vo.XiaoquguizhangVO;
import com.entity.view.XiaoquguizhangView;

@Service("xiaoquguizhangService")
public class XiaoquguizhangServiceImpl extends ServiceImpl<XiaoquguizhangDao, XiaoquguizhangEntity> implements XiaoquguizhangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoquguizhangEntity> page = this.selectPage(
                new Query<XiaoquguizhangEntity>(params).getPage(),
                new EntityWrapper<XiaoquguizhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoquguizhangEntity> wrapper) {
		  Page<XiaoquguizhangView> page =new Query<XiaoquguizhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoquguizhangVO> selectListVO(Wrapper<XiaoquguizhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoquguizhangVO selectVO(Wrapper<XiaoquguizhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoquguizhangView> selectListView(Wrapper<XiaoquguizhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoquguizhangView selectView(Wrapper<XiaoquguizhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
