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


import com.dao.QiuxingzhuanquDao;
import com.entity.QiuxingzhuanquEntity;
import com.service.QiuxingzhuanquService;
import com.entity.vo.QiuxingzhuanquVO;
import com.entity.view.QiuxingzhuanquView;

@Service("qiuxingzhuanquService")
public class QiuxingzhuanquServiceImpl extends ServiceImpl<QiuxingzhuanquDao, QiuxingzhuanquEntity> implements QiuxingzhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuxingzhuanquEntity> page = this.selectPage(
                new Query<QiuxingzhuanquEntity>(params).getPage(),
                new EntityWrapper<QiuxingzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuxingzhuanquEntity> wrapper) {
		  Page<QiuxingzhuanquView> page =new Query<QiuxingzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuxingzhuanquVO> selectListVO(Wrapper<QiuxingzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuxingzhuanquVO selectVO(Wrapper<QiuxingzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuxingzhuanquView> selectListView(Wrapper<QiuxingzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuxingzhuanquView selectView(Wrapper<QiuxingzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
