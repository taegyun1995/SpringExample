package com.taegyun.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taegyun.ex.database.dao.UsedGoodsDAO;
import com.taegyun.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;

	// used goods 데이터를 모두 가져오는 메서드
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
		// 데이터 조작
		
		return list;
	}
}
