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


import com.dao.DiscusszaixianshoupiaoDao;
import com.entity.DiscusszaixianshoupiaoEntity;
import com.service.DiscusszaixianshoupiaoService;
import com.entity.vo.DiscusszaixianshoupiaoVO;
import com.entity.view.DiscusszaixianshoupiaoView;

@Service("discusszaixianshoupiaoService")
public class DiscusszaixianshoupiaoServiceImpl extends ServiceImpl<DiscusszaixianshoupiaoDao, DiscusszaixianshoupiaoEntity> implements DiscusszaixianshoupiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixianshoupiaoEntity> page = this.selectPage(
                new Query<DiscusszaixianshoupiaoEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixianshoupiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixianshoupiaoEntity> wrapper) {
		  Page<DiscusszaixianshoupiaoView> page =new Query<DiscusszaixianshoupiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixianshoupiaoVO> selectListVO(Wrapper<DiscusszaixianshoupiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixianshoupiaoVO selectVO(Wrapper<DiscusszaixianshoupiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixianshoupiaoView> selectListView(Wrapper<DiscusszaixianshoupiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixianshoupiaoView selectView(Wrapper<DiscusszaixianshoupiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
