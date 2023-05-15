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


import com.dao.QiuduizhuanquDao;
import com.entity.QiuduizhuanquEntity;
import com.service.QiuduizhuanquService;
import com.entity.vo.QiuduizhuanquVO;
import com.entity.view.QiuduizhuanquView;

@Service("qiuduizhuanquService")
public class QiuduizhuanquServiceImpl extends ServiceImpl<QiuduizhuanquDao, QiuduizhuanquEntity> implements QiuduizhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuduizhuanquEntity> page = this.selectPage(
                new Query<QiuduizhuanquEntity>(params).getPage(),
                new EntityWrapper<QiuduizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuduizhuanquEntity> wrapper) {
		  Page<QiuduizhuanquView> page =new Query<QiuduizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuduizhuanquVO> selectListVO(Wrapper<QiuduizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuduizhuanquVO selectVO(Wrapper<QiuduizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuduizhuanquView> selectListView(Wrapper<QiuduizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuduizhuanquView selectView(Wrapper<QiuduizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
