package com.example.viewresolver;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"","/"})
	public String index(Model model) {	// Model은 view를 렌더링하는데 필요한 정보(데이터)를
		String name = "cos";			// attribute로 담아 전달한다. Model 객체에 데이터를 담는 것!
		int num = 10;					// 참조 : https://www.baeldung.com/spring-mvc-model-model-map-model-view
		String password = "1234";
		
		// Model은 session, request 구분 안함
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("password", password);
		
		// 이 메서드에 @ResponseBody가 붙어있지 않으므로 view resolver가 작동하고
		// /viewresolver/src/main/resources/templates/index.mustache 로 찾아감
		// view resolver는 prefix와 suffix를 붙여주는 역할을 함
		// 		prefix - "/src/main/resources/templates/"
		// 		suffix - ".mustache"
		return "index";
	}
	
	
	@GetMapping("/model/data")
	public String modelData(Model model) {
		Member member = Member.builder()
				.id(1)
				.username("ssar")
				.phone("01022225555")
				.build();
		
		model.addAttribute("member", member);
		
		return "modelData";
	}
	
	
	@GetMapping("/model/array")
	public String modelArray(Model model) {
		Member member1 = Member.builder()
				.id(1)
				.username("ssar")
				.phone("01022225555")
				.build();
		
		Member member2 = Member.builder()
				.id(2)
				.username("ssarmango")
				.phone("01099775555")
				.build();
		
		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);
			
		model.addAttribute("members", members);
		model.addAttribute("user",true);
		
		return "modelArray";
	}
	
	
	@GetMapping("/layout")
	public String layout() {
		
		
		// layout.mustache 파일 참조
		return "layout";
	}

/* 
	layout.mustache 파일 내부를 보면 {{>layout/header}} 와 같은 구문이 나옴
  	include 파일을 {{>파일명}}으로 표현하는 문법에 대해서는
	https://mustache.github.io/mustache.5.html
	이 페이지의 하단 부분 참조
*/
}
