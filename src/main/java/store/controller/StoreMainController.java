package store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import store.model.StoreBean;
import store.model.StoreDao;

@Controller
public class StoreMainController {
	private final String command1="storemain.st";
	private final String getPage1="/storemain";
	
	private final String command2="store_ticket.st";
	private final String getPage2="/store_ticket";
	
	private final String command3="store_popcorn.st";
	private final String getPage3="/store_popcorn";
	
	private final String command4="store_beverage.st";
	private final String getPage4="/store_beverage";
	
	private final String command5="store_snak.st";
	private final String getPage5="/store_snak";
	
	@Autowired
	StoreDao storeDao;
	
	@RequestMapping(command1)
	public String storemain() {
		return getPage2;
	}
	
	//�����-��ȭ������ Ŭ��
	@RequestMapping(command2)
	public ModelAndView store_ticket() {
		ModelAndView mav = new ModelAndView();
		List<StoreBean> lists=storeDao.getAllStore_ticket();
		System.out.println("��ȭ������ ����:"+lists.size());
		mav.addObject("s_ticket_lists", lists);
		mav.setViewName(getPage2);
		return mav;
	}
	
	//�����-���� Ŭ��
	@RequestMapping(command3)
	public ModelAndView store_popcorn() {
		ModelAndView mav = new ModelAndView();
		List<StoreBean> lists=storeDao.getAllStore_popcorn();
		mav.addObject("s_popcorn_lists", lists);
		mav.setViewName(getPage3);
		return mav;
	}
	
	//�����-���� Ŭ��
	@RequestMapping(command4)
	public ModelAndView store_beverage() {
		ModelAndView mav = new ModelAndView();
		List<StoreBean> lists=storeDao.getAllStore_beverage();
		mav.addObject("s_beverage_lists", lists);
		mav.setViewName(getPage4);
		return mav;
	}
	
	//�����-���� Ŭ��
	@RequestMapping(command5)
	public ModelAndView store_snak() {
		ModelAndView mav = new ModelAndView();
		List<StoreBean> lists=storeDao.getAllStore_snak();
		mav.addObject("s_snak_lists", lists);
		mav.setViewName(getPage5);
		return mav;
	}
}
