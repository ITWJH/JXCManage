import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.net.URL;
import java.sql.Connection;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;

public class MainPage extends JFrame{
	private static final long serialVersionUID = 1L;
	JFrame jf = new JFrame();
	Container container = new Container();
	Connection con ;
	public void setConnection() {
		con = new JXCMainPage().getConnection();//对con进行初始化
	}
	public  Container getContainer2() {
		container = this.getContentPane();
		return container;
	}
	
	public MainPage() {//构造方法
		setJframe();//设置当前对象的属性,并且设置背景图片
		getContainer2();//对container实例化
		JTabbedPane navigationPanel = createNavigationPanel();
		container.add(navigationPanel,BorderLayout.NORTH);//调用函数,JFrame中添加导航栏
	}
	public void setJframe() {//设置当前对象的属性
		this.setTitle("进销存管理系统");
		this.setBackground();
		this.setVisible(true);
		this.setBounds(300, 60, 1284, 939);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBackground();
	}
	public void setBackground() {//设置背景图片
		// 创建一个桌面面板对象
		final JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);//将桌面面板添加到容器当中设置布局为边界布局
		final JLabel backLabel = new JLabel(); // 创建一个标签组件对象
		// 获得背景图片的路径
		URL resource = this.getClass().getResource("jxc.jpg");
		ImageIcon icon = new ImageIcon(resource); // 创建背景图片对象
		backLabel.setIcon(icon); // 令标签组件显示背景图片
		// 设置组件的显示位置及大小
		backLabel.setBounds(0, 0, icon.getIconWidth(), icon
				.getIconHeight());
		// 将标签组件添加到指定索引位置
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE));
	}
	
	private JTabbedPane createNavigationPanel() {// 创建导航标签面板
		JTabbedPane tabbedPane = new JTabbedPane(); //实例化一个选项卡面板
		tabbedPane.setFocusable(false);
		tabbedPane.setBackground(new Color(211, 230, 192));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		Font font = new Font("微软雅黑",Font.PLAIN,18);//用来设置tab栏的字体大小
		
		JPanel select_function = new JPanel();//实例化一个面板,用来显示查询功能
		select_function.setBackground(new Color(211,223,194));
		select_function.setLayout(new BoxLayout(select_function,BoxLayout.X_AXIS));
		select_function.add(new CreateMenu().createKHSelectMenu());//客户信息查询菜单
		select_function.add(new CreateMenu().createSPSelectMenu());//商品信息查询菜单
		select_function.add(new CreateMenu().createGYSSelectMenu());//供应商信息查询菜单
		select_function.add(new CreateMenu().createXSDSelectMenu());//订单信息查询菜单
		/***********以上是菜单栏的设置*****************/
		JPanel user_baseinfo_manage = new JPanel();//实例化一个面板,客户信息管理
		user_baseinfo_manage.setBackground(new Color(211,223,194));
		user_baseinfo_manage.setLayout(new BoxLayout(user_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendUserMessage = createFrameButton("修改客户信息");
		JButton deleteUser = createFrameButton("删除客户");
		JButton addUser = createFrameButton("添加客户");
		new CreateListener().amendUserMessage(amendUserMessage);
		new CreateListener().deleteUser(deleteUser);
		new CreateListener().addUser(addUser);
		user_baseinfo_manage.add(amendUserMessage);
		user_baseinfo_manage.add(deleteUser);
		user_baseinfo_manage.add(addUser);
		
		JPanel goods_baseinfo_manage = new JPanel();//商品信息管理
		goods_baseinfo_manage.setBackground(new Color(211,223,194));
		goods_baseinfo_manage.setLayout(new BoxLayout(goods_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendGoodsMessage = createFrameButton("修改商品信息");
		JButton deleteGoods = createFrameButton("删除商品");
		JButton addGoods = createFrameButton("添加商品");
		new CreateListener().amendGoodsMessage(amendGoodsMessage);
		new CreateListener().deleteGoods(deleteGoods);
		new CreateListener().addGoods(addGoods);
		goods_baseinfo_manage.add( amendGoodsMessage);
		goods_baseinfo_manage.add(deleteGoods);
		goods_baseinfo_manage.add(addGoods);

		
		JPanel supplier_baseinfo_manage = new JPanel();//供应商信息管理
		supplier_baseinfo_manage.setBackground(new Color(211,223,194));
		supplier_baseinfo_manage.setLayout(new BoxLayout(supplier_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendSupplierMessage = createFrameButton("修改供应商信息");
		JButton deleteSupplier = createFrameButton("删除供应商");
		JButton addSupplier = createFrameButton("添加供应商");
		new CreateListener().amendSupplierMessage(amendSupplierMessage);
		new CreateListener().deleteSupplier(deleteSupplier);
		new CreateListener().addSupplier(addSupplier);
		supplier_baseinfo_manage.add(amendSupplierMessage);
		supplier_baseinfo_manage.add(deleteSupplier);
		supplier_baseinfo_manage.add(addSupplier);

		
		JPanel sys_function = new JPanel();//实例化一个面板,用于管理员的信息修改
		sys_function.setBackground(new Color(211,223,194));
		sys_function.setLayout(new BoxLayout(sys_function,BoxLayout.X_AXIS));
		JButton amendAdminName = createFrameButton("修改管理员用户名");
		JButton amendAdminPassword = createFrameButton("修改管理员密码");
		JButton addAdmin = createFrameButton("添加管理员");
		JButton deleteAdmin =  createFrameButton("删除管理员");
		new CreateListener().amendAdminName(amendAdminName);
		new CreateListener().amendAdminPassword(amendAdminPassword);
		new CreateListener().addAdmin(addAdmin);
		new CreateListener().deleteAdmin(deleteAdmin);
		
		sys_function.add(amendAdminName);
		sys_function.add(amendAdminPassword);
		sys_function.add(addAdmin);
		sys_function.add( deleteAdmin);

	
		
		tabbedPane.addTab("查询功能", select_function);//添加查询管理动能模块
		tabbedPane.addTab("客户信息管理",user_baseinfo_manage);//添加客户信息管理模块
		tabbedPane.addTab("商品信息管理",goods_baseinfo_manage);//添加商品信息管理模块
		tabbedPane.addTab("供应商信息管理",supplier_baseinfo_manage);//添加供应商信息管理模块
		tabbedPane.addTab("管理员系统管理",sys_function);//添加管理员信息管理功能模块
		tabbedPane.setFont(font);
		
		return tabbedPane;
	}
	private JButton createFrameButton(String fname) {//创建JButton
		// TODO Auto-generated method stub
		Font button_font = new Font("微软雅黑",Font.PLAIN,18);//设置
		JButton button = new JButton(fname);
		button.setMargin(new Insets(0, 0, 0, 10));
		button.setHideActionText(true);
		button.setFocusPainted(true);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFont(button_font);
		return button;
	}
	
}
