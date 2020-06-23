package menu.model.service;

import java.util.ArrayList;

import member.model.vo.PageInfo;
import menu.model.vo.Menu;
import menu.model.vo.MenuPageInfo;

public interface MenuService {

	int getListCount();


	ArrayList<Menu> selectMenuList(MenuPageInfo pi);


	int insertMenu(Menu menu);

}
