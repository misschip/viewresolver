package com.example.viewresolver;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"","/"})
	public String index(Model model) {	// Model은 JSP의 RequestDispatcher에 해당하는 클래스임
		String name = "cos";
		int num = 10;
		String password = "1234";
		
		// Model은 session, request 구분 안함
		model.addAttribute("name", name);
		model.addAttribute("num", num);
		model.addAttribute("password", password);
		
		// /viewresolver/src/main/resources/templates/index.mustache 로 찾아감
		// view resolver는 prefix와 suffix를 붙여주는 역할을 함
		// 		prefix - "/viewresolver/src/main/resources/templates/"
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
	
}
