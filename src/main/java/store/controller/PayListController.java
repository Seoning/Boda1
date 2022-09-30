package store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import order.model.OrderBean;
import order.model.OrderDao;

@Controller
@ComponentScan("order.*")
public class PayListController {
	private final String command="store_paylist.st"; //결제 내역 클릭
	private final String getPage="/store_paylist_admin";
	
	@Autowired
	OrderDao orderDao;
	
	@RequestMapping(command)
	public String paylist(HttpSession session) {
			List<OrderBean> paylists=orderDao.getAllS_orders();
			session.setAttribute("paylists", paylists);
			return getPage;
	}//
}
