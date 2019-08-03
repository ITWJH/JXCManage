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
	Container container;//创建一个container的引用
	JFrame jf;
	Font hint_font = new Font("微软雅黑",Font.PLAIN,16);
	Font button_font = new Font("宋体",Font.BOLD,16);
	
	public void getBasicFrame() {//用来管理21个查询按钮的布局
		jf = this;
		jf.setLayout(null);//设置当前对象为边框布局管理器
		container = this.getContentPane();//实例化这个Container的引用
		jf.setVisible(true);
		jf.setResizable(false);
		container.setBackground(new Color(211,223,194));
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jf.setLocation(400, 400);
		jf.setSize(new Dimension(410,180));
	}
	public void setLabelAndButtonLayoutAboutThree(JLabel jl) {//用来设置文本框"JTextField"和标签"JLabel"的布局,这个是"三个字体"的布局
		JTextField jt = new JTextField();//设置文本框
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("确认");
		JButton cancel = new JButton("取消");
		JButton eliminate = new JButton("清除");
		
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
	public void setLabelAndButtonLayoutAboutEight(JLabel jl) {//用来设置文本框"JTextField"和标签"JLabel"的布局,这个是"三个字体"的布局
		JTextField jt = new JTextField();//设置文本框
		jt.setBounds(179, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("确认");
		JButton cancel = new JButton("取消");
		JButton eliminate = new JButton("清除");
		
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
	
	public void setLabelAndButtonLayoutAboutFour(JLabel jl) {//用来设置文本框"JTextField"和标签"JLabel"的布局,这个是"三个字体"的布局
		JTextField jt = new JTextField();//设置文本框
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("确认");
		JButton cancel = new JButton("取消");
		JButton eliminate = new JButton("清除");
		
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
	public void setLabelAndButtonLayoutAboutFive(JLabel jl) {//用来设置文本框"JTextField"和标签"JLabel"的布局,这个是"三个字体"的布局
		JTextField jt = new JTextField();//设置文本框
		jt.setBounds(125, 45, 200, 25);
		jl.setBounds(45, 45, 200, 20);
		jl.setFont(hint_font);
		JButton confirm = new JButton("确认");
		JButton cancel = new JButton("取消");
		JButton eliminate = new JButton("清除");
		
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
	
	public void userIDSelect(JMenuItem jm) {//用户ID查询

		jm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("用户ID:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void userNameSelect(JMenuItem jm) {//用户姓名查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("用户名:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void userTelSelect(JMenuItem jm) {//用户手机号查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("用户手机号:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	
	public void userAccountSelect(JMenuItem jm) {//用户账号查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("用户账号:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void userEmailSelect(JMenuItem jm) {//用户email查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("用户邮箱:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	
	public void goodsIDSelect(JMenuItem jm){//商品ID查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("商品ID:");
				setLabelAndButtonLayoutAboutThree(jl);
			}
		});
	}
	
	public void goodsNameSelect(JMenuItem jm) {//商品名称查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("商品名称:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void goodsAddSelect(JMenuItem jm) {//商品产地查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("输入产地:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	
	public void gysIDSelect(JMenuItem jm) {//供应商ID查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商ID:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	public void gysNameSelect(JMenuItem jm) {//供应商name查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商名称:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysEmailSelect(JMenuItem jm) {//供应商email查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商邮箱:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysAccountSelect(JMenuItem jm) {//供应商account查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商账户:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysAddSelect(JMenuItem jm) {//供应商地址查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商地址:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void gysTelSelect(JMenuItem jm) {//供应商电话号码查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("供应商电话:");
				setLabelAndButtonLayoutAboutFive(jl);
			}
		});
	}
	public void salesIDSelect(JMenuItem jm) {//销售单ID查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("销售单ID:");
				setLabelAndButtonLayoutAboutFour(jl);
			}
		});
	}
	
	public void salesKHIDSelect(JMenuItem jm) {//销售单kh_id查询
	jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("销售单上的客户ID:");
				setLabelAndButtonLayoutAboutEight(jl);
			}
		});
	}
	public void salesSPIDSelect(JMenuItem jm) {//销售单sp_id查询
		jm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getBasicFrame();//对窗体的基本属性设置,减少代码的冗余度
				
				JLabel jl = new JLabel("销售单上的商品ID:");
				setLabelAndButtonLayoutAboutEight(jl);
			}
		});
	}
	/*以上是设置查询按钮的监听器*/
	/*一下为设置增删改查的事件监听器*/
	public void amendUserMessage(JButton jb) {//修改客户信息
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteUser(JButton jb) {//删除用户
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addUser(JButton jb) {//添加用户
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendGoodsMessage(JButton jb) {//修改商品信息
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteGoods(JButton jb) {//删除商品
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addGoods(JButton jb) {//添加商品时间监听器
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendSupplierMessage(JButton jb) {//修改供应商信息
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteSupplier(JButton jb) {//删除供应商
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addSupplier(JButton jb) {//添加供应商
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void amendAdminName(JButton jb) {//修改管理员名
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void amendAdminPassword(JButton jb) {//修改管理员密码
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void deleteAdmin(JButton jb) {//删除管理员
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void addAdmin(JButton jb) {//添加管理员
	jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
