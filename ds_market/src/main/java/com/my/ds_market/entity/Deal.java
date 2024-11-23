package com.my.ds_market.entity;

public class Deal {
	private int deal_idx = 0;
	private int buy_user_idx = 0;
	private int item_idx = 0;
	private String created_date = null;

	public int getDeal_idx() {
		return deal_idx;
	}

	public void setDeal_idx(int deal_idx) {
		this.deal_idx = deal_idx;
	}

	public int getBuy_user_idx() {
		return buy_user_idx;
	}

	public void setBuy_user_idx(int buy_user_idx) {
		this.buy_user_idx = buy_user_idx;
	}

	public int getItem_idx() {
		return item_idx;
	}

	public void setItem_idx(int item_idx) {
		this.item_idx = item_idx;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

}
