package cn.itcast.springmvc.service;

import java.util.List;

import cn.itcast.springmvc.pojo.Item;

public interface ItemService {
	
	/**
	 * ��ѯ��Ʒ�б�
	 * 
	 * @return
	 */
	List<Item> queryItemList();

}
