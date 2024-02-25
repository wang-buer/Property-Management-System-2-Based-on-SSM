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

import com.entity.ZhufangxuqiuEntity;
import com.entity.view.ZhufangxuqiuView;

import com.service.ZhufangxuqiuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 住房需求
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-27 18:41:03
 */
@RestController
@RequestMapping("/zhufangxuqiu")
public class ZhufangxuqiuController {
    @Autowired
    private ZhufangxuqiuService zhufangxuqiuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhufangxuqiuEntity zhufangxuqiu, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("wuye")) {
			zhufangxuqiu.setWuyezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhufangxuqiuEntity> ew = new EntityWrapper<ZhufangxuqiuEntity>();
    	PageUtils page = zhufangxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhufangxuqiu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhufangxuqiuEntity zhufangxuqiu, 
		HttpServletRequest request){
        EntityWrapper<ZhufangxuqiuEntity> ew = new EntityWrapper<ZhufangxuqiuEntity>();
    	PageUtils page = zhufangxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhufangxuqiu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhufangxuqiuEntity zhufangxuqiu){
       	EntityWrapper<ZhufangxuqiuEntity> ew = new EntityWrapper<ZhufangxuqiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhufangxuqiu, "zhufangxuqiu")); 
        return R.ok().put("data", zhufangxuqiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhufangxuqiuEntity zhufangxuqiu){
        EntityWrapper< ZhufangxuqiuEntity> ew = new EntityWrapper< ZhufangxuqiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhufangxuqiu, "zhufangxuqiu")); 
		ZhufangxuqiuView zhufangxuqiuView =  zhufangxuqiuService.selectView(ew);
		return R.ok("查询住房需求成功").put("data", zhufangxuqiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhufangxuqiuEntity zhufangxuqiu = zhufangxuqiuService.selectById(id);
        return R.ok().put("data", zhufangxuqiu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhufangxuqiuEntity zhufangxuqiu = zhufangxuqiuService.selectById(id);
        return R.ok().put("data", zhufangxuqiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhufangxuqiuEntity zhufangxuqiu, HttpServletRequest request){
    	zhufangxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhufangxuqiu);

        zhufangxuqiuService.insert(zhufangxuqiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhufangxuqiuEntity zhufangxuqiu, HttpServletRequest request){
    	zhufangxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhufangxuqiu);

        zhufangxuqiuService.insert(zhufangxuqiu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhufangxuqiuEntity zhufangxuqiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhufangxuqiu);
        zhufangxuqiuService.updateById(zhufangxuqiu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhufangxuqiuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhufangxuqiuEntity> wrapper = new EntityWrapper<ZhufangxuqiuEntity>();
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

		int count = zhufangxuqiuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
