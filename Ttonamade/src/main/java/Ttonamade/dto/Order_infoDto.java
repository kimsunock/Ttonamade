package Ttonamade.dto;

import java.util.Date;

public class Order_infoDto {

	private int order_id;
	private int cust_id;
	private int order_totalAmount;
	private Date order_date;
	private String cus_zipcode;
	private String order_add1;
	private String order_add2;
	private String order_telephone;
	private char order_status;
	
	public Order_infoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order_infoDto(int order_id, int cust_id, int order_totalAmount, Date order_date, String cus_zipcode,
			String order_add1, String order_add2, String order_telephone, char order_status) {
		super();
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.order_totalAmount = order_totalAmount;
		this.order_date = order_date;
		this.cus_zipcode = cus_zipcode;
		this.order_add1 = order_add1;
		this.order_add2 = order_add2;
		this.order_telephone = order_telephone;
		this.order_status = order_status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getOrder_totalAmount() {
		return order_totalAmount;
	}

	public void setOrder_totalAmount(int order_totalAmount) {
		this.order_totalAmount = order_totalAmount;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getCus_zipcode() {
		return cus_zipcode;
	}

	public void setCus_zipcode(String cus_zipcode) {
		this.cus_zipcode = cus_zipcode;
	}

	public String getOrder_add1() {
		return order_add1;
	}

	public void setOrder_add1(String order_add1) {
		this.order_add1 = order_add1;
	}

	public String getOrder_add2() {
		return order_add2;
	}

	public void setOrder_add2(String order_add2) {
		this.order_add2 = order_add2;
	}

	public String getOrder_telephone() {
		return order_telephone;
	}

	public void setOrder_telephone(String order_telephone) {
		this.order_telephone = order_telephone;
	}

	public char getOrder_status() {
		return order_status;
	}

	public void setOrder_status(char order_status) {
		this.order_status = order_status;
	}
	
	
}
