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

import com.entity.ZaixianshoupiaoEntity;
import com.entity.view.ZaixianshoupiaoView;

import com.service.ZaixianshoupiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * Online Tickets
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@RestController
@RequestMapping("/zaixianshoupiao")
public class ZaixianshoupiaoController {
    @Autowired
    private ZaixianshoupiaoService zaixianshoupiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixianshoupiaoEntity zaixianshoupiao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date bisaishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date bisaishijianend,
		HttpServletRequest request){

        EntityWrapper<ZaixianshoupiaoEntity> ew = new EntityWrapper<ZaixianshoupiaoEntity>();

                if(bisaishijianstart!=null) ew.ge("bisaishijian", bisaishijianstart);
                if(bisaishijianend!=null) ew.le("bisaishijian", bisaishijianend);

		PageUtils page = zaixianshoupiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianshoupiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixianshoupiaoEntity zaixianshoupiao, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date bisaishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date bisaishijianend,
		HttpServletRequest request){
        EntityWrapper<ZaixianshoupiaoEntity> ew = new EntityWrapper<ZaixianshoupiaoEntity>();
                if(bisaishijianstart!=null) ew.ge("bisaishijian", bisaishijianstart);
                if(bisaishijianend!=null) ew.le("bisaishijian", bisaishijianend);

		PageUtils page = zaixianshoupiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianshoupiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixianshoupiaoEntity zaixianshoupiao){
       	EntityWrapper<ZaixianshoupiaoEntity> ew = new EntityWrapper<ZaixianshoupiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixianshoupiao, "zaixianshoupiao")); 
        return R.ok().put("data", zaixianshoupiaoService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(ZaixianshoupiaoEntity zaixianshoupiao){
        EntityWrapper< ZaixianshoupiaoEntity> ew = new EntityWrapper< ZaixianshoupiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixianshoupiao, "zaixianshoupiao")); 
		ZaixianshoupiaoView zaixianshoupiaoView =  zaixianshoupiaoService.selectView(ew);
		return R.ok("SearchOnline Tickets成功").put("data", zaixianshoupiaoView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixianshoupiaoEntity zaixianshoupiao = zaixianshoupiaoService.selectById(id);
        return R.ok().put("data", zaixianshoupiao);
    }

    /**
     * 前端Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixianshoupiaoEntity zaixianshoupiao = zaixianshoupiaoService.selectById(id);
        return R.ok().put("data", zaixianshoupiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixianshoupiaoEntity zaixianshoupiao, HttpServletRequest request){
    	zaixianshoupiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianshoupiao);

        zaixianshoupiaoService.insert(zaixianshoupiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZaixianshoupiaoEntity zaixianshoupiao, HttpServletRequest request){
    	zaixianshoupiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianshoupiao);

        zaixianshoupiaoService.insert(zaixianshoupiao);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZaixianshoupiaoEntity zaixianshoupiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixianshoupiao);
        zaixianshoupiaoService.updateById(zaixianshoupiao);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixianshoupiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZaixianshoupiaoEntity> wrapper = new EntityWrapper<ZaixianshoupiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zaixianshoupiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
