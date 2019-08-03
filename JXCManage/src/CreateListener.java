import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class CreateListener extends JFrame{
	private static final long serialVersionUID = 1L;
	Container container;//����һ��container������
	JFrame jf;
	Font hint_font = new Font("΢���ź�",Font.PLAIN,16);
	Font button_font = new Font("����",Font.BOLD,16);
	
	public void getBasicFrame() {//��������21����ѯ��ť�Ĳ���
		jf = this;
		jf.setLayout(null);//���õ�ǰ����Ϊ�߿򲼾ֹ�����
		container = this.getContentPane();//ʵ�������Container������
		jf.setVisible(true);
		jf.setResizable(false);
		container.setBackground(new Color(211,223,194));
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLocation(400, 400);
		jf.setSize(new Dimension(410,180));
	}
	public void setLabelAndButtonLayoutAboutThree(JLabel jl) {//���������ı���"JTextField"�ͱ�ǩ"JLabel"�Ĳ���,�����"��������"�Ĳ���
		JTextField jt = new JTextField();//�����ı���
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("ȷ��");
		JButton cancel = new JButton("ȡ��");
		JButton eliminate = new JButton("���");
		
		confirm.setFont(button_font);
		cancel.setFont(button_font); 
		eliminate.setFont(button_font);
		
		confirm.setBounds(60, 90, 70, 25);
		cancel.setBounds(160, 90, 70, 25);
		eliminate.setBounds(260, 90, 70, 25);
		
		container.add(confirm);
		container.add(cancel);
		container.add(eliminate);
		container.add(jl);
		container.add(jt);
	}
	public void setLabelAndButtonLayoutAboutEight(JLabel jl) {//���������ı���"JTextField"�ͱ�ǩ"JLabel"�Ĳ���,�����"��������"�Ĳ���
		JTextField jt = new JTextField();//�����ı���
		jt.setBounds(179, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("ȷ��");
		JButton cancel = new JButton("ȡ��");
		JButton eliminate = new JButton("���");
		
		confirm.setFont(button_font);
		cancel.setFont(button_font); 
		eliminate.setFont(button_font);
		
		confirm.setBounds(60, 90, 70, 25);
		cancel.setBounds(160, 90, 70, 25);
		eliminate.setBounds(260, 90, 70, 25);
		
		container.add(confirm);
		container.add(cancel);
		container.add(eliminate);
		container.add(jl);
		container.add(jt);
	}
	
	public void setLabelAndButtonLayoutAboutFour(JLabel jl) {//���������ı���"JTextField"�ͱ�ǩ"JLabel"�Ĳ���,�����"��������"�Ĳ���
		JTextField jt = new JTextField();//�����ı���
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("ȷ��");
		JButton cancel = new JButton("ȡ��");
		JButton eliminate = new JButton("���");
		
		confirm.setFont(button_font);
		cancel.setFont(button_font); 
		eliminate.setFont(button_font);
		
		confirm.setBounds(60, 90, 70, 25);
		cancel.setBounds(160, 90, 70, 25);
		eliminate.setBounds(260, 90, 70, 25);
		
		container.add(confirm);
		container.add(cancel);
		container.add(eliminate);
		container.add(jl);
		container.add(jt);
	}
	public void setLabelAndButtonLayoutAboutFive(JLabel jl) {//���������ı���"JTextField"�ͱ�ǩ"JLabel"�Ĳ���,�����"��������"�Ĳ���
		JTextField jt = new JTextField();//�����ı���
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("ȷ��");
		JButton cancel = new JButton("ȡ��");
		JButton eliminate = new JButton("���");
		
		confirm.setFont(button_font);
		cancel.setFont(button_font); 
		eliminate.setFont(button_font);
		
		confirm.setBounds(60, 90, 70, 25);
		cancel.setBounds(160, 90, 70, 25);
		eliminate.setBounds(260, 90, 70, 25);
		
		container.add(confirm);
		container.add(cancel);
		container.add(eliminate);
		container.add(jl);
		container.add(jt);
	}
	
	public void userIDSelect(JMenuItem jm) {//�û�ID��ѯ

		jm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�û�ID:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void userNameSelect(JMenuItem jm) {//�û�������ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�û���:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void userTelSelect(JMenuItem jm) {//�û��ֻ��Ų�ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�û��ֻ���:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	
	public void userAccountSelect(JMenuItem jm) {//�û��˺Ų�ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�û��˺�:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void userEmailSelect(JMenuItem jm) {//�û�email��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�û�����:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	
	public void goodsIDSelect(JMenuItem jm){//��ƷID��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��ƷID:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void goodsNameSelect(JMenuItem jm) {//��Ʒ���Ʋ�ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ʒ����:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void goodsAddSelect(JMenuItem jm) {//��Ʒ���ز�ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("�������:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	
	public void gysIDSelect(JMenuItem jm) {//��Ӧ��ID��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ��ID:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	public void gysNameSelect(JMenuItem jm) {//��Ӧ��name��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ������:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysEmailSelect(JMenuItem jm) {//��Ӧ��email��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ������:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysAccountSelect(JMenuItem jm) {//��Ӧ��account��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ���˻�:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysAddSelect(JMenuItem jm) {//��Ӧ�̵�ַ��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ�̵�ַ:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysTelSelect(JMenuItem jm) {//��Ӧ�̵绰�����ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("��Ӧ�̵绰:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void salesIDSelect(JMenuItem jm) {//���۵�ID��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("���۵�ID:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void salesKHIDSelect(JMenuItem jm) {//���۵�kh_id��ѯ
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("���۵��ϵĿͻ�ID:");
				setLabelAndButtonLayoutAboutEight(jl);
			}
		});
	}
	public void salesSPIDSelect(JMenuItem jm) {//���۵�sp_id��ѯ
		jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//�Դ���Ļ�����������,���ٴ���������
				
				JLabel jl = new JLabel("���۵��ϵ���ƷID:");
				setLabelAndButtonLayoutAboutEight(jl);
			}
		});
	}
	/*���������ò�ѯ��ť�ļ�����*/
	/*һ��Ϊ������ɾ�Ĳ���¼�������*/
	public void amendUserMessage(JButton jb) {//�޸Ŀͻ���Ϣ
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteUser(JButton jb) {//ɾ���û�
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addUser(JButton jb) {//����û�
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendGoodsMessage(JButton jb) {//�޸���Ʒ��Ϣ
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteGoods(JButton jb) {//ɾ����Ʒ
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addGoods(JButton jb) {//�����Ʒʱ�������
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendSupplierMessage(JButton jb) {//�޸Ĺ�Ӧ����Ϣ
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteSupplier(JButton jb) {//ɾ����Ӧ��
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addSupplier(JButton jb) {//��ӹ�Ӧ��
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendAdminName(JButton jb) {//�޸Ĺ���Ա��
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void amendAdminPassword(JButton jb) {//�޸Ĺ���Ա����
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteAdmin(JButton jb) {//ɾ������Ա
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addAdmin(JButton jb) {//��ӹ���Ա
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
