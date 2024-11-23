package com.my.ds_market.entity;

public class Item {
	private int item_idx = 0;
	private int user_idx = 0;
	private int price = 0;
	private String name = null;
	private String maker = null;
	private String created_date = null;

	public int getItem_idx() {
		return item_idx;
	}

	public void setItem_idx(int item_idx) {
		this.item_idx = item_idx;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

}
