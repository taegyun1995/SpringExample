package com.taegyun.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.taegyun.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	
	// used goods 에서 모든 데이터 조회
	public List<UsedGoods> selectUsedGoodsList();
	
}
