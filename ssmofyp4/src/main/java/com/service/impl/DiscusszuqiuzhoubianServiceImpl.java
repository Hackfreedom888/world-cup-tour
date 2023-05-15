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


import com.dao.DiscusszuqiuzhoubianDao;
import com.entity.DiscusszuqiuzhoubianEntity;
import com.service.DiscusszuqiuzhoubianService;
import com.entity.vo.DiscusszuqiuzhoubianVO;
import com.entity.view.DiscusszuqiuzhoubianView;

@Service("discusszuqiuzhoubianService")
public class DiscusszuqiuzhoubianServiceImpl extends ServiceImpl<DiscusszuqiuzhoubianDao, DiscusszuqiuzhoubianEntity> implements DiscusszuqiuzhoubianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuqiuzhoubianEntity> page = this.selectPage(
                new Query<DiscusszuqiuzhoubianEntity>(params).getPage(),
                new EntityWrapper<DiscusszuqiuzhoubianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuqiuzhoubianEntity> wrapper) {
		  Page<DiscusszuqiuzhoubianView> page =new Query<DiscusszuqiuzhoubianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuqiuzhoubianVO> selectListVO(Wrapper<DiscusszuqiuzhoubianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuqiuzhoubianVO selectVO(Wrapper<DiscusszuqiuzhoubianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuqiuzhoubianView> selectListView(Wrapper<DiscusszuqiuzhoubianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuqiuzhoubianView selectView(Wrapper<DiscusszuqiuzhoubianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
