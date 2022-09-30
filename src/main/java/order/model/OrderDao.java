package order.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
	private String namespace="order.model.Order";
	List<OrderBean> paylists;

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public void insertS_orders(OrderBean ob) {
		sqlSessionTemplate.insert(namespace+".InsertS_orders",ob);
	}//

	public List<OrderBean> getAllS_orders() {
		List<OrderBean> paylists=sqlSessionTemplate.selectList(namespace+".GetAllS_orders");
		return paylists;
	}//

	public List<OrderBean> getOrderBySearch(Map<String, String> map) {
		System.out.println("getOrderBySearch");
		System.out.println(map.get(0));
		List<OrderBean> paylists=sqlSessionTemplate.selectList(namespace+"GetOrderBySearch",map);
		return paylists;
	}//

	public List<OrderBean> selectBySearch(Map<String, String> map) {
		List<OrderBean> lists=sqlSessionTemplate.selectList(namespace+".SelectBySearch",map);
		return lists;
	}//
}
