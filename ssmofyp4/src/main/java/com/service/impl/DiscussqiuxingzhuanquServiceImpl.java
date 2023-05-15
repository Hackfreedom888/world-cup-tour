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


import com.dao.DiscussqiuxingzhuanquDao;
import com.entity.DiscussqiuxingzhuanquEntity;
import com.service.DiscussqiuxingzhuanquService;
import com.entity.vo.DiscussqiuxingzhuanquVO;
import com.entity.view.DiscussqiuxingzhuanquView;

@Service("discussqiuxingzhuanquService")
public class DiscussqiuxingzhuanquServiceImpl extends ServiceImpl<DiscussqiuxingzhuanquDao, DiscussqiuxingzhuanquEntity> implements DiscussqiuxingzhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuxingzhuanquEntity> page = this.selectPage(
                new Query<DiscussqiuxingzhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuxingzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuxingzhuanquEntity> wrapper) {
		  Page<DiscussqiuxingzhuanquView> page =new Query<DiscussqiuxingzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuxingzhuanquVO> selectListVO(Wrapper<DiscussqiuxingzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuxingzhuanquVO selectVO(Wrapper<DiscussqiuxingzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuxingzhuanquView> selectListView(Wrapper<DiscussqiuxingzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuxingzhuanquView selectView(Wrapper<DiscussqiuxingzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
