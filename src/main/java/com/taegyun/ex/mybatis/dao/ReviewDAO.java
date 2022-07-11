package com.taegyun.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.taegyun.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	// new_review 테이블에서 id가 3인 리뷰 가져오기
	public Review selectReview(@Param("id") int id);
	
	// storeId, menu, userName, point, review 파라미터로 전달
	public int insertReview(@Param("storeId") int storeId
			,@Param("menu") String menu
			,@Param("userName") String userName
			,@Param("point") double point
			,@Param("review") String review);
	
	public int insertReviewByObject(Review review);
}
