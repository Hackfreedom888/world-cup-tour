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

import com.entity.QiuxingzhuanquEntity;
import com.entity.view.QiuxingzhuanquView;

import com.service.QiuxingzhuanquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * Stars
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@RestController
@RequestMapping("/qiuxingzhuanqu")
public class QiuxingzhuanquController {
    @Autowired
    private QiuxingzhuanquService qiuxingzhuanquService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiuxingzhuanquEntity qiuxingzhuanqu, 
		HttpServletRequest request){

        EntityWrapper<QiuxingzhuanquEntity> ew = new EntityWrapper<QiuxingzhuanquEntity>();


		PageUtils page = qiuxingzhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuxingzhuanqu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiuxingzhuanquEntity qiuxingzhuanqu, 
		HttpServletRequest request){
        EntityWrapper<QiuxingzhuanquEntity> ew = new EntityWrapper<QiuxingzhuanquEntity>();

		PageUtils page = qiuxingzhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuxingzhuanqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiuxingzhuanquEntity qiuxingzhuanqu){
       	EntityWrapper<QiuxingzhuanquEntity> ew = new EntityWrapper<QiuxingzhuanquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiuxingzhuanqu, "qiuxingzhuanqu")); 
        return R.ok().put("data", qiuxingzhuanquService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(QiuxingzhuanquEntity qiuxingzhuanqu){
        EntityWrapper< QiuxingzhuanquEntity> ew = new EntityWrapper< QiuxingzhuanquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiuxingzhuanqu, "qiuxingzhuanqu")); 
		QiuxingzhuanquView qiuxingzhuanquView =  qiuxingzhuanquService.selectView(ew);
		return R.ok("SearchStars成功").put("data", qiuxingzhuanquView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiuxingzhuanquEntity qiuxingzhuanqu = qiuxingzhuanquService.selectById(id);
        return R.ok().put("data", qiuxingzhuanqu);
    }

    /**
     * 前端Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiuxingzhuanquEntity qiuxingzhuanqu = qiuxingzhuanquService.selectById(id);
        return R.ok().put("data", qiuxingzhuanqu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiuxingzhuanquEntity qiuxingzhuanqu, HttpServletRequest request){
    	qiuxingzhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuxingzhuanqu);

        qiuxingzhuanquService.insert(qiuxingzhuanqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiuxingzhuanquEntity qiuxingzhuanqu, HttpServletRequest request){
    	qiuxingzhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuxingzhuanqu);

        qiuxingzhuanquService.insert(qiuxingzhuanqu);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiuxingzhuanquEntity qiuxingzhuanqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiuxingzhuanqu);
        qiuxingzhuanquService.updateById(qiuxingzhuanqu);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiuxingzhuanquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiuxingzhuanquEntity> wrapper = new EntityWrapper<QiuxingzhuanquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qiuxingzhuanquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
