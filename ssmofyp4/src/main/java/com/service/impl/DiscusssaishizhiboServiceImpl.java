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


import com.dao.DiscusssaishizhiboDao;
import com.entity.DiscusssaishizhiboEntity;
import com.service.DiscusssaishizhiboService;
import com.entity.vo.DiscusssaishizhiboVO;
import com.entity.view.DiscusssaishizhiboView;

@Service("discusssaishizhiboService")
public class DiscusssaishizhiboServiceImpl extends ServiceImpl<DiscusssaishizhiboDao, DiscusssaishizhiboEntity> implements DiscusssaishizhiboService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssaishizhiboEntity> page = this.selectPage(
                new Query<DiscusssaishizhiboEntity>(params).getPage(),
                new EntityWrapper<DiscusssaishizhiboEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssaishizhiboEntity> wrapper) {
		  Page<DiscusssaishizhiboView> page =new Query<DiscusssaishizhiboView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssaishizhiboVO> selectListVO(Wrapper<DiscusssaishizhiboEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssaishizhiboVO selectVO(Wrapper<DiscusssaishizhiboEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssaishizhiboView> selectListView(Wrapper<DiscusssaishizhiboEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssaishizhiboView selectView(Wrapper<DiscusssaishizhiboEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
