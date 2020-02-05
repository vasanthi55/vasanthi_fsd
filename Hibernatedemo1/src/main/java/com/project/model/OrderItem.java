package com.project.model;


	
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "order_item")
@NamedQueries(value = { @NamedQuery(name = "retrieveall", query = "FROM OrderItem"),
		@NamedQuery(name = "retrieveCount", query = "SELECT count(*) FROM OrderItem") })
public class OrderItem implements Serializable {
	@Id // (not null & unique)
	private int id;
	@Column(name = "order_id")
	private int orderId;
	private int total;
	@Column(name = "product_id")
	private int productId;
	@Column(name = "product_count")
	private int productCount;
	@Column(name = "buying_price")
	private float buyingPrice;

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public float getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(float buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public OrderItem(int id, int orderId, int total, int productId, int productCount, float buyingPrice) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.total = total;
		this.productId = productId;
		this.productCount = productCount;
		this.buyingPrice = buyingPrice;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderId=" + orderId + ", total=" + total + ", productId=" + productId
				+ ", productCount=" + productCount + ", buyingPrice=" + buyingPrice + "]";
	}

}
