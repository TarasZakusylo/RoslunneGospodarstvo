package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JDesktopPane;

public class KimnatneResultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Nazva;
	private JButton b_Nazad;

	private boolean boolean_kartunka1 = true;
	private boolean boolean_kartunka2 = true;
	private boolean boolean_kartunka3 = true;
	private boolean boolean_kartunka4 = true;

	private boolean boolean_Bonsai_Kartunka1 = true;
	private boolean boolean_Bonsai_Kartunka2 = true;

	private JLabel l_ZumSad_kartunka1;
	private Panel panel_ZumSad;
	private JLabel l_ZumSad_kartunka2;
	private JLabel l_ZumSad_kartunka3;
	private JLabel l_ZumSad_kartunka4;
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
	private JLabel l_Bonsai_Kartunka1;
	private JLabel l_Bonsai_Kartunka2;
	private JLabel l_Bonsai;
	private JScrollPane scrollPane_1;
	private JLabel l_fonKupivli;
	private JLabel l_Galsad;
	private JLabel l_Galsad_logo;
	private JLabel l_Florium;
	private JLabel l_2_logo;
	private JLabel l_Landscape;
	private JLabel l_4_logo;
	private JLabel l_Greensad;
	private JLabel l_3_logo;
	private JLabel l_Bigl;
	private JLabel l_5_logo;

	Desktop desktop = Desktop.getDesktop();

	private JLabel l_Komentar;

	private JPanel panel_KohannaScasta;
	private JTextPane textPane_Text;
	private JRadioButton rB_5;
	private JRadioButton rB_6;
	private JRadioButton rB_3;
	private JRadioButton rB_4;
	private JRadioButton rB_2;
	private JRadioButton rB_1;
	private JPanel panel_UdacaDostatok;
	private JLabel l_Kartunka;
	private ButtonGroup group_Prukmetu1;
	private ButtonGroup group_Prukmetu2;
	private JScrollPane scrollPane_2;
	
	String s_Prukmetu1_1 = "Товстянка (крассула) або ж просто «грошове дерево» є одним з найвідоміших грошових символів. Листя, що за формою нагадують монети, символізують стабільність, постійне зростання, надійні результати. Якщо листя на рослині дрібне - буде дзвеніти в кишені дріб'язок, якщо велике, то в кишені будуть хрустіти паперові купюри. А вже якщо товстянка зацвіла - з упевненістю очікуйте багатства. Рослина не надто вимоглива до умов і потребує простого, але регулярного догляду - помірного поливу подалі від палючого сонця. Як варіант можна придбати заміокулькас (доларове дерево). Це також досить невибаглива рослина, що побратимом грошового дерева.";
	String s_Prukmetu1_2 = "s_Prukmetu1_2";
	String s_Prukmetu1_3 = "s_Prukmetu1_3";
	String s_Prukmetu1_4 = "s_Prukmetu1_4";
	String s_Prukmetu1_5 = "s_Prukmetu1_5";
	String s_Prukmetu1_6 = "s_Prukmetu1_6";
	
	String s_Prukmetu2_1 = "s_Prukmetu2_1";
	String s_Prukmetu2_2 = "s_Prukmetu2_2";
	String s_Prukmetu2_3 = "s_Prukmetu2_3";
	String s_Prukmetu2_4 = "s_Prukmetu2_4";
	String s_Prukmetu2_5 = "s_Prukmetu2_5";
	String s_Prukmetu2_6 = "s_Prukmetu2_6";
	String s_Prukmetu2_7 = "s_Prukmetu2_7";
	String s_Prukmetu2_8 = "s_Prukmetu2_8";
	String s_Prukmetu2_9 = "s_Prukmetu2_9";
	String s_Prukmetu2_10 = "s_Prukmetu2_10";

	private JLabel l_fonKimnatneUdacaDostatok;
	private JLabel l_fonKimnatne;
	private JRadioButton rB_Prukmet2_9;
	private JRadioButton rB_Prukmet2_10;
	private JLabel l_fonPrukmetuScasta;
	private JRadioButton rB_Prukmet2_6;
	private JRadioButton rB_Prukmet2_8;
	private JRadioButton rB_Prukmet2_5;
	private JRadioButton rB_Prukmet2_7;
	private JRadioButton rB_Prukmet2_4;
	private JRadioButton rB_Prukmet2_3;
	private JRadioButton rB_Prukmet2_2;
	private JRadioButton rB_Prukmet2_1;
	private JTextPane textPane_TextScasta;
	private JLabel label_KartunkaScasta;

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

		if (i_putanna1 == 1) {
			panel_ZumSad = new Panel();
			tabbedPane.addTab("Зимовий сад / Оранжерея", null, panel_ZumSad, null);
			panel_ZumSad.setLayout(null);

			l_ZumSad_kartunka1 = new JLabel("");
			l_ZumSad_kartunka1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka1 == true) {
						l_ZumSad_kartunka1.setBounds(0, 0, 542, 459);
						l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.1.jpg"));
						boolean_kartunka1 = false;
					} else {
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
						boolean_kartunka1 = true;
					}
				}
			});
			l_ZumSad_kartunka1.setIcon(new ImageIcon("res/ZumSad1.jpg"));
			l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
			panel_ZumSad.add(l_ZumSad_kartunka1);

			l_ZumSad_kartunka2 = new JLabel("");
			l_ZumSad_kartunka2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka2 == true) {
						l_ZumSad_kartunka2.setBounds(0, 0, 640, 459);
						l_ZumSad_kartunka1.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.1.jpg"));
						boolean_kartunka2 = false;
					} else {
						l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
						boolean_kartunka2 = true;
					}
				}
			});
			l_ZumSad_kartunka2.setIcon(new ImageIcon("res/ZumSad2.jpg"));
			l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
			panel_ZumSad.add(l_ZumSad_kartunka2);

			l_ZumSad_kartunka3 = new JLabel("");
			l_ZumSad_kartunka3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka3 == true) {
						l_ZumSad_kartunka3.setBounds(0, 0, 640, 459);
						l_ZumSad_kartunka2.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka1.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.1.jpg"));
						boolean_kartunka3 = false;
					} else {
						l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
						l_ZumSad_kartunka1.setBounds(0, 292, 187, 167);
						l_ZumSad_kartunka2.setBounds(188, 292, 223, 167);
						l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
						boolean_kartunka3 = true;
					}
				}
			});
			l_ZumSad_kartunka3.setIcon(new ImageIcon("res/ZumSad3.jpg"));
			l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
			panel_ZumSad.add(l_ZumSad_kartunka3);

			l_ZumSad_kartunka4 = new JLabel("");
			l_ZumSad_kartunka4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_kartunka4 == true) {
						l_ZumSad_kartunka4.setBounds(408, 0, 360, 459);
						l_ZumSad_kartunka3.setBounds(0, 0, 0, 0);
						l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.1.jpg"));
						boolean_kartunka4 = false;
					} else {
						l_ZumSad_kartunka4.setBounds(637, 292, 131, 167);
						l_ZumSad_kartunka3.setBounds(412, 292, 223, 167);
						l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
						boolean_kartunka4 = true;
					}
				}
			});
			l_ZumSad_kartunka4.setIcon(new ImageIcon("res/ZumSad4.jpg"));
			l_ZumSad_kartunka4.setBounds(637, 292, 131, 167);
			panel_ZumSad.add(l_ZumSad_kartunka4);

			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 765, 291);
			panel_ZumSad.add(scrollPane);

			l_ZumSad = new JLabel("");
			scrollPane.setViewportView(l_ZumSad);
			l_ZumSad.setIcon(new ImageIcon("res/ZumSad.PNG"));
		}
		if (i_putanna2 == 1) {
			panel_Bonsai = new Panel();
			tabbedPane.addTab("Бонсай / суісекі", null, panel_Bonsai, null);
			panel_Bonsai.setLayout(null);

			l_Bonsai_Kartunka1 = new JLabel("");
			l_Bonsai_Kartunka1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_Bonsai_Kartunka1 == true) {
						l_Bonsai_Kartunka1.setBounds(420, 0, 345, 459);
						l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.1.jpg"));
						boolean_Bonsai_Kartunka1 = false;
					} else {
						l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
						l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.jpg"));
						boolean_Bonsai_Kartunka1 = true;
					}
				}
			});
			l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
			l_Bonsai_Kartunka1.setIcon(new ImageIcon("res/Bonsai1.jpg"));
			panel_Bonsai.add(l_Bonsai_Kartunka1);

			l_Bonsai_Kartunka2 = new JLabel("");
			l_Bonsai_Kartunka2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if (boolean_Bonsai_Kartunka2 == true) {
						l_Bonsai_Kartunka2.setBounds(420, 0, 345, 459);
						l_Bonsai_Kartunka1.setBounds(0, 0, 0, 0);
						l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.1.jpg"));
						boolean_Bonsai_Kartunka2 = false;
					} else {
						l_Bonsai_Kartunka2.setBounds(555, 229, 210, 230);
						l_Bonsai_Kartunka1.setBounds(555, 0, 210, 230);
						l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.jpg"));
						boolean_Bonsai_Kartunka2 = true;
					}
				}
			});
			l_Bonsai_Kartunka2.setBounds(555, 229, 210, 230);
			l_Bonsai_Kartunka2.setIcon(new ImageIcon("res/Bonsai2.jpg"));
			panel_Bonsai.add(l_Bonsai_Kartunka2);

			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(0, 0, 553, 459);
			panel_Bonsai.add(scrollPane_1);

			l_Bonsai = new JLabel("");
			scrollPane_1.setViewportView(l_Bonsai);
			l_Bonsai.setIcon(new ImageIcon("res/Bonsai.PNG"));
		}

		panel_Prukmetu = new Panel();
		tabbedPane.addTab("Прикмети", null, panel_Prukmetu, null);
		panel_Prukmetu.setLayout(null);

		JTabbedPane tabbedPane_Prukmetu = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_Prukmetu.setBounds(0, 0, 765, 459);
		panel_Prukmetu.add(tabbedPane_Prukmetu);

		panel_UdacaDostatok = new JPanel();
		tabbedPane_Prukmetu.addTab("Рослини, що приносять удачу та достаток", null, panel_UdacaDostatok, null);
		panel_UdacaDostatok.setLayout(null);

		l_Kartunka = new JLabel("");
		l_Kartunka.setBounds(310, 0, 450, 338);
		l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
		panel_UdacaDostatok.add(l_Kartunka);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 310, 338);
		panel_UdacaDostatok.add(scrollPane_2);

		textPane_Text = new JTextPane();
		scrollPane_2.setViewportView(textPane_Text);
		textPane_Text.setText(s_Prukmetu1_1);
		
		rB_1 = new JRadioButton("Товстянка");
		rB_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_1.setForeground(Color.WHITE);
		rB_1.setBounds(42, 356, 194, 25);
		rB_1.setSelected(true);
		rB_1.setOpaque(false);
		panel_UdacaDostatok.add(rB_1);
		rB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_1);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});

		rB_2 = new JRadioButton("«Бамбук щастя»");
		rB_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_2.setForeground(Color.WHITE);
		rB_2.setBounds(42, 386, 194, 25);
		panel_UdacaDostatok.add(rB_2);
		rB_2.setOpaque(false);
		rB_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_2);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu2.jpg"));
			}
		});

		rB_4 = new JRadioButton("Азалія");
		rB_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_4.setForeground(Color.WHITE);
		rB_4.setBounds(308, 386, 194, 25);
		panel_UdacaDostatok.add(rB_4);
		rB_4.setOpaque(false);
		rB_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_4);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu4.jpg"));
			}
		});

		rB_3 = new JRadioButton("Бугенвілія");
		rB_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_3.setForeground(Color.WHITE);
		rB_3.setBounds(308, 356, 194, 25);
		panel_UdacaDostatok.add(rB_3);
		rB_3.setOpaque(false);
		rB_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_3);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu3.jpg"));
			}
		});

		rB_6 = new JRadioButton("Цитрусові");
		rB_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_6.setForeground(Color.WHITE);
		rB_6.setBounds(566, 386, 194, 25);
		panel_UdacaDostatok.add(rB_6);
		rB_6.setOpaque(false);
		rB_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_6);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu6.jpg"));
			}
		});

		rB_5 = new JRadioButton("Бегонія");
		rB_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_5.setForeground(Color.WHITE);
		rB_5.setBounds(566, 356, 194, 25);
		panel_UdacaDostatok.add(rB_5);
		rB_5.setOpaque(false);
		rB_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Text.setText(s_Prukmetu1_5);
				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu5.jpg"));
			}
		});
		
		group_Prukmetu1 = new ButtonGroup();
		group_Prukmetu1.add(rB_1);
		group_Prukmetu1.add(rB_2);
		group_Prukmetu1.add(rB_3);
		group_Prukmetu1.add(rB_4);
		group_Prukmetu1.add(rB_5);
		group_Prukmetu1.add(rB_6);
		
		l_fonKimnatne = new JLabel("");
		l_fonKimnatne.setBounds(0, 0, 765, 459);
		l_fonKimnatne.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
		panel_Prukmetu.add(l_fonKimnatne);
		
		l_fonKimnatneUdacaDostatok = new JLabel("");
		l_fonKimnatneUdacaDostatok.setBounds(0, 0, 765, 459);
		l_fonKimnatneUdacaDostatok.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
		panel_UdacaDostatok.add(l_fonKimnatneUdacaDostatok);
		
		panel_KohannaScasta = new JPanel();
		tabbedPane_Prukmetu.addTab("Рослини, що приносять кохання та щастя", null, panel_KohannaScasta, null);
		panel_KohannaScasta.setLayout(null);
		
		textPane_TextScasta = new JTextPane();
		textPane_TextScasta.setText(s_Prukmetu2_1);
		textPane_TextScasta.setBounds(1, 1, 308, 336);
		panel_KohannaScasta.add(textPane_TextScasta);
		
		label_KartunkaScasta = new JLabel("");
		label_KartunkaScasta.setBounds(310, 0, 450, 338);
		panel_KohannaScasta.add(label_KartunkaScasta);
		
		rB_Prukmet2_1 = new JRadioButton("Товстянка");
		rB_Prukmet2_1.setSelected(true);
		rB_Prukmet2_1.setOpaque(false);
		rB_Prukmet2_1.setForeground(Color.WHITE);
		rB_Prukmet2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_1.setBounds(1, 345, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_1);
		rB_Prukmet2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_1);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_2 = new JRadioButton("«Бамбук щастя»");
		rB_Prukmet2_2.setOpaque(false);
		rB_Prukmet2_2.setForeground(Color.WHITE);
		rB_Prukmet2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_2.setBounds(1, 386, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_2);	
		rB_Prukmet2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_2);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_3 = new JRadioButton("Товстянка");
		rB_Prukmet2_3.setOpaque(false);
		rB_Prukmet2_3.setForeground(Color.WHITE);
		rB_Prukmet2_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_3.setBounds(153, 345, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_3);
		rB_Prukmet2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_3);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_4 = new JRadioButton("«Бамбук щастя»");
		rB_Prukmet2_4.setOpaque(false);
		rB_Prukmet2_4.setForeground(Color.WHITE);
		rB_Prukmet2_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_4.setBounds(153, 386, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_4);
		rB_Prukmet2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_4);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_7 = new JRadioButton("Товстянка");
		rB_Prukmet2_7.setOpaque(false);
		rB_Prukmet2_7.setForeground(Color.WHITE);
		rB_Prukmet2_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_7.setBounds(459, 345, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_7);
		rB_Prukmet2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_7);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_8 = new JRadioButton("«Бамбук щастя»");
		rB_Prukmet2_8.setOpaque(false);
		rB_Prukmet2_8.setForeground(Color.WHITE);
		rB_Prukmet2_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_8.setBounds(459, 386, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_8);
		rB_Prukmet2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_8);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_5 = new JRadioButton("Товстянка");
		rB_Prukmet2_5.setOpaque(false);
		rB_Prukmet2_5.setForeground(Color.WHITE);
		rB_Prukmet2_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_5.setBounds(306, 345, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_5);
		rB_Prukmet2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_5);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_6 = new JRadioButton("«Бамбук щастя»");
		rB_Prukmet2_6.setOpaque(false);
		rB_Prukmet2_6.setForeground(Color.WHITE);
		rB_Prukmet2_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_6.setBounds(306, 386, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_6);
		rB_Prukmet2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_6);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_9 = new JRadioButton("Товстянка");
		rB_Prukmet2_9.setOpaque(false);
		rB_Prukmet2_9.setForeground(Color.WHITE);
		rB_Prukmet2_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_9.setBounds(607, 345, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_9);
		rB_Prukmet2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_9);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		rB_Prukmet2_10 = new JRadioButton("«Бамбук щастя»");
		rB_Prukmet2_10.setOpaque(false);
		rB_Prukmet2_10.setForeground(Color.WHITE);
		rB_Prukmet2_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rB_Prukmet2_10.setBounds(607, 386, 153, 25);
		panel_KohannaScasta.add(rB_Prukmet2_10);
		rB_Prukmet2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_TextScasta.setText(s_Prukmetu2_10);
//				l_Kartunka.setIcon(new ImageIcon("res/Prukmetu1.jpg"));
			}
		});
		
		group_Prukmetu2 = new ButtonGroup();
		group_Prukmetu2.add(rB_Prukmet2_1);
		group_Prukmetu2.add(rB_Prukmet2_2);
		group_Prukmetu2.add(rB_Prukmet2_3);
		group_Prukmetu2.add(rB_Prukmet2_4);
		group_Prukmetu2.add(rB_Prukmet2_5);
		group_Prukmetu2.add(rB_Prukmet2_6);
		group_Prukmetu2.add(rB_Prukmet2_7);
		group_Prukmetu2.add(rB_Prukmet2_8);
		group_Prukmetu2.add(rB_Prukmet2_9);
		group_Prukmetu2.add(rB_Prukmet2_10);
		
		l_fonKimnatneUdacaDostatok = new JLabel();
		l_fonKimnatneUdacaDostatok.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
		l_fonKimnatneUdacaDostatok.setBounds(0, 0, 765, 459);
		panel_KohannaScasta.add(l_fonKimnatneUdacaDostatok);

		panel_Hkidnuku = new Panel();
		tabbedPane.addTab("Шкідники", null, panel_Hkidnuku, null);

		panel_Hvorobu = new Panel();
		tabbedPane.addTab("Хвороби", null, panel_Hvorobu, null);

		panel_Rozmnogenna = new Panel();
		tabbedPane.addTab("Розмноження", null, panel_Rozmnogenna, null);

		if (i_putanna3 == 1) {
			panel_Kupivla = new Panel();
			tabbedPane.addTab("Купівля", null, panel_Kupivla, null);
			panel_Kupivla.setLayout(null);

			l_Galsad = new JLabel("Galsad");
			l_Galsad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://galsad.com.ua/goods.php/kimnatni/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Galsad.setHorizontalAlignment(SwingConstants.CENTER);
			l_Galsad.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Galsad.setForeground(Color.MAGENTA);
			l_Galsad.setBounds(41, 48, 193, 57);
			panel_Kupivla.add(l_Galsad);

			l_Galsad_logo = new JLabel("");
			l_Galsad_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://galsad.com.ua/goods.php/kimnatni/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Galsad_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_Galsad_logo.setBounds(421, 0, 226, 105);
			l_Galsad_logo.setIcon(new ImageIcon("res/KupivlaKartunka1.png"));
			panel_Kupivla.add(l_Galsad_logo);

			l_Florium = new JLabel("Florium");
			l_Florium.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("https://florium.ua/ua/room-bulbs/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Florium.setHorizontalAlignment(SwingConstants.CENTER);
			l_Florium.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Florium.setForeground(Color.MAGENTA);
			l_Florium.setBounds(41, 127, 193, 57);
			panel_Kupivla.add(l_Florium);

			l_2_logo = new JLabel("");
			l_2_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("https://florium.ua/ua/room-bulbs/"));
					} catch (Exception e1) {
					}
				}
			});
			l_2_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_2_logo.setBounds(421, 118, 226, 66);
			l_2_logo.setIcon(new ImageIcon("res/KupivlaKartunka2.jpg"));
			panel_Kupivla.add(l_2_logo);

			l_Landscape = new JLabel("Landscape");
			l_Landscape.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://landscape.ua/ua/komnatnye-rasteniya"));
					} catch (Exception e1) {
					}
				}
			});
			l_Landscape.setHorizontalAlignment(SwingConstants.CENTER);
			l_Landscape.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Landscape.setForeground(Color.MAGENTA);
			l_Landscape.setBounds(41, 283, 193, 57);
			panel_Kupivla.add(l_Landscape);

			l_4_logo = new JLabel("");
			l_4_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://landscape.ua/ua/komnatnye-rasteniya"));
					} catch (Exception e1) {
					}
				}
			});
			l_4_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_4_logo.setBounds(421, 283, 226, 57);
			l_4_logo.setIcon(new ImageIcon("res/KupivlaKartunka4.png"));
			panel_Kupivla.add(l_4_logo);

			l_Greensad = new JLabel("Greensad");
			l_Greensad.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://greensad.ua/ua/category/domashnie-rastenija-i-cvety/"));
					} catch (Exception e1) {
					}
				}
			});
			l_Greensad.setHorizontalAlignment(SwingConstants.CENTER);
			l_Greensad.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Greensad.setForeground(Color.MAGENTA);
			l_Greensad.setBounds(41, 353, 193, 57);
			panel_Kupivla.add(l_Greensad);

			l_3_logo = new JLabel("");
			l_3_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI("http://greensad.ua/ua/category/domashnie-rastenija-i-cvety/"));
					} catch (Exception e1) {
					}
				}
			});
			l_3_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_3_logo.setBounds(421, 366, 226, 57);
			l_3_logo.setIcon(new ImageIcon("res/KupivlaKartunka3.png"));
			panel_Kupivla.add(l_3_logo);

			l_Bigl = new JLabel("Bigl");
			l_Bigl.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI(
								"https://bigl.ua/Rasteniya-gorshechnye?utm_campaign=%D0%9A%D0%B0%D1%82%D0%B5%D0%B3%D0%BE%D1%80%D0%B8%D0%B8%D0%A3%D0%BA%D1%80%D0%B0%D0%B8%D0%BD%D0%B0&utm_term=&gclid=COTBvPHe5dMCFVmLsgodjskKag"));
					} catch (Exception e1) {
					}
				}
			});
			l_Bigl.setHorizontalAlignment(SwingConstants.CENTER);
			l_Bigl.setFont(new Font("Segoe UI", Font.BOLD, 35));
			l_Bigl.setForeground(Color.MAGENTA);
			l_Bigl.setBounds(41, 208, 193, 57);
			panel_Kupivla.add(l_Bigl);

			l_5_logo = new JLabel("");
			l_5_logo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						desktop.browse(new URI(
								"https://bigl.ua/Rasteniya-gorshechnye?utm_campaign=%D0%9A%D0%B0%D1%82%D0%B5%D0%B3%D0%BE%D1%80%D0%B8%D0%B8%D0%A3%D0%BA%D1%80%D0%B0%D0%B8%D0%BD%D0%B0&utm_term=&gclid=COTBvPHe5dMCFVmLsgodjskKag"));
					} catch (Exception e1) {
					}
				}
			});
			l_5_logo.setHorizontalAlignment(SwingConstants.CENTER);
			l_5_logo.setBounds(421, 197, 226, 57);
			l_5_logo.setIcon(new ImageIcon("res/KupivlaKartunka5.png"));
			panel_Kupivla.add(l_5_logo);

			l_Komentar = new JLabel("Будь ласка, оберіть сервіс продажу кімнатних рослин");
			l_Komentar.setForeground(Color.WHITE);
			l_Komentar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			l_Komentar.setHorizontalAlignment(SwingConstants.CENTER);
			l_Komentar.setBounds(0, 433, 765, 26);
			panel_Kupivla.add(l_Komentar);

			l_fonKupivli = new JLabel("");
			l_fonKupivli.setBounds(0, 0, 765, 459);
			l_fonKupivli.setIcon(new ImageIcon("res/fon_KimnatneResultatKupivla.jpg"));
			panel_Kupivla.add(l_fonKupivli);
		}

		panel_Doglad = new Panel();
		tabbedPane.addTab("Догляд", null, panel_Doglad, null);

		l_fon = new JLabel("");
		l_fon.setBounds(0, 0, 794, 565);
		l_fon.setIcon(new ImageIcon("res/fon_KimnatneResultat.jpg"));
		getContentPane().add(l_fon);

		setVisible(true);

	}

	private void setText() {
		// TODO Auto-generated method stub

	}
}
