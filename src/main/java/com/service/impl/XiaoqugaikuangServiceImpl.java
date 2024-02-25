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


import com.dao.XiaoqugaikuangDao;
import com.entity.XiaoqugaikuangEntity;
import com.service.XiaoqugaikuangService;
import com.entity.vo.XiaoqugaikuangVO;
import com.entity.view.XiaoqugaikuangView;

@Service("xiaoqugaikuangService")
public class XiaoqugaikuangServiceImpl extends ServiceImpl<XiaoqugaikuangDao, XiaoqugaikuangEntity> implements XiaoqugaikuangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoqugaikuangEntity> page = this.selectPage(
                new Query<XiaoqugaikuangEntity>(params).getPage(),
                new EntityWrapper<XiaoqugaikuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoqugaikuangEntity> wrapper) {
		  Page<XiaoqugaikuangView> page =new Query<XiaoqugaikuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoqugaikuangVO> selectListVO(Wrapper<XiaoqugaikuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoqugaikuangVO selectVO(Wrapper<XiaoqugaikuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoqugaikuangView> selectListView(Wrapper<XiaoqugaikuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoqugaikuangView selectView(Wrapper<XiaoqugaikuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
