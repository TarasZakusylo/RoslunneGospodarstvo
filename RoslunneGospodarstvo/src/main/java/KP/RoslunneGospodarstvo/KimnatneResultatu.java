package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class KimnatneResultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Nazva;
	private JButton b_Nazad;
	
	private boolean boolean_kartunka1 = true ;
	private boolean boolean_kartunka2 = true ;
	private boolean boolean_kartunka3 = true ;
	private boolean boolean_kartunka4 = true ;

	private JLabel l_kartunka1;
	private Panel panel_ZumSad;
	private JLabel l_kartunka2;
	private JLabel l_kartunka3;
	private JLabel l_kartunka4;
	private JLabel l_ZumSad;
	private JScrollPane scrollPane;
	private Panel panel_Prukmetu;
	private Panel panel_Hvorobu;
	private Panel panel_Bonsai;
	private Panel panel_Hkidnuku;
	private Panel panel_Kupivla;
	private Panel panel_Rozmnogenna;
	private Panel panel_Doglad;
	private JLabel l_fon;

	public KimnatneResultatu(String string, int i_putanna1, int i_putanna2, int i_putanna3, int i_slider_putanna4,
			int i_slider_putanna5, int i_putanna6, int i_putanna7, int i_putanna8, int i_checkBox1_0, int i_checkBox1_1,
			int i_checkBox1_2, int i_checkBox1_3, int i_checkBox1_4, int i_checkBox1_5, int i_checkBox1_6,
			int i_checkBox1_7, int i_checkBox1_8, int i_checkBox1_9, int i_checkBox1_10, int i_checkBox1_11,
			int i_checkBox2_0, int i_checkBox2_1, int i_checkBox2_2, int i_checkBox2_3, int i_checkBox2_4,
			int i_checkBox2_5, int i_checkBox3_0, int i_checkBox3_1, int i_checkBox3_2, int i_checkBox3_3,
			int i_checkBox3_4, int i_checkBox3_5, int i_checkBox4_0, int i_checkBox4_1, int i_checkBox4_2,
			int i_checkBox4_3, int i_checkBox4_4, int i_checkBox4_5, int i_checkBox4_6, int i_checkBox4_7,
			int i_checkBox4_8, int i_checkBox4_9, int i_checkBox4_10) {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Nazva = new JLabel("Кімнатне розслинництво");
		l_Nazva.setBounds(0, 0, 794, 52);
		l_Nazva.setForeground(Color.RED);
		l_Nazva.setFont(new Font("Segoe UI", Font.ITALIC, 40));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(l_Nazva);

		b_Nazad = new JButton("Меню");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Рослинне господпрство");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 63, 770, 489);
		getContentPane().add(tabbedPane);
		
		panel_ZumSad = new Panel();
		tabbedPane.addTab("Зимовий сад / Оранжерея", null, panel_ZumSad, null);
		panel_ZumSad.setLayout(null);
		
		l_kartunka1 = new JLabel("");		
		l_kartunka1.addMouseListener(new MouseAdapter() {
			@Override			
			public void mouseClicked(MouseEvent arg0) {
				if (boolean_kartunka1 == true){
					l_kartunka1.setBounds(0, 0, 542, 459);
					l_kartunka1.setIcon(new ImageIcon("res/ZumSad1.1.jpg"));
					boolean_kartunka1 = false ; 
				}else{
					l_kartunka1.setBounds(0, 292, 187, 167);
					l_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
					boolean_kartunka1 = true ;
				}				
			}
		});
		l_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
		l_kartunka1.setBounds(0, 292, 187, 167);
		panel_ZumSad.add(l_kartunka1);
		
		l_kartunka2 = new JLabel("");
		l_kartunka2.addMouseListener(new MouseAdapter() {
			@Override			
			public void mouseClicked(MouseEvent arg0) {
				if (boolean_kartunka2 == true){
					l_kartunka2.setBounds(0, 0, 640, 459);
					l_kartunka1.setBounds(0, 0, 0, 0);
					l_kartunka2.setIcon(new ImageIcon("res/ZumSad2.1.jpg"));
					boolean_kartunka2 = false ; 
				}else{
					l_kartunka2.setBounds(188, 292, 223, 167);
					l_kartunka1.setBounds(0, 292, 187, 167);
					l_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
					boolean_kartunka2 = true ;
				}				
			}
		});
		l_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
		l_kartunka2.setBounds(188, 292, 223, 167);
		panel_ZumSad.add(l_kartunka2);
		
		l_kartunka3 = new JLabel("");
		l_kartunka3.addMouseListener(new MouseAdapter() {
			@Override			
			public void mouseClicked(MouseEvent arg0) {
				if (boolean_kartunka3 == true){
					l_kartunka3.setBounds(0, 0, 640, 459);
					l_kartunka2.setBounds(0, 0, 0, 0);
					l_kartunka1.setBounds(0, 0, 0, 0);
					l_kartunka3.setIcon(new ImageIcon("res/ZumSad3.1.jpg"));
					boolean_kartunka3 = false ; 
				}else{
					l_kartunka3.setBounds(412, 292, 223, 167);
					l_kartunka1.setBounds(0, 292, 187, 167);
					l_kartunka2.setBounds(188, 292, 223, 167);
					l_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
					boolean_kartunka3 = true ;
				}				
			}
		});
		l_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
		l_kartunka3.setBounds(412, 292, 223, 167);
		panel_ZumSad.add(l_kartunka3);
		
		l_kartunka4 = new JLabel("");
		l_kartunka4.addMouseListener(new MouseAdapter() {
			@Override			
			public void mouseClicked(MouseEvent arg0) {
				if (boolean_kartunka4 == true){
					l_kartunka4.setBounds(408, 0, 360, 459);
					l_kartunka3.setBounds(0, 0, 0, 0);
					l_kartunka4.setIcon(new ImageIcon("res/ZumSad4.1.jpg"));
					boolean_kartunka4 = false ; 
				}else{
					l_kartunka4.setBounds(637, 292, 131, 167);
					l_kartunka3.setBounds(412, 292, 223, 167);
					l_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
					boolean_kartunka4 = true ;
				}				
			}
		});
		l_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
		l_kartunka4.setBounds(637, 292, 131, 167);
		panel_ZumSad.add(l_kartunka4);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 765, 291);
		panel_ZumSad.add(scrollPane);
		
		l_ZumSad = new JLabel("");
		scrollPane.setViewportView(l_ZumSad);
		l_ZumSad.setIcon(new ImageIcon("res/ZumSad.PNG"));
		
		panel_Bonsai = new Panel();
		tabbedPane.addTab("Бонсай / суісекі", null, panel_Bonsai, null);
		
		panel_Prukmetu = new Panel();
		tabbedPane.addTab("Прикмети", null, panel_Prukmetu, null);
		
		panel_Hkidnuku = new Panel();
		tabbedPane.addTab("Шкідники", null, panel_Hkidnuku, null);
		
		panel_Hvorobu = new Panel();
		tabbedPane.addTab("Хвороби", null, panel_Hvorobu, null);
		
		panel_Rozmnogenna = new Panel();
		tabbedPane.addTab("Розмноження", null, panel_Rozmnogenna, null);
		
		panel_Kupivla = new Panel();
		tabbedPane.addTab("Купівля", null, panel_Kupivla, null);
		
		panel_Doglad = new Panel();
		tabbedPane.addTab("Догляд", null, panel_Doglad, null);
		
		 l_fon = new JLabel("");
		 l_fon.setBounds(0, 0, 794, 565);
		 l_fon.setIcon(new ImageIcon("res/fon_KimnatneResultat.jpg"));
		 getContentPane().add(l_fon);

		setVisible(true);
		
	}
}
