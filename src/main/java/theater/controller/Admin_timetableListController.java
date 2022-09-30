package theater.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import theater.model.TheaterDao;
import time.model.TimeTableBean;
import utility.Paging;

@Controller
public class Admin_timetableListController {
   final String command = "timeList.th";
   String getPage = "/a_theater_TimeTableList";
   
   @Autowired
   TheaterDao tdao;
   
   @RequestMapping(command)
   public String list(@RequestParam(required = false) String theater,@RequestParam(required = false) String whatColumn,
         @RequestParam(required = false) String keyword,@RequestParam(required = false) String pageNumber,Model model,HttpServletRequest request) {
      System.out.println("영화관="+theater);
      System.out.println("칼럼="+whatColumn);
      System.out.println("키워드="+keyword);
      System.out.println("페이지="+pageNumber);
      
      
      Map<String, String>map = new HashMap<String, String>();
      
      map.put("whatColumn", whatColumn);
      map.put("keyword", "%"+keyword+"%");
      
      int totalCount = tdao.getTotalCountTimeTable(map);
      String path = request.getContextPath();
      String url = path+"/"+command;
      
      Paging pageInfo = new Paging(pageNumber, null, totalCount, url, whatColumn, keyword, null);
      
      List<TimeTableBean>lists =  tdao.getTimeTable(map,pageInfo);
      List<TimeTableBean>indelists =  tdao.GetTimeTableOfIndeMovie(map,pageInfo);
      
      
      model.addAttribute("pageNumber",pageNumber);
      model.addAttribute("pageInfo",pageInfo);
      model.addAttribute("indelists",indelists);
      model.addAttribute("lists",lists);
      return getPage;
   }
}