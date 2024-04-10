import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menudemo implements ActionListener
{
	JFrame f=new JFrame("menudemo");
	JLabel L1;
	JMenuBar mb;
	JMenu File,Edit,Submenu;
	JMenuItem i1,i2,i3,i4,i5;
	menudemo()
	{
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		L1=new JLabel("selected item are displayed here");
		L1.setBounds(100,200,100,300);
		
		mb=new JMenuBar();
		File=new JMenuBar("FILE");
		Edit=new JMenuBar("EDIT");
		Submenu=new JMenuBar("ZOOM");
		
		i1=new JMenuItem("NEW");
		i2=new JMenuItem("OPEN");
		i3=new JMenuItem("SAVE");
		i4=new JMenuItem("ZOOMIN");
		i5=new JMenuItem("ZOOMOUT");
		
		File.add(i1);File.add(i2);File.add(i3);
		Submenu.add(i4);Submenu.add(i5);
		edit.add(Submenu);
		mb.add(File);mb.add(Edit);
		f.setMenuBar(mb);
		f.add(L1);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		string s=ae.getActionCommand();
		L1.setText(s+"selected");
	}
	public static void main(String args[])
	{
		new menudemo();
	}
}