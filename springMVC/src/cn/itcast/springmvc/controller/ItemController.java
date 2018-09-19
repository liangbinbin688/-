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
 *������
 */
@Controller
public class ItemController {
	
	@Autowired
	
	private ItemService itemService;

	
	private static Logger logger =Logger.getLogger(ItemController.class);
	
	    // @RequestMapping������ŵ��������url�����û������url����ƥ��
		// action����дҲ���Բ�д
	
		@RequestMapping("/itemList.action")
		public ModelAndView queryItemList() {
			
			List<Item> list = itemService.queryItemList();

			// ����ModelAndView������������ݺ���ͼ
			ModelAndView modelAndView = new ModelAndView();
			// �������ݵ�ģ����
			modelAndView.addObject("list", list);
			// ������ͼjsp����Ҫ������ͼ�������ַ
//			//modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
			
			modelAndView.setViewName("itemList");
			logger.info("���ʵ��ˣ�����");
			
			return modelAndView;
		}


}
