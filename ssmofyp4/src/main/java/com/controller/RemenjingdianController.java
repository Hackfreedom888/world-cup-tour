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
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RemenjingdianEntity;
import com.entity.view.RemenjingdianView;

import com.service.RemenjingdianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * Popular Sites
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@RestController
@RequestMapping("/remenjingdian")
public class RemenjingdianController {
    @Autowired
    private RemenjingdianService remenjingdianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RemenjingdianEntity remenjingdian, 
		HttpServletRequest request){

        EntityWrapper<RemenjingdianEntity> ew = new EntityWrapper<RemenjingdianEntity>();


		PageUtils page = remenjingdianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenjingdian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RemenjingdianEntity remenjingdian, 
		HttpServletRequest request){
        EntityWrapper<RemenjingdianEntity> ew = new EntityWrapper<RemenjingdianEntity>();

		PageUtils page = remenjingdianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenjingdian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RemenjingdianEntity remenjingdian){
       	EntityWrapper<RemenjingdianEntity> ew = new EntityWrapper<RemenjingdianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( remenjingdian, "remenjingdian")); 
        return R.ok().put("data", remenjingdianService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(RemenjingdianEntity remenjingdian){
        EntityWrapper< RemenjingdianEntity> ew = new EntityWrapper< RemenjingdianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( remenjingdian, "remenjingdian")); 
		RemenjingdianView remenjingdianView =  remenjingdianService.selectView(ew);
		return R.ok("SearchPopular Sites成功").put("data", remenjingdianView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RemenjingdianEntity remenjingdian = remenjingdianService.selectById(id);
		remenjingdian.setClicknum(remenjingdian.getClicknum()+1);
		remenjingdian.setClicktime(new Date());
		remenjingdianService.updateById(remenjingdian);
        return R.ok().put("data", remenjingdian);
    }

    /**
     * 前端Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RemenjingdianEntity remenjingdian = remenjingdianService.selectById(id);
		remenjingdian.setClicknum(remenjingdian.getClicknum()+1);
		remenjingdian.setClicktime(new Date());
		remenjingdianService.updateById(remenjingdian);
        return R.ok().put("data", remenjingdian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RemenjingdianEntity remenjingdian, HttpServletRequest request){
    	remenjingdian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remenjingdian);

        remenjingdianService.insert(remenjingdian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RemenjingdianEntity remenjingdian, HttpServletRequest request){
    	remenjingdian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(remenjingdian);

        remenjingdianService.insert(remenjingdian);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RemenjingdianEntity remenjingdian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(remenjingdian);
        remenjingdianService.updateById(remenjingdian);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        remenjingdianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RemenjingdianEntity> wrapper = new EntityWrapper<RemenjingdianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = remenjingdianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,RemenjingdianEntity remenjingdian, HttpServletRequest request,String pre){
        EntityWrapper<RemenjingdianEntity> ew = new EntityWrapper<RemenjingdianEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = remenjingdianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, remenjingdian), params), params));
        return R.ok().put("data", page);
    }








}
