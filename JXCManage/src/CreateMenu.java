
import java.awt.Color;
import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;
public class CreateMenu extends JFrame{
	private static final long serialVersionUID = 1L;
	Font font = new Font("微软雅黑",Font.PLAIN,18);
	Font font2 = new Font("微软雅黑",Font.PLAIN,15);
	public CreateMenu() {//构造器
	}
	
	public JMenuBar createKHSelectMenu() {//客户查询
		JMenuBar  kh_select = new JMenuBar();
		setJMenuBar(kh_select);// 将菜单栏对象添加到窗体的菜单栏中
		
		JMenu menu = new JMenu("用户信息查询");
		kh_select.add(menu);
		JMenuItem id_menuitem = new  JMenuItem("ID查询");
		JMenuItem name_menuitem = new JMenuItem("用户名查询");
		JMenuItem tel_menuitem = new JMenuItem("手机号查询");
		JMenuItem account_menuitem = new JMenuItem("账户查询");
		JMenuItem email_menuitem = new JMenuItem("邮箱查询");
		//分别为每个jm添加事件监听器
		new CreateListener().userIDSelect(id_menuitem);
		new CreateListener().userNameSelect(name_menuitem);
		new CreateListener().userTelSelect(tel_menuitem);
		new CreateListener().userAccountSelect(account_menuitem);
		new CreateListener().userEmailSelect(email_menuitem);
		
		id_menuitem.setFont(font2);//用户查询信息下拉菜单的字体进行设置
		name_menuitem.setFont(font2);
		tel_menuitem.setFont(font2);
		account_menuitem.setFont(font2); 
		email_menuitem.setFont(font2);
		
		menu.add(id_menuitem);
		menu.add(name_menuitem);
		menu.add(tel_menuitem);
		menu.add(account_menuitem);
		menu.add(email_menuitem);
		kh_select.setBackground(new Color(211,223,194));
		menu.setFont(font);
		return kh_select;
	}
	
	public JMenuBar createSPSelectMenu() {//商品查询
		JMenuBar  sp_select = new JMenuBar();
	setJMenuBar(sp_select);// 将菜单栏对象添加到窗体的菜单栏中
		
		JMenu menu = new JMenu("商品信息查询");
		sp_select.add(menu);
		JMenuItem id_menuitem = new  JMenuItem("商品ID查询");
		JMenuItem goodsname_menuitem = new JMenuItem("商品名查询");
		JMenuItem add_menuitem = new JMenuItem("产地查询");
		//为商品的每一个查询添加事件监听器
		new CreateListener().goodsIDSelect(id_menuitem);
		new CreateListener().goodsNameSelect(goodsname_menuitem);
		new CreateListener().goodsAddSelect(add_menuitem);
		
		id_menuitem.setFont(font2);
		goodsname_menuitem.setFont(font2);
		add_menuitem.setFont(font2);
		
		menu.add(id_menuitem);
		menu.add(goodsname_menuitem);
		menu.add(add_menuitem);
		sp_select.setBackground(new Color(211,223,194));
		menu.setFont(font);
		return sp_select;
	}
	
	public JMenuBar createGYSSelectMenu() {//供应商查询
		JMenuBar  gys_select = new JMenuBar();
		setJMenuBar(gys_select);// 将菜单栏对象添加到窗体的菜单栏中
		
		JMenu menu = new JMenu("供应商查询");
		gys_select.add(menu);
		
		JMenuItem id_menuitem = new  JMenuItem("ID查询");
		JMenuItem suppliersname_menuitem = new JMenuItem("名称查询");
		JMenuItem email_menuitem = new JMenuItem("邮箱查询");
		JMenuItem account_menuitem = new JMenuItem("账户查询");
		JMenuItem add_menuitem = new JMenuItem("地址查询");
		JMenuItem tel_menuitem = new JMenuItem("电话查询");
		//为供应商的每一个菜单都添加事件监听器
		new CreateListener().gysIDSelect(id_menuitem);
		new CreateListener().gysNameSelect(suppliersname_menuitem);
		new CreateListener().gysEmailSelect(email_menuitem);
		new CreateListener().gysAccountSelect(account_menuitem);
		new CreateListener().gysAddSelect(add_menuitem);
		new CreateListener().gysTelSelect(tel_menuitem);
		
		id_menuitem.setFont(font2);//对供应商下拉菜单的字体进行设置
		suppliersname_menuitem.setFont(font2);
		email_menuitem.setFont(font2);
		account_menuitem.setFont(font2);
		add_menuitem.setFont(font2);
		tel_menuitem.setFont(font2);
		
		menu.add(id_menuitem);
		menu.add(suppliersname_menuitem);
		menu.add(email_menuitem);
		menu.add(account_menuitem);
		menu.add(add_menuitem);
		menu.add(tel_menuitem);
		
		gys_select.setBackground(new Color(211,223,194));
		menu.setFont(font);
		return gys_select;
	}
	
	public JMenuBar createXSDSelectMenu() {//销售单查询
		JMenuBar  xsd_select = new JMenuBar();
		setJMenuBar(xsd_select);// 将菜单栏对象添加到窗体的菜单栏中
		
		JMenu menu = new JMenu("销售单查询");
		xsd_select.add(menu);
		
		JMenuItem id_menuitem = new  JMenuItem("ID查询");
		JMenuItem khid_menuitem = new JMenuItem("客户号查询");
		JMenuItem spid_menuitem = new JMenuItem("商品编号查询");
		//为销售单个每一个查询添加事件监听器
		new CreateListener().salesSPIDSelect(id_menuitem);
		new CreateListener().salesKHIDSelect(khid_menuitem);
		new CreateListener().salesSPIDSelect(spid_menuitem);
		
		id_menuitem.setFont(font2);
		khid_menuitem.setFont(font2);
		spid_menuitem.setFont(font2);
		
		menu.add(id_menuitem);//对销售单查询的下拉菜单的字体进行设置
		menu.add(khid_menuitem);
		menu.add(spid_menuitem);
		
		xsd_select.setBackground(new Color(211,223,194));
		menu.setFont(font);
		return xsd_select;
	}
}
