package com.starbucks.biz;

import java.util.List;

import com.starbucks.domain.Basket;

public interface BasketBiz {
	public List<Basket> getBasketList();
	public Basket getBasket(int bno);
	public void insBasket(Basket basket);
	public void upBasket(Basket basket);
	public void delBasket(int bno);
}

