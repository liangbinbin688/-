package cn.itcast.springmvc.service;

import java.util.List;

import cn.itcast.springmvc.pojo.Item;

public interface ItemService {
	
	/**
	 * 查询商品列表
	 * 
	 * @return
	 */
	List<Item> queryItemList();

}
