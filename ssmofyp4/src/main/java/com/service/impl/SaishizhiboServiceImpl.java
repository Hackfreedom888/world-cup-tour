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


import com.dao.SaishizhiboDao;
import com.entity.SaishizhiboEntity;
import com.service.SaishizhiboService;
import com.entity.vo.SaishizhiboVO;
import com.entity.view.SaishizhiboView;

@Service("saishizhiboService")
public class SaishizhiboServiceImpl extends ServiceImpl<SaishizhiboDao, SaishizhiboEntity> implements SaishizhiboService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishizhiboEntity> page = this.selectPage(
                new Query<SaishizhiboEntity>(params).getPage(),
                new EntityWrapper<SaishizhiboEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishizhiboEntity> wrapper) {
		  Page<SaishizhiboView> page =new Query<SaishizhiboView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishizhiboVO> selectListVO(Wrapper<SaishizhiboEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishizhiboVO selectVO(Wrapper<SaishizhiboEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishizhiboView> selectListView(Wrapper<SaishizhiboEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishizhiboView selectView(Wrapper<SaishizhiboEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
