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


import com.dao.BanzhushenqingDao;
import com.entity.BanzhushenqingEntity;
import com.service.BanzhushenqingService;
import com.entity.vo.BanzhushenqingVO;
import com.entity.view.BanzhushenqingView;

@Service("banzhushenqingService")
public class BanzhushenqingServiceImpl extends ServiceImpl<BanzhushenqingDao, BanzhushenqingEntity> implements BanzhushenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanzhushenqingEntity> page = this.selectPage(
                new Query<BanzhushenqingEntity>(params).getPage(),
                new EntityWrapper<BanzhushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanzhushenqingEntity> wrapper) {
		  Page<BanzhushenqingView> page =new Query<BanzhushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanzhushenqingVO> selectListVO(Wrapper<BanzhushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanzhushenqingVO selectVO(Wrapper<BanzhushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanzhushenqingView> selectListView(Wrapper<BanzhushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanzhushenqingView selectView(Wrapper<BanzhushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
