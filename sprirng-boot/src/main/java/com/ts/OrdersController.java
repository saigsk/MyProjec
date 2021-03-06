package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.OrdersDao;
import com.model.Orders;

@RestController
public class OrdersController {
	
	@Autowired
	OrdersDao ordersDao;
	
	/*
	 * @RequestMapping("/registerOrder") public void registerOrder(Orders orders) {
	 * Orders o1 = new Orders(); }
	 */
	}
