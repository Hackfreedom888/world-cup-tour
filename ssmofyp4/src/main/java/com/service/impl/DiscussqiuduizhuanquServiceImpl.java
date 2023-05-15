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


import com.dao.DiscussqiuduizhuanquDao;
import com.entity.DiscussqiuduizhuanquEntity;
import com.service.DiscussqiuduizhuanquService;
import com.entity.vo.DiscussqiuduizhuanquVO;
import com.entity.view.DiscussqiuduizhuanquView;

@Service("discussqiuduizhuanquService")
public class DiscussqiuduizhuanquServiceImpl extends ServiceImpl<DiscussqiuduizhuanquDao, DiscussqiuduizhuanquEntity> implements DiscussqiuduizhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuduizhuanquEntity> page = this.selectPage(
                new Query<DiscussqiuduizhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuduizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuduizhuanquEntity> wrapper) {
		  Page<DiscussqiuduizhuanquView> page =new Query<DiscussqiuduizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuduizhuanquVO> selectListVO(Wrapper<DiscussqiuduizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuduizhuanquVO selectVO(Wrapper<DiscussqiuduizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuduizhuanquView> selectListView(Wrapper<DiscussqiuduizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuduizhuanquView selectView(Wrapper<DiscussqiuduizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
