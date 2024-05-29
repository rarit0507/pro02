package com.starbucks.domain;

import java.util.List;

import com.starbucks.util.PagingBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeListVO {
	private List<Free> list;
	private PagingBean pagingBean;
}
