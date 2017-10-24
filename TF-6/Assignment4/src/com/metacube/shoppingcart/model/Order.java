/**
 * @Date 22-October-2017
 * @author Shivam
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Order.
 */
@Entity
@Table(name = "Orders")
public class Order {

	/** The order id. */
	@Id
	@Column(name = "orderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	/** The card number. */
	@Column(name = "cardNumber")
	private String cardNumber;

	/** The cvv. */
	@Column(name = "cvv")
	private int cvv;

	/** The amount. */
	@Column(name = "amount")
	private double amount;

	/** The user id. */
	@Column(name = "userId")
	private String userId;

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/** The dop. */
	@Column(name = "dop")
	private Date dop;

	/**
	 * Gets the dop.
	 *
	 * @return the dop
	 */
	public Date getDop() {
		return dop;
	}

	/**
	 * Sets the dop.
	 *
	 * @param dop
	 *            the new dop
	 */
	public void setDop(Date dop) {
		this.dop = dop;
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
	 * Gets the card number.
	 *
	 * @return the card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * Sets the card number.
	 *
	 * @param cardNumber
	 *            the new card number
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Gets the cvv.
	 *
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * Sets the cvv.
	 *
	 * @param cvv
	 *            the new cvv
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cardNumber=" + cardNumber
				+ ", cvv=" + cvv + ", amount=" + amount + ", userId=" + userId
				+ ", dop=" + dop + "]";
	}

}
