/**
 * @Date 22-October-2017
 * @author Shivam
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class OrderDetail.
 */
@Entity
@Table(name = "orderDetail")
public class OrderDetail {

	/** The order detail id. */
	@Id
	@Column(name = "orderDetailId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailId;

	/** The pname. */
	@Column(name = "pname")
	private String pname;

	/** The price. */
	@Column(name = "price")
	private double price;

	/** The order id. */
	@Column(name = "orderId")
	private int orderId;

	/** The quantity. */
	@Column(name = "quantity")
	private int quantity;

	/**
	 * Gets the order detail id.
	 *
	 * @return the order detail id
	 */
	public int getOrderDetailId() {
		return orderDetailId;
	}

	/**
	 * Sets the order detail id.
	 *
	 * @param orderDetailId
	 *            the new order detail id
	 */
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	/**
	 * Gets the pname.
	 *
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * Sets the pname.
	 *
	 * @param pname
	 *            the new pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param d
	 *            the new price
	 */
	public void setPrice(double d) {
		this.price = d;
	}

	/**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * Sets the order id.
	 *
	 * @param orderId
	 *            the new order id
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDetail [orderDetailId=" + orderDetailId + ", pname="
				+ pname + ", price=" + price + ", orderId=" + orderId
				+ ", quantity=" + quantity + "]";
	}
}
