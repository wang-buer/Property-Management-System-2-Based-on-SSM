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

import com.entity.WuyeshoufeiEntity;
import com.entity.view.WuyeshoufeiView;

import com.service.WuyeshoufeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 物业收费
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@RestController
@RequestMapping("/wuyeshoufei")
public class WuyeshoufeiController {
    @Autowired
    private WuyeshoufeiService wuyeshoufeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WuyeshoufeiEntity wuyeshoufei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhuhu")) {
			wuyeshoufei.setZhuhuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("wuye")) {
			wuyeshoufei.setWuyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WuyeshoufeiEntity> ew = new EntityWrapper<WuyeshoufeiEntity>();
    	PageUtils page = wuyeshoufeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuyeshoufei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WuyeshoufeiEntity wuyeshoufei, 
		HttpServletRequest request){
        EntityWrapper<WuyeshoufeiEntity> ew = new EntityWrapper<WuyeshoufeiEntity>();
    	PageUtils page = wuyeshoufeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wuyeshoufei), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WuyeshoufeiEntity wuyeshoufei){
       	EntityWrapper<WuyeshoufeiEntity> ew = new EntityWrapper<WuyeshoufeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wuyeshoufei, "wuyeshoufei")); 
        return R.ok().put("data", wuyeshoufeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WuyeshoufeiEntity wuyeshoufei){
        EntityWrapper< WuyeshoufeiEntity> ew = new EntityWrapper< WuyeshoufeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wuyeshoufei, "wuyeshoufei")); 
		WuyeshoufeiView wuyeshoufeiView =  wuyeshoufeiService.selectView(ew);
		return R.ok("查询物业收费成功").put("data", wuyeshoufeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WuyeshoufeiEntity wuyeshoufei = wuyeshoufeiService.selectById(id);
        return R.ok().put("data", wuyeshoufei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WuyeshoufeiEntity wuyeshoufei = wuyeshoufeiService.selectById(id);
        return R.ok().put("data", wuyeshoufei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WuyeshoufeiEntity wuyeshoufei, HttpServletRequest request){
    	wuyeshoufei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuyeshoufei);

        wuyeshoufeiService.insert(wuyeshoufei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WuyeshoufeiEntity wuyeshoufei, HttpServletRequest request){
    	wuyeshoufei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wuyeshoufei);

        wuyeshoufeiService.insert(wuyeshoufei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WuyeshoufeiEntity wuyeshoufei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wuyeshoufei);
        wuyeshoufeiService.updateById(wuyeshoufei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wuyeshoufeiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WuyeshoufeiEntity> wrapper = new EntityWrapper<WuyeshoufeiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhuhu")) {
			wrapper.eq("zhuhuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("wuye")) {
			wrapper.eq("wuyezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wuyeshoufeiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
