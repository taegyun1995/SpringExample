package com.taegyun.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taegyun.ex.lifecycle.model.Person;

//@Controller
@RequestMapping("/lifecycle/ex01")
@RestController // Controller + ResponseBody
public class Ex01RestController {
	
	@RequestMapping("/3")
	public String printString() {
		
		return "RestController 테스트";
	}
	
	@RequestMapping("/4")
	public Person printObject() {
		Person person = new Person();
		person.setName("이태균");
		person.setAge(28);
		
		return person;
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Person> entity() {
		Person person = new Person();
		person.setName("이태균");
		person.setAge(28);
		
		// 데이터를 전달할 때 response의 status 코드를 추가로 전달
		// 정상 status 코드 : 200 OK
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
	
}
