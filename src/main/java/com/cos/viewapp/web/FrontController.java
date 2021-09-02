package com.cos.viewapp.web;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Restcontroller(데이터를 리턴한다)
//Controller(파일을 리턴한다)


//controller에서 전역변수를 쓰지않는다
//서버실행시 열림
@Controller
public class FrontController {
	
	
	@GetMapping("/home")
	public String home(Model model) { //request == model
		
		//request는 인젝션
		String name = "강민수";
		model.addAttribute("name",name);
		
		List<Board> boards = new ArrayList<>();
		boards.add(new Board(1,"제목1"));
		boards.add(new Board(2,"제목2"));
		
		model.addAttribute("boards", boards);
		
		return "home";
	}
	
	
}
