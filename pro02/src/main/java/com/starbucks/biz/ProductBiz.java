package com.starbucks.biz;

import java.util.List;

import com.starbucks.domain.Product;
import com.starbucks.domain.ProductVO;

public interface ProductBiz {
	int getTotalCount();
	List<ProductVO> getProductList();
	List<ProductVO> getProductCateList(String cate);
	ProductVO getProduct(int pno);
	void insProduct(Product product);
	void upProduct(Product product);
	void delProduct(int pno);
}