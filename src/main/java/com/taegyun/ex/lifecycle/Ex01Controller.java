package com.taegyun.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/ex01")
public class Ex01Controller {
	
	@ResponseBody
	@RequestMapping("/1")
	public String printString() {
		return "예제 1번 문자열을 response에 담는다.";
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Integer> printMap() {
		// 과일이름과 가격
		Map<String, Integer> map = new HashMap<>();
		map.put("apple",1500);
		map.put("banana", 3000);
		map.put("orange", 1000);
		
		return map;
	}
}
