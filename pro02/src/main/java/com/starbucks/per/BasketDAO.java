package com.starbucks.per;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.starbucks.domain.Basket;

@Repository
public class BasketDAO implements BasketMapper {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("basket.getTotalCount");
	}

	@Override
	public List<Basket> getBasketList() {
		return sqlSession.selectList("basket.getBasketList");
	}

	@Override
	public Basket getBasket(int bno) {
		return sqlSession.selectOne("basket.getBasket", bno);
	}

	@Override
	public void insBasket(Basket basket) {
		sqlSession.insert("basket.insBasket", basket);
	}

	@Override
	public void upBasket(Basket basket) {
		sqlSession.update("basket.upBasket", basket);
	}

	@Override
	public void vcntCount(int bno) {
		sqlSession.update("basket.vcntCount", bno);
	}

	@Override
	public void delBasket(int bno) {
		sqlSession.delete("basket.delBasket", bno);
	}
}