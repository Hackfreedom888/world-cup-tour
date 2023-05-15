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

import com.entity.QiuduizhuanquEntity;
import com.entity.view.QiuduizhuanquView;

import com.service.QiuduizhuanquService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * Teams
 * 后端接口
 * @author 
 * @email 
 * @date 2022-11-15 11:33:10
 */
@RestController
@RequestMapping("/qiuduizhuanqu")
public class QiuduizhuanquController {
    @Autowired
    private QiuduizhuanquService qiuduizhuanquService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiuduizhuanquEntity qiuduizhuanqu, 
		HttpServletRequest request){

        EntityWrapper<QiuduizhuanquEntity> ew = new EntityWrapper<QiuduizhuanquEntity>();


		PageUtils page = qiuduizhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuduizhuanqu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiuduizhuanquEntity qiuduizhuanqu, 
		HttpServletRequest request){
        EntityWrapper<QiuduizhuanquEntity> ew = new EntityWrapper<QiuduizhuanquEntity>();

		PageUtils page = qiuduizhuanquService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuduizhuanqu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiuduizhuanquEntity qiuduizhuanqu){
       	EntityWrapper<QiuduizhuanquEntity> ew = new EntityWrapper<QiuduizhuanquEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiuduizhuanqu, "qiuduizhuanqu")); 
        return R.ok().put("data", qiuduizhuanquService.selectListView(ew));
    }

	 /**
     * Search
     */
    @RequestMapping("/query")
    public R query(QiuduizhuanquEntity qiuduizhuanqu){
        EntityWrapper< QiuduizhuanquEntity> ew = new EntityWrapper< QiuduizhuanquEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiuduizhuanqu, "qiuduizhuanqu")); 
		QiuduizhuanquView qiuduizhuanquView =  qiuduizhuanquService.selectView(ew);
		return R.ok("SearchTeams成功").put("data", qiuduizhuanquView);
    }
	
    /**
     * 后端Details
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiuduizhuanquEntity qiuduizhuanqu = qiuduizhuanquService.selectById(id);
        return R.ok().put("data", qiuduizhuanqu);
    }

    /**
     * 前端Details
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiuduizhuanquEntity qiuduizhuanqu = qiuduizhuanquService.selectById(id);
        return R.ok().put("data", qiuduizhuanqu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        QiuduizhuanquEntity qiuduizhuanqu = qiuduizhuanquService.selectById(id);
        if(type.equals("1")) {
        	qiuduizhuanqu.setThumbsupnum(qiuduizhuanqu.getThumbsupnum()+1);
        } else {
        	qiuduizhuanqu.setCrazilynum(qiuduizhuanqu.getCrazilynum()+1);
        }
        qiuduizhuanquService.updateById(qiuduizhuanqu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiuduizhuanquEntity qiuduizhuanqu, HttpServletRequest request){
    	qiuduizhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuduizhuanqu);

        qiuduizhuanquService.insert(qiuduizhuanqu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiuduizhuanquEntity qiuduizhuanqu, HttpServletRequest request){
    	qiuduizhuanqu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuduizhuanqu);

        qiuduizhuanquService.insert(qiuduizhuanqu);
        return R.ok();
    }


    /**
     * Modify
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiuduizhuanquEntity qiuduizhuanqu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiuduizhuanqu);
        qiuduizhuanquService.updateById(qiuduizhuanqu);//全部更新
        return R.ok();
    }
    

    /**
     * Delete
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiuduizhuanquService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiuduizhuanquEntity> wrapper = new EntityWrapper<QiuduizhuanquEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qiuduizhuanquService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
