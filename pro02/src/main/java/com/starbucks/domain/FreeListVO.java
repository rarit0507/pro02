package com.starbucks.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FreeListVO {
	private List<Free> list;
	private PagingBean paginBean;
}
