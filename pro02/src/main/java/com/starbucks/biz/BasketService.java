package com.starbucks.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starbucks.domain.Basket;
import com.starbucks.per.BasketMapper;

@Service
public class BasketService implements BasketBiz {

	@Autowired
	private BasketMapper basketDAO;

	@Override
	public List<Basket> getBasketList() {
		return basketDAO.getBasketList();
	}

	@Override
	public Basket getBasket(int bno) {
		return basketDAO.getBasket(bno);
	}

	@Override
	public void insBasket(Basket basket) {
		basketDAO.insBasket(basket);
	}

	@Override
	public int maxNum() {
		return basketDAO.maxNum();
	}

	@Override
	public void upBasket(Basket basket) {
		basketDAO.upBasket(basket);
	}

	@Override
	public void delBasket(Basket basket) {
		basketDAO.delBasket(basket);
	}
	
	
}