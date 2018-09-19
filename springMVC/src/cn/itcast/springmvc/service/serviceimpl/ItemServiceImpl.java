package cn.itcast.springmvc.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springmvc.mapper.ItemMapper;
import cn.itcast.springmvc.pojo.Item;
import cn.itcast.springmvc.service.ItemService;

@Service

public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> queryItemList() {
		// TODO Auto-generated method stub
		List<Item> list = this.itemMapper.selectByExample(null);
		
		return list;
		
	}
	
	

}
