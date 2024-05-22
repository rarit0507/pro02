package com.starbucks.per;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.starbucks.domain.Basket;
@Mapper
public interface BasketMapper {	//=DAO
	public List<Basket> getBasketList();
	public Basket getBasket(int bno);
	public int maxNum();
	public void insBasket(Basket basket);
	public void upBasket(Basket basket);
	public void delBasket(Basket basket);
}
