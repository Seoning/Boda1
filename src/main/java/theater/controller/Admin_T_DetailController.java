package theater.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import theater.model.TheaterBean;
import theater.model.TheaterDao;

@Controller
public class Admin_T_DetailController {
	final String command = "a_detail.th";
	String getPage = "/a_theater_Detail";
	
	@Autowired
	TheaterDao tdao;
	
	@RequestMapping(command)
	public String detail(@RequestParam int t_num,@RequestParam(required = false) String pageNumber, Model model) {
		
		TheaterBean tb = tdao.getDetail(t_num);
		model.addAttribute("tb",tb);
		model.addAttribute("pageNumber",pageNumber);
		return getPage;
	}
	
	
}
