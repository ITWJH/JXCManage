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
		con = new JXCMainPage().getConnection();//��con���г�ʼ��
	}
	public  Container getContainer2() {
		container = this.getContentPane();
		return container;
	}
	
	public MainPage() {//���췽��
		setJframe();//���õ�ǰ���������,�������ñ���ͼƬ
		getContainer2();//��containerʵ����
		JTabbedPane navigationPanel = createNavigationPanel();
		container.add(navigationPanel,BorderLayout.NORTH);//���ú���,JFrame����ӵ�����
	}
	public void setJframe() {//���õ�ǰ���������
		this.setTitle("���������ϵͳ");
		this.setBackground();
		this.setVisible(true);
		this.setBounds(300, 60, 1284, 939);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBackground();
	}
	public void setBackground() {//���ñ���ͼƬ
		// ����һ������������
		final JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);//�����������ӵ������������ò���Ϊ�߽粼��
		final JLabel backLabel = new JLabel(); // ����һ����ǩ�������
		// ��ñ���ͼƬ��·��
		URL resource = this.getClass().getResource("jxc.jpg");
		ImageIcon icon = new ImageIcon(resource); // ��������ͼƬ����
		backLabel.setIcon(icon); // ���ǩ�����ʾ����ͼƬ
		// �����������ʾλ�ü���С
		backLabel.setBounds(0, 0, icon.getIconWidth(), icon
				.getIconHeight());
		// ����ǩ�����ӵ�ָ������λ��
		desktopPane.add(backLabel, new Integer(Integer.MIN_VALUE));
	}
	
	private JTabbedPane createNavigationPanel() {// ����������ǩ���
		JTabbedPane tabbedPane = new JTabbedPane(); //ʵ����һ��ѡ����
		tabbedPane.setFocusable(false);
		tabbedPane.setBackground(new Color(211, 230, 192));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		Font font = new Font("΢���ź�",Font.PLAIN,18);//��������tab���������С
		
		JPanel select_function = new JPanel();//ʵ����һ�����,������ʾ��ѯ����
		select_function.setBackground(new Color(211,223,194));
		select_function.setLayout(new BoxLayout(select_function,BoxLayout.X_AXIS));
		select_function.add(new CreateMenu().createKHSelectMenu());//�ͻ���Ϣ��ѯ�˵�
		select_function.add(new CreateMenu().createSPSelectMenu());//��Ʒ��Ϣ��ѯ�˵�
		select_function.add(new CreateMenu().createGYSSelectMenu());//��Ӧ����Ϣ��ѯ�˵�
		select_function.add(new CreateMenu().createXSDSelectMenu());//������Ϣ��ѯ�˵�
		/***********�����ǲ˵���������*****************/
		JPanel user_baseinfo_manage = new JPanel();//ʵ����һ�����,�ͻ���Ϣ����
		user_baseinfo_manage.setBackground(new Color(211,223,194));
		user_baseinfo_manage.setLayout(new BoxLayout(user_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendUserMessage = createFrameButton("�޸Ŀͻ���Ϣ");
		JButton deleteUser = createFrameButton("ɾ���ͻ�");
		JButton addUser = createFrameButton("��ӿͻ�");
		new CreateListener().amendUserMessage(amendUserMessage);
		new CreateListener().deleteUser(deleteUser);
		new CreateListener().addUser(addUser);
		user_baseinfo_manage.add(amendUserMessage);
		user_baseinfo_manage.add(deleteUser);
		user_baseinfo_manage.add(addUser);
		
		JPanel goods_baseinfo_manage = new JPanel();//��Ʒ��Ϣ����
		goods_baseinfo_manage.setBackground(new Color(211,223,194));
		goods_baseinfo_manage.setLayout(new BoxLayout(goods_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendGoodsMessage = createFrameButton("�޸���Ʒ��Ϣ");
		JButton deleteGoods = createFrameButton("ɾ����Ʒ");
		JButton addGoods = createFrameButton("�����Ʒ");
		new CreateListener().amendGoodsMessage(amendGoodsMessage);
		new CreateListener().deleteGoods(deleteGoods);
		new CreateListener().addGoods(addGoods);
		goods_baseinfo_manage.add( amendGoodsMessage);
		goods_baseinfo_manage.add(deleteGoods);
		goods_baseinfo_manage.add(addGoods);

		
		JPanel supplier_baseinfo_manage = new JPanel();//��Ӧ����Ϣ����
		supplier_baseinfo_manage.setBackground(new Color(211,223,194));
		supplier_baseinfo_manage.setLayout(new BoxLayout(supplier_baseinfo_manage,BoxLayout.X_AXIS));
		JButton amendSupplierMessage = createFrameButton("�޸Ĺ�Ӧ����Ϣ");
		JButton deleteSupplier = createFrameButton("ɾ����Ӧ��");
		JButton addSupplier = createFrameButton("��ӹ�Ӧ��");
		new CreateListener().amendSupplierMessage(amendSupplierMessage);
		new CreateListener().deleteSupplier(deleteSupplier);
		new CreateListener().addSupplier(addSupplier);
		supplier_baseinfo_manage.add(amendSupplierMessage);
		supplier_baseinfo_manage.add(deleteSupplier);
		supplier_baseinfo_manage.add(addSupplier);

		
		JPanel sys_function = new JPanel();//ʵ����һ�����,���ڹ���Ա����Ϣ�޸�
		sys_function.setBackground(new Color(211,223,194));
		sys_function.setLayout(new BoxLayout(sys_function,BoxLayout.X_AXIS));
		JButton amendAdminName = createFrameButton("�޸Ĺ���Ա�û���");
		JButton amendAdminPassword = createFrameButton("�޸Ĺ���Ա����");
		JButton addAdmin = createFrameButton("��ӹ���Ա");
		JButton deleteAdmin =  createFrameButton("ɾ������Ա");
		new CreateListener().amendAdminName(amendAdminName);
		new CreateListener().amendAdminPassword(amendAdminPassword);
		new CreateListener().addAdmin(addAdmin);
		new CreateListener().deleteAdmin(deleteAdmin);
		
		sys_function.add(amendAdminName);
		sys_function.add(amendAdminPassword);
		sys_function.add(addAdmin);
		sys_function.add( deleteAdmin);

	
		
		tabbedPane.addTab("��ѯ����", select_function);//��Ӳ�ѯ������ģ��
		tabbedPane.addTab("�ͻ���Ϣ����",user_baseinfo_manage);//��ӿͻ���Ϣ����ģ��
		tabbedPane.addTab("��Ʒ��Ϣ����",goods_baseinfo_manage);//�����Ʒ��Ϣ����ģ��
		tabbedPane.addTab("��Ӧ����Ϣ����",supplier_baseinfo_manage);//��ӹ�Ӧ����Ϣ����ģ��
		tabbedPane.addTab("����Աϵͳ����",sys_function);//��ӹ���Ա��Ϣ������ģ��
		tabbedPane.setFont(font);
		
		return tabbedPane;
	}
	private JButton createFrameButton(String fname) {//����JButton
		// TODO Auto-generated method stub
		Font button_font = new Font("΢���ź�",Font.PLAIN,18);//����
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
