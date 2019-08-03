
import java.awt.Color;
import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;
public class CreateMenu extends JFrame{
	private static final long serialVersionUID = 1L;
	Font font = new Font("΢���ź�",Font.PLAIN,18);
	Font font2 = new Font("΢���ź�",Font.PLAIN,15);
	public CreateMenu() {//������
	}
	
	public JMenuBar createKHSelectMenu() {//�ͻ���ѯ
		JMenuBar  kh_select = new JMenuBar();
		setJMenuBar(kh_select);// ���˵���������ӵ�����Ĳ˵�����
		
		JMenu menu = new JMenu("�û���Ϣ��ѯ");
		kh_select.add(menu);
		JMenuItem id_menuitem = new  JMenuItem("ID��ѯ");
		JMenuItem name_menuitem = new JMenuItem("�û�����ѯ");
		JMenuItem tel_menuitem = new JMenuItem("�ֻ��Ų�ѯ");
		JMenuItem account_menuitem = new JMenuItem("�˻���ѯ");
		JMenuItem email_menuitem = new JMenuItem("�����ѯ");
		//�ֱ�Ϊÿ��jm����¼�������
		new CreateListener().userIDSelect(id_menuitem);
		new CreateListener().userNameSelect(name_menuitem);
		new CreateListener().userTelSelect(tel_menuitem);
		new CreateListener().userAccountSelect(account_menuitem);
		new CreateListener().userEmailSelect(email_menuitem);
		
		id_menuitem.setFont(font2);//�û���ѯ��Ϣ�����˵��������������
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
	
	public JMenuBar createSPSelectMenu() {//��Ʒ��ѯ
		JMenuBar  sp_select = new JMenuBar();
	setJMenuBar(sp_select);// ���˵���������ӵ�����Ĳ˵�����
		
		JMenu menu = new JMenu("��Ʒ��Ϣ��ѯ");
		sp_select.add(menu);
		JMenuItem id_menuitem = new  JMenuItem("��ƷID��ѯ");
		JMenuItem goodsname_menuitem = new JMenuItem("��Ʒ����ѯ");
		JMenuItem add_menuitem = new JMenuItem("���ز�ѯ");
		//Ϊ��Ʒ��ÿһ����ѯ����¼�������
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
	
	public JMenuBar createGYSSelectMenu() {//��Ӧ�̲�ѯ
		JMenuBar  gys_select = new JMenuBar();
		setJMenuBar(gys_select);// ���˵���������ӵ�����Ĳ˵�����
		
		JMenu menu = new JMenu("��Ӧ�̲�ѯ");
		gys_select.add(menu);
		
		JMenuItem id_menuitem = new  JMenuItem("ID��ѯ");
		JMenuItem suppliersname_menuitem = new JMenuItem("���Ʋ�ѯ");
		JMenuItem email_menuitem = new JMenuItem("�����ѯ");
		JMenuItem account_menuitem = new JMenuItem("�˻���ѯ");
		JMenuItem add_menuitem = new JMenuItem("��ַ��ѯ");
		JMenuItem tel_menuitem = new JMenuItem("�绰��ѯ");
		//Ϊ��Ӧ�̵�ÿһ���˵�������¼�������
		new CreateListener().gysIDSelect(id_menuitem);
		new CreateListener().gysNameSelect(suppliersname_menuitem);
		new CreateListener().gysEmailSelect(email_menuitem);
		new CreateListener().gysAccountSelect(account_menuitem);
		new CreateListener().gysAddSelect(add_menuitem);
		new CreateListener().gysTelSelect(tel_menuitem);
		
		id_menuitem.setFont(font2);//�Թ�Ӧ�������˵��������������
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
	
	public JMenuBar createXSDSelectMenu() {//���۵���ѯ
		JMenuBar  xsd_select = new JMenuBar();
		setJMenuBar(xsd_select);// ���˵���������ӵ�����Ĳ˵�����
		
		JMenu menu = new JMenu("���۵���ѯ");
		xsd_select.add(menu);
		
		JMenuItem id_menuitem = new  JMenuItem("ID��ѯ");
		JMenuItem khid_menuitem = new JMenuItem("�ͻ��Ų�ѯ");
		JMenuItem spid_menuitem = new JMenuItem("��Ʒ��Ų�ѯ");
		//Ϊ���۵���ÿһ����ѯ����¼�������
		new CreateListener().salesSPIDSelect(id_menuitem);
		new CreateListener().salesKHIDSelect(khid_menuitem);
		new CreateListener().salesSPIDSelect(spid_menuitem);
		
		id_menuitem.setFont(font2);
		khid_menuitem.setFont(font2);
		spid_menuitem.setFont(font2);
		
		menu.add(id_menuitem);//�����۵���ѯ�������˵��������������
		menu.add(khid_menuitem);
		menu.add(spid_menuitem);
		
		xsd_select.setBackground(new Color(211,223,194));
		menu.setFont(font);
		return xsd_select;
	}
}
