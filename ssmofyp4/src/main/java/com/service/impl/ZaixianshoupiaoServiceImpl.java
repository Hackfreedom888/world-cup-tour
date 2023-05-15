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


import com.dao.ZaixianshoupiaoDao;
import com.entity.ZaixianshoupiaoEntity;
import com.service.ZaixianshoupiaoService;
import com.entity.vo.ZaixianshoupiaoVO;
import com.entity.view.ZaixianshoupiaoView;

@Service("zaixianshoupiaoService")
public class ZaixianshoupiaoServiceImpl extends ServiceImpl<ZaixianshoupiaoDao, ZaixianshoupiaoEntity> implements ZaixianshoupiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianshoupiaoEntity> page = this.selectPage(
                new Query<ZaixianshoupiaoEntity>(params).getPage(),
                new EntityWrapper<ZaixianshoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianshoupiaoEntity> wrapper) {
		  Page<ZaixianshoupiaoView> page =new Query<ZaixianshoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianshoupiaoVO> selectListVO(Wrapper<ZaixianshoupiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianshoupiaoVO selectVO(Wrapper<ZaixianshoupiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianshoupiaoView> selectListView(Wrapper<ZaixianshoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianshoupiaoView selectView(Wrapper<ZaixianshoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
