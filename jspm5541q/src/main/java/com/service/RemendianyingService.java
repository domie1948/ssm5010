package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemendianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemendianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemendianyingView;


/**
 * 热门电影
 *
 * @author 
 * @email 
 * @date 2021-02-03 14:24:47
 */
public interface RemendianyingService extends IService<RemendianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemendianyingVO> selectListVO(Wrapper<RemendianyingEntity> wrapper);
   	
   	RemendianyingVO selectVO(@Param("ew") Wrapper<RemendianyingEntity> wrapper);
   	
   	List<RemendianyingView> selectListView(Wrapper<RemendianyingEntity> wrapper);
   	
   	RemendianyingView selectView(@Param("ew") Wrapper<RemendianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemendianyingEntity> wrapper);
   	
}

