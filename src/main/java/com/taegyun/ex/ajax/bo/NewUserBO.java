package com.taegyun.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taegyun.ex.ajax.dao.NewUserDAO;
import com.taegyun.ex.ajax.model.NewUser;

@Service
public class NewUserBO {
	
	@Autowired
	private NewUserDAO newuserDAO;
	
	//new_user 테이블 모든 내용 얻어오기
	public List<NewUser> getUserList() {
		return newuserDAO.selectUserList();
		
	}
	
	public int addUser(String name, String birthday, String introduce, String email) {
		
		return newuserDAO.insertUser(name, birthday, introduce, email);
	}
}
