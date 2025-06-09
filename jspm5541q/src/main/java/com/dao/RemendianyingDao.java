package com.dao;

import com.entity.RemendianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemendianyingVO;
import com.entity.view.RemendianyingView;


/**
 * 热门电影
 * 
 * @author 
 * @email 
 * @date 2021-02-03 14:24:47
 */
public interface RemendianyingDao extends BaseMapper<RemendianyingEntity> {
	
	List<RemendianyingVO> selectListVO(@Param("ew") Wrapper<RemendianyingEntity> wrapper);
	
	RemendianyingVO selectVO(@Param("ew") Wrapper<RemendianyingEntity> wrapper);
	
	List<RemendianyingView> selectListView(@Param("ew") Wrapper<RemendianyingEntity> wrapper);

	List<RemendianyingView> selectListView(Pagination page,@Param("ew") Wrapper<RemendianyingEntity> wrapper);
	
	RemendianyingView selectView(@Param("ew") Wrapper<RemendianyingEntity> wrapper);
	
}
