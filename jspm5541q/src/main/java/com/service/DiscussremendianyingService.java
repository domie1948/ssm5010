package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremendianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremendianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremendianyingView;


/**
 * 热门电影评论表
 *
 * @author 
 * @email 
 * @date 2021-02-03 14:24:47
 */
public interface DiscussremendianyingService extends IService<DiscussremendianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremendianyingVO> selectListVO(Wrapper<DiscussremendianyingEntity> wrapper);
   	
   	DiscussremendianyingVO selectVO(@Param("ew") Wrapper<DiscussremendianyingEntity> wrapper);
   	
   	List<DiscussremendianyingView> selectListView(Wrapper<DiscussremendianyingEntity> wrapper);
   	
   	DiscussremendianyingView selectView(@Param("ew") Wrapper<DiscussremendianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremendianyingEntity> wrapper);
   	
}

