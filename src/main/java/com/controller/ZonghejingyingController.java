package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZonghejingyingEntity;
import com.entity.view.ZonghejingyingView;

import com.service.ZonghejingyingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 综合经营
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@RestController
@RequestMapping("/zonghejingying")
public class ZonghejingyingController {
    @Autowired
    private ZonghejingyingService zonghejingyingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZonghejingyingEntity zonghejingying, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("wuye")) {
			zonghejingying.setWuyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZonghejingyingEntity> ew = new EntityWrapper<ZonghejingyingEntity>();
    	PageUtils page = zonghejingyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zonghejingying), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZonghejingyingEntity zonghejingying, 
		HttpServletRequest request){
        EntityWrapper<ZonghejingyingEntity> ew = new EntityWrapper<ZonghejingyingEntity>();
    	PageUtils page = zonghejingyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zonghejingying), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZonghejingyingEntity zonghejingying){
       	EntityWrapper<ZonghejingyingEntity> ew = new EntityWrapper<ZonghejingyingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zonghejingying, "zonghejingying")); 
        return R.ok().put("data", zonghejingyingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZonghejingyingEntity zonghejingying){
        EntityWrapper< ZonghejingyingEntity> ew = new EntityWrapper< ZonghejingyingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zonghejingying, "zonghejingying")); 
		ZonghejingyingView zonghejingyingView =  zonghejingyingService.selectView(ew);
		return R.ok("查询综合经营成功").put("data", zonghejingyingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZonghejingyingEntity zonghejingying = zonghejingyingService.selectById(id);
        return R.ok().put("data", zonghejingying);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZonghejingyingEntity zonghejingying = zonghejingyingService.selectById(id);
        return R.ok().put("data", zonghejingying);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZonghejingyingEntity zonghejingying, HttpServletRequest request){
    	zonghejingying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zonghejingying);

        zonghejingyingService.insert(zonghejingying);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZonghejingyingEntity zonghejingying, HttpServletRequest request){
    	zonghejingying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zonghejingying);

        zonghejingyingService.insert(zonghejingying);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZonghejingyingEntity zonghejingying, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zonghejingying);
        zonghejingyingService.updateById(zonghejingying);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zonghejingyingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZonghejingyingEntity> wrapper = new EntityWrapper<ZonghejingyingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("wuye")) {
			wrapper.eq("wuyezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zonghejingyingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
