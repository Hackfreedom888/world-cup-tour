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

import com.entity.DiscussqiuduizhuanquEntity;
import com.entity.view.DiscussqiuduizhuanquView;

import com.service.DiscussqiuduizhuanquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * Teams评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-15 11:33:11
 */
@RestController
@RequestMapping("/discussqiuduizhuanqu")
public class DiscussqiuduizhuanquController {
    @Autowired
    private DiscussqiuduizhuanquService discussqiuduizhuanquService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussqiuduizhuanquEntity discussqiuduizhuanqu, 
		HttpServletRequest request){

        EntityWrapper<DiscussqiuduizhuanquEntity> ew = new EntityWrapper<DiscussqiuduizhuanquEntity>();


		PageUtils page = discussqiuduizhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqiuduizhuanqu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussqiuduizhuanquEntity discussqiuduizhuanqu, 
		HttpServletRequest request){
        EntityWrapper<DiscussqiuduizhuanquEntity> ew = new EntityWrapper<DiscussqiuduizhuanquEntity>();

		PageUtils page = discussqiuduizhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqiuduizhuanqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussqiuduizhuanquEntity discussqiuduizhuanqu){
       	EntityWrapper<DiscussqiuduizhuanquEntity> ew = new EntityWrapper<DiscussqiuduizhuanquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussqiuduizhuanqu, "discussqiuduizhuanqu")); 
        return R.ok().put("data", discussqiuduizhuanquService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(DiscussqiuduizhuanquEntity discussqiuduizhuanqu){
        EntityWrapper< DiscussqiuduizhuanquEntity> ew = new EntityWrapper< DiscussqiuduizhuanquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussqiuduizhuanqu, "discussqiuduizhuanqu")); 
		DiscussqiuduizhuanquView discussqiuduizhuanquView =  discussqiuduizhuanquService.selectView(ew);
		return R.ok("SearchTeams评论表成功").put("data", discussqiuduizhuanquView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussqiuduizhuanquEntity discussqiuduizhuanqu = discussqiuduizhuanquService.selectById(id);
        return R.ok().put("data", discussqiuduizhuanqu);
    }

    /**
     * 前端Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussqiuduizhuanquEntity discussqiuduizhuanqu = discussqiuduizhuanquService.selectById(id);
        return R.ok().put("data", discussqiuduizhuanqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussqiuduizhuanquEntity discussqiuduizhuanqu, HttpServletRequest request){
    	discussqiuduizhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqiuduizhuanqu);

        discussqiuduizhuanquService.insert(discussqiuduizhuanqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussqiuduizhuanquEntity discussqiuduizhuanqu, HttpServletRequest request){
    	discussqiuduizhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqiuduizhuanqu);

        discussqiuduizhuanquService.insert(discussqiuduizhuanqu);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussqiuduizhuanquEntity discussqiuduizhuanqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussqiuduizhuanqu);
        discussqiuduizhuanquService.updateById(discussqiuduizhuanqu);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussqiuduizhuanquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscussqiuduizhuanquEntity> wrapper = new EntityWrapper<DiscussqiuduizhuanquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussqiuduizhuanquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
