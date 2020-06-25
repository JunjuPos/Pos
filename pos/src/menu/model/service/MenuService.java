package menu.model.service;

import java.util.ArrayList;

import member.model.vo.PageInfo;
import menu.model.vo.Menu;
import menu.model.vo.Menu2;
import menu.model.vo.MenuPageInfo;

public interface MenuService {

	int getListCount();

	int insertMenu(Menu menu);

	ArrayList<Menu> selectMenuList(int option);

	Menu selectMenuDetail(String mENU);

	int updateMenu(Menu m);

	int updateMenu(Menu2 m);

}
