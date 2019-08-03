import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyDialog extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void createLoginDialog() {//创建点击注册时的窗口
		final JFrame jf = new JFrame("ע��");
	    jf.setLayout(null);
	    jf.setVisible(true);
	    Font font = new Font("΢���ź�", Font.PLAIN, 18);
	    final JLabel jluser_name= new JLabel("�û���:");
	    jluser_name.setBounds(40, 40, 60, 50);
	    jluser_name.setFont(font);
	    final JLabel jluser_password = new JLabel("��   ��:");
	    jluser_password.setBounds(40, 70, 60, 50);
	    jluser_password.setFont(font);
	    final JTextField login_user_name = new JTextField();
	    login_user_name.setBounds(100, 50, 200, 25);
//	    login_user_name.requestFocus();
	    final JPasswordField login_password = new JPasswordField();
	    login_password.setBounds(100, 85, 200, 25);
	    Font font1 = new Font("΢���ź�", Font.PLAIN, 15);
	    JButton jb_confirm = new JButton("ȷ��");
	    jb_confirm.setFont(font1);
	    jb_confirm.setBounds(110, 110, 70, 25);
	    jb_confirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		        
				String user_name = login_user_name.getText();
				String user_password = String.valueOf(login_password.getPassword());
				
				if(user_name.equals("")||user_password.equals("")) {//
					if(user_name.equals("")) {
						JOptionPane.showMessageDialog(null, "�������û���!");
					}
					else {
						JOptionPane.showMessageDialog(null, "����������!");
					}
				}		
				else {
					boolean exist = false;
					JXCMainPage temp = new JXCMainPage();
					temp.refreshConnectionAndIt();
					Iterator<String> it = temp.getIt();
					while(it.hasNext()) {
						if(it.next().equals(user_name)) {
							exist = true;
							break;
						}
					}
					if(exist == true) {
						JOptionPane.showMessageDialog(null, "�û����Ѵ���,����������!");
					}
					else {
						try {
						PreparedStatement sql;
						Connection con = temp.getConnection();
						sql = con.prepareStatement("insert into tb_users values(?,?)");
						sql.setString(1, user_name);
						sql.setString(2, user_password);
						sql.executeUpdate();
						JOptionPane.showMessageDialog(null, "ע��ɹ�!");
						jf.dispose();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
					
				}
			}
		});
	    JButton jb_cancel = new JButton("ȡ��");
	    jb_cancel.setFont(font1);
	    jb_cancel.setBounds(220, 110,70, 25);
	    jb_cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jf.dispose();//�رյ�ǰ����
			}
		});
	   
	   
	    Container container = jf.getContentPane();
	    container.add(login_user_name);
	    container.add(login_password);
	    container.add(jluser_name);
	    container.add(jluser_password);
	    container.add(login_password);
	    container.add(jb_confirm);
	    container.add(jb_cancel);
	    jf.setSize(new Dimension(400,200));
	    jf.setBounds(500, 300, 400, 200);
	    jf.setResizable(false);//���ô���Ϊ�̶���С
	    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void createExitDialog()//���������ť�˳�ʱ�����Ĵ���
	{
	    final JFrame jf = new JFrame("���");
	    jf.setLayout(null);
	    URL url = MyDialog.class.getResource("exit.jpg");
	    Icon icon = new ImageIcon(url);
	    JLabel jl = new JLabel("��ȷ��Ҫ�˳���");
	    Font font = new Font("΢���ź�", Font.PLAIN, 20);
	    jl.setFont(font);
	    jl.setIcon(icon);
	    jl.setBounds(90, 30, 250, 40);
	    Font font1 = new Font("΢���ź�", Font.PLAIN, 15);
	    JButton confirm = new JButton("ȷ��");
	    confirm.setBounds(90, 90, 80, 25);
	    confirm.setFont(font1);
	    confirm.addActionListener(new ActionListener()
	    {
	        @Override
	        public void actionPerformed(ActionEvent e)
	        {
	            // TODO Auto-generated method stub
	            System.exit(0);
	        }
	    });
	    JButton cancel = new JButton("ȡ��");
	    cancel.setBounds(200, 90, 80, 25);
	    cancel.setFont(font1);
	    cancel.addActionListener(new ActionListener()
	    {
	        @Override
	        public void actionPerformed(ActionEvent e)
	        {
	            // TODO Auto-generated method stub
	            jf.dispose();
	        }
	    });
	    Container con = jf.getContentPane();
	    con.add(jl);
	    con.add(confirm);
	    con.add(cancel);
	    jf.setBounds(600, 400, 360, 180);
	    jf.setVisible(true);
	    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    jf.setResizable(false);//
	}
	}
public class JXCMainPage extends JFrame{
	private static final long serialVersionUID = 1L;
    static Connection con;
    static ResultSet res;
    static PreparedStatement presql;
    static  Map<String, String> map = new HashMap<>(); //
    static Set<String> set ;//
    static Iterator<String> it ;//
    JFrame jf = new JFrame("���������ϵͳ��¼");
    public void getMainPage()
    {
        Container container = jf.getContentPane();
        container.setLayout(null);//
        Font font = new Font("΢���ź�", Font.PLAIN, 15);

        final JLabel user = new JLabel("�û���:");
        user.setFont(font);
        user.setBounds(100, 80, 50, 50);
        final JLabel password = new JLabel("��   ��:");
        password.setFont(font);
        password.setBounds(100, 110, 50, 50);
        final JTextField usertext =  new JTextField(25);
        usertext.setBounds(160, 96, 200, 20);
        final JPasswordField passwordtext =  new JPasswordField(25);
        passwordtext.setBounds(160, 126, 200, 20);

        final JButton log = new JButton("��¼");
        log.setFont(font);
        log.setBounds(120, 156, 70, 25);
        log.addActionListener(new ActionListener()  //
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
    	        JXCMainPage.con = new DBConnection().getConnection();
    	        getUserMessage(JXCMainPage.con,JXCMainPage.map);
                String username = usertext.getText();//
                String password = String.valueOf(passwordtext.getPassword());
                if(username.equals("")||password.equals("")) {
                	if(username.equals("")) {
                	JOptionPane.showMessageDialog(null, "�������û���!");
                	}
                	else {
                		JOptionPane.showMessageDialog(null, "����������!");
                	}
                }
                else
                {
                    int flag = 1;
                    it = set.iterator();
                    while(it.hasNext())
                    {
                        String temp = it.next();
                        String passwordList = map.get(temp).trim();
                        String userList = temp.trim();
                        if(username.equals(userList)) 
                        {
                            flag = 0;
                            if(password.equals(passwordList)) //
                            {
                                jf.dispose();
                                new MainPage();
                                break;
                            }
                            else  //
                            {
                                JOptionPane.showMessageDialog(null, "�������,����������");
                                break;
                            }
                        }
                    }
                    if(flag == 1)
                    {
                        JOptionPane.showMessageDialog(null, "�û���������,����������!");
                    }
                }
            }
        });

        final JButton quit = new JButton("�˳�");
        quit.setFont(font);
        quit.setBounds(280, 156, 70, 25);
        quit.addActionListener(new ActionListener()  // 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
                new MyDialog().createExitDialog();// 
            }
        });

        final JButton login = new JButton("ע��");
        login.setFont(font);
        login.setBounds(200, 156, 70, 25);
        login.addActionListener(new ActionListener()  // 
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                // TODO Auto-generated method stub
            	refreshConnectionAndIt();
            	new MyDialog().createLoginDialog();
            }
        });
        
        container.add(user);
        container.add(usertext);
        container.add(password);
        container.add(passwordtext);
        container.add(log);
        container.add(quit);
        container.add(login);

        jf.setLocation(700, 300); // 
        jf.setVisible(true);
        jf.setSize(new Dimension(446, 250));
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setResizable(false);// 
    }
    public static  void getUserMessage(Connection con, Map<String, String> map) // 
    {
        try
        {
            JXCMainPage.presql = con.prepareStatement("select * from tb_users");
            JXCMainPage.res = JXCMainPage.presql.executeQuery();
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try
        {
            while(res.next())
            {
                map.put(res.getString("users_name"), res.getString("users_password"));
            }
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        set = map.keySet();//
        it = set.iterator();
    }
   public void refreshConnectionAndIt() {// 
    	JXCMainPage.con = new DBConnection().getConnection();// 
        getUserMessage(JXCMainPage.con,JXCMainPage.map);// 
    }

   public  Iterator<String> getIt(){
	   return it;
   }
   public Connection getConnection() {
	   return con;
   }
   public PreparedStatement getPrepareStatement() {
	   return presql;
   }
   public  ResultSet getResult(){
	   return res;
   }
   public Map<String, String> getMap(){
	   return map;
   }
   public Set<String> getSet(){
	   return set;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JXCMainPage.con = new DBConnection().getConnection();// 
        getUserMessage(JXCMainPage.con,JXCMainPage.map);// 
        new JXCMainPage().getMainPage();
	}

}
