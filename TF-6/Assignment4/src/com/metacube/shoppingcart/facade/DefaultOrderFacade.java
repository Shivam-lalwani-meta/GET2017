/**
 * @Date 22-October-2017
 * @author Shivam
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.shoppingcart.model.Order;
import com.metacube.shoppingcart.model.OrderDetail;
import com.metacube.shoppingcart.service.OrderService;

/**
 * The Class DefaultOrderFacade.
 */
@Component("orderFacade")
public class DefaultOrderFacade implements OrderFacade {

	/** The order service. */
	@Autowired
	OrderService orderService;

	/**
	 * Instantiates a new default order facade.
	 */
	public DefaultOrderFacade() {

	}

	/**
	 * Gets the order service.
	 *
	 * @return the order service
	 */
	public OrderService getOrderService() {
		return orderService;
	}

	/**
	 * Sets the order service.
	 *
	 * @param orderService
	 *            the new order service
	 */
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.metacube.shoppingcart.facade.OrderFacade#saveOrder(java.lang.String,
	 * com.metacube.shoppingcart.model.Order)
	 */
	@Override
	public boolean saveOrder(String id, Order order) {
		System.out.println("order service is" + orderService);
		return orderService.saveCart(id, order);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.metacube.shoppingcart.facade.OrderFacade#getAllOrder(java.lang.String
	 * )
	 */
	@Override
	public Iterable<Order> getAllOrder(String id) {
		return orderService.getAllOrder(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.metacube.shoppingcart.facade.OrderFacade#getOrderDetail(int)
	 */
	@Override
	public Iterable<OrderDetail> getOrderDetail(int id) {
		return orderService.getOrderDetail(id);
	}
}
