package cn.itcast.springmvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cn.itcast.springmvc.pojo.Item;
import cn.itcast.springmvc.service.ItemService;
import cn.itcast.springmvc.service.serviceimpl.ItemServiceImpl;

/**
 * @author lbb
 *
 *控制器
 */
@Controller
public class ItemController {
	
	@Autowired
	
	private ItemService itemService;

	
	private static Logger logger =Logger.getLogger(ItemController.class);
	
	    // @RequestMapping：里面放的是请求的url，和用户请求的url进行匹配
		// action可以写也可以不写
	
		@RequestMapping("/itemList.action")
		public ModelAndView queryItemList() {
			
			List<Item> list = itemService.queryItemList();

			// 创建ModelAndView，用来存放数据和视图
			ModelAndView modelAndView = new ModelAndView();
			// 设置数据到模型中
			modelAndView.addObject("list", list);
			// 设置视图jsp，需要设置视图的物理地址
//			//modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
			
			modelAndView.setViewName("itemList");
			logger.info("访问到了！！！");
			
			return modelAndView;
		}


}
