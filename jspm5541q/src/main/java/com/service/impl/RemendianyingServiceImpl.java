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


import com.dao.RemendianyingDao;
import com.entity.RemendianyingEntity;
import com.service.RemendianyingService;
import com.entity.vo.RemendianyingVO;
import com.entity.view.RemendianyingView;

@Service("remendianyingService")
public class RemendianyingServiceImpl extends ServiceImpl<RemendianyingDao, RemendianyingEntity> implements RemendianyingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemendianyingEntity> page = this.selectPage(
                new Query<RemendianyingEntity>(params).getPage(),
                new EntityWrapper<RemendianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemendianyingEntity> wrapper) {
		  Page<RemendianyingView> page =new Query<RemendianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemendianyingVO> selectListVO(Wrapper<RemendianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemendianyingVO selectVO(Wrapper<RemendianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemendianyingView> selectListView(Wrapper<RemendianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemendianyingView selectView(Wrapper<RemendianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
