package com.starbucks.per;

import java.util.List;

import com.starbucks.domain.CategoryVO;
import com.starbucks.domain.Inventory;

public interface InventoryMapper {
	int getTotalCount();
	List<Inventory> getInventoryList();
	List<CategoryVO> categoryLoading(String cate);
	Inventory getInventory(int pno);
	void insInventory(Inventory inventory);
	void upInventory(Inventory inventory);
	void delInventory(int ino);
}