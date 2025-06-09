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


import com.dao.DiscussremendianyingDao;
import com.entity.DiscussremendianyingEntity;
import com.service.DiscussremendianyingService;
import com.entity.vo.DiscussremendianyingVO;
import com.entity.view.DiscussremendianyingView;

@Service("discussremendianyingService")
public class DiscussremendianyingServiceImpl extends ServiceImpl<DiscussremendianyingDao, DiscussremendianyingEntity> implements DiscussremendianyingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremendianyingEntity> page = this.selectPage(
                new Query<DiscussremendianyingEntity>(params).getPage(),
                new EntityWrapper<DiscussremendianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremendianyingEntity> wrapper) {
		  Page<DiscussremendianyingView> page =new Query<DiscussremendianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremendianyingVO> selectListVO(Wrapper<DiscussremendianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremendianyingVO selectVO(Wrapper<DiscussremendianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremendianyingView> selectListView(Wrapper<DiscussremendianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremendianyingView selectView(Wrapper<DiscussremendianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
