package KP.RoslunneGospodarstvo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

public class Kimnatne extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna1;
	private JLabel l_putanna2;
	private JLabel l_putanna4;
	private JLabel l_putanna3;
	private JLabel l_putanna6;
	private JLabel l_putanna5;
	private JLabel l_putanna7;
	private JRadioButton radioB_putanna1_1;
	private JRadioButton radioB_putanna1_2;
	private JRadioButton radioB_putanna2_1;
	private JRadioButton radioB_putanna2_2;
	private JSlider slider_putanna4;
	private JLabel l_slider_putanna4_1;
	private JLabel l_slider_putanna4_2;
	private JSlider slider_putanna5;
	private JLabel l_slider_putanna5_1;
	private JLabel l_slider_putanna5_2;
	private JRadioButton radioB_putanna6_1;
	private ButtonGroup group_putanna2;
	private ButtonGroup group_putanna6;
	private ButtonGroup group_putanna1;
	private ButtonGroup group_putanna7;
	private ButtonGroup group_putanna8; 
	private ButtonGroup group_putanna3; 
	private JRadioButton radioB_putanna6_2;
	private JButton b_Dali;

	SliderListener4 slider4 = new SliderListener4();
	SliderListener5 slider5 = new SliderListener5();

	private int i_slider_putanna4 = 50;
	private int i_slider_putanna5 = 50;

	private int i_putanna1;
	private int i_putanna2;
	private int i_putanna3;
	private int i_putanna6;
	private int i_putanna7;
	private int i_putanna8;

	private JLabel l_fonVodaOputuvanna;
	private JLabel l_putanna8;
	private JRadioButton radioB_putanna7_1;
	private JRadioButton radioB_putanna7_2;
	private JRadioButton radioB_putanna8_1;
	private JRadioButton radioB_putanna8_2;
	private JRadioButton radioB_putanna3_1;
	private JRadioButton radioB_putanna3_2;
	private JLabel l_slider_putanna5_3;
	private JButton b_putanna2;

	public Kimnatne(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Рослинне господпрство");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		l_Hapka = new JLabel("Будь ласка, пройдіть, , опитування");
		l_Hapka.setForeground(Color.YELLOW);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		l_putanna1 = new JLabel("У Вас зимовий сад, оранжерея ?");
		l_putanna1.setForeground(Color.WHITE);
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setBounds(8, 47, 501, 30);
		getContentPane().add(l_putanna1);

		l_putanna2 = new JLabel("Вам цікавий бонсай чи суісекі ?");
		l_putanna2.setForeground(Color.WHITE);
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(8, 110, 501, 30);
		getContentPane().add(l_putanna2);

		l_putanna4 = new JLabel("Наскільки Ви забобонні ? Вас цікавлять прикмети ?");
		l_putanna4.setForeground(Color.WHITE);
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna4.setBounds(8, 234, 501, 30);
		getContentPane().add(l_putanna4);

		l_putanna3 = new JLabel("Вас цікавить купівля кімнатних рослин ?");
		l_putanna3.setForeground(Color.WHITE);
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setBounds(8, 174, 501, 30);
		getContentPane().add(l_putanna3);

		l_putanna6 = new JLabel("Ви цікавитесь шкідниками кімнатних рослин?");
		l_putanna6.setForeground(Color.WHITE);
		l_putanna6.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna6.setBounds(8, 363, 501, 30);
		getContentPane().add(l_putanna6);

		l_putanna5 = new JLabel("Як часто Ви доглядатимете за рослинами ?");
		l_putanna5.setForeground(Color.WHITE);
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna5.setBounds(12, 298, 501, 30);
		getContentPane().add(l_putanna5);

		l_putanna7 = new JLabel("Вас цікаві хвороби кімнатних рослин ?");
		l_putanna7.setForeground(Color.WHITE);
		l_putanna7.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna7.setBounds(8, 421, 501, 30);
		getContentPane().add(l_putanna7);

		radioB_putanna1_1 = new JRadioButton("Так");
		radioB_putanna1_1.setForeground(Color.WHITE);
		radioB_putanna1_1.setOpaque(false);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});
		radioB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_1.setBounds(561, 51, 83, 25);
		getContentPane().add(radioB_putanna1_1);

		radioB_putanna1_2 = new JRadioButton("Ні");
		radioB_putanna1_2.setForeground(Color.WHITE);
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_2.setBounds(672, 51, 83, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		radioB_putanna2_1 = new JRadioButton("Так");
		radioB_putanna2_1.setForeground(Color.WHITE);
		radioB_putanna2_1.setOpaque(false);
		radioB_putanna2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna2_1.setBounds(523, 115, 62, 25);
		getContentPane().add(radioB_putanna2_1);
		radioB_putanna2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 1;
			}
		});

		radioB_putanna2_2 = new JRadioButton("Ні");
		radioB_putanna2_2.setForeground(Color.WHITE);
		radioB_putanna2_2.setOpaque(false);
		radioB_putanna2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna2_2.setBounds(600, 114, 55, 25);
		getContentPane().add(radioB_putanna2_2);
		radioB_putanna2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 2;
			}
		});

		slider_putanna4 = new JSlider();
		slider_putanna4.setOpaque(false);
		slider_putanna4.setBounds(521, 234, 257, 30);
		getContentPane().add(slider_putanna4);

		l_slider_putanna4_1 = new JLabel("Зовсім");
		l_slider_putanna4_1.setForeground(Color.WHITE);
		l_slider_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_1.setBounds(521, 261, 115, 16);
		getContentPane().add(l_slider_putanna4_1);

		l_slider_putanna4_2 = new JLabel("Неймовірно");
		l_slider_putanna4_2.setForeground(Color.WHITE);
		l_slider_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_2.setBounds(693, 261, 101, 16);
		getContentPane().add(l_slider_putanna4_2);

		slider_putanna5 = new JSlider();
		slider_putanna5.setOpaque(false);
		slider_putanna5.setBounds(521, 298, 257, 26);
		getContentPane().add(slider_putanna5);

		l_slider_putanna5_1 = new JLabel("Раз на день");
		l_slider_putanna5_1.setForeground(Color.WHITE);
		l_slider_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_1.setBounds(525, 326, 94, 16);
		getContentPane().add(l_slider_putanna5_1);

		l_slider_putanna5_2 = new JLabel("Раз на 2 тижні");
		l_slider_putanna5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna5_2.setForeground(Color.WHITE);
		l_slider_putanna5_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_2.setBounds(653, 326, 133, 16);
		getContentPane().add(l_slider_putanna5_2);

		radioB_putanna6_1 = new JRadioButton("Так");
		radioB_putanna6_1.setForeground(Color.WHITE);
		radioB_putanna6_1.setOpaque(false);
		radioB_putanna6_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna6_1.setBounds(561, 368, 62, 25);
		getContentPane().add(radioB_putanna6_1);
		radioB_putanna6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 1;
			}
		});

		radioB_putanna6_2 = new JRadioButton("Ні");
		radioB_putanna6_2.setForeground(Color.WHITE);
		radioB_putanna6_2.setOpaque(false);
		radioB_putanna6_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna6_2.setBounds(660, 368, 55, 25);
		getContentPane().add(radioB_putanna6_2);
		radioB_putanna6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 2;
			}
		});

		b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("i_putanna1 " + i_putanna1);
//				System.out.println("i_putanna2 " + i_putanna2);
//				System.out.println("i_putanna3 " + i_putanna3);
//				System.out.println("i_slider_putanna4 " + i_slider_putanna4);
//				System.out.println("i_slider_putanna5 " + i_slider_putanna5);
//				System.out.println("i_putanna6 " + i_putanna6);
//				System.out.println("i_putanna7 " + i_putanna7);
//				System.out.println("i_putanna8 " + i_putanna8);

				if (i_putanna1 == 0 || i_putanna2 == 0 || i_putanna6 == 0 || i_putanna3 == 0 || i_putanna7 == 0 || i_putanna8 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {
					new Kimnatne1("Кімнатне рослинництво",i_putanna1, i_putanna2, i_putanna3, i_slider_putanna4, i_slider_putanna5,
							i_putanna6, i_putanna7, i_putanna8);
					setVisible(false);
				}

			}
		});
		b_Dali.setBounds(89, 524, 606, 41);
		getContentPane().add(b_Dali);

		b_putanna2 = new JButton("Що це ?");
		b_putanna2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, 
						"Бонсай — мистецтво вирощування карликових дерев у невеликих ємкостях.\n\n"
					  + "Суісекі — створення мініатюрних ландшафтів на таці. Це той же бонсай,\n"
					  + "але з декількома рослтнами і додатками каміння вишуканої форми,\n"
					  + "піску, іноді знову ж таки мініатюрної скульптури.");
			}
		});
		b_putanna2.setBounds(681, 115, 83, 25);
		getContentPane().add(b_putanna2);
		
		radioB_putanna3_1 = new JRadioButton("Так");
		radioB_putanna3_1.setForeground(Color.WHITE);
		radioB_putanna3_1.setOpaque(false);
		radioB_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna3_1.setBounds(561, 179, 83, 25);
		getContentPane().add(radioB_putanna3_1);
		radioB_putanna3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 1;
			}
		});
		
		radioB_putanna3_2 = new JRadioButton("Ні");
		radioB_putanna3_2.setForeground(Color.WHITE);
		radioB_putanna3_2.setOpaque(false);
		radioB_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna3_2.setBounds(672, 179, 83, 25);
		getContentPane().add(radioB_putanna3_2);
		radioB_putanna3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 2;
			}
		});
		
		l_slider_putanna5_3 = new JLabel("і більше");
		l_slider_putanna5_3.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna5_3.setForeground(Color.WHITE);
		l_slider_putanna5_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_3.setBounds(653, 346, 134, 16);
		getContentPane().add(l_slider_putanna5_3);
		
		l_putanna8 = new JLabel("Вас цікаве розмноження кімнатних рослин ?");
		l_putanna8.setForeground(Color.WHITE);
		l_putanna8.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna8.setBounds(8, 472, 501, 30);
		getContentPane().add(l_putanna8);
		
		radioB_putanna7_1 = new JRadioButton("Так");
		radioB_putanna7_1.setOpaque(false);
		radioB_putanna7_1.setForeground(Color.WHITE);
		radioB_putanna7_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna7_1.setBounds(561, 421, 62, 25);
		getContentPane().add(radioB_putanna7_1);
		radioB_putanna7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna7 = 1;
			}
		});
		
		radioB_putanna7_2 = new JRadioButton("Ні");
		radioB_putanna7_2.setOpaque(false);
		radioB_putanna7_2.setForeground(Color.WHITE);
		radioB_putanna7_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna7_2.setBounds(660, 421, 55, 25);
		getContentPane().add(radioB_putanna7_2);
		radioB_putanna7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna7 = 2;
			}
		});
		
		radioB_putanna8_1 = new JRadioButton("Так");
		radioB_putanna8_1.setOpaque(false);
		radioB_putanna8_1.setForeground(Color.WHITE);
		radioB_putanna8_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna8_1.setBounds(561, 477, 62, 25);
		getContentPane().add(radioB_putanna8_1);
		radioB_putanna8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna8 = 1;
			}
		});
		
		radioB_putanna8_2 = new JRadioButton("Ні");
		radioB_putanna8_2.setOpaque(false);
		radioB_putanna8_2.setForeground(Color.WHITE);
		radioB_putanna8_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna8_2.setBounds(660, 477, 55, 25);
		getContentPane().add(radioB_putanna8_2);
		radioB_putanna8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna8 = 2;
			}
		});
		
		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);

		group_putanna2 = new ButtonGroup();
		group_putanna2.add(radioB_putanna2_1);
		group_putanna2.add(radioB_putanna2_2);

		group_putanna6 = new ButtonGroup();
		group_putanna6.add(radioB_putanna6_1);
		group_putanna6.add(radioB_putanna6_2);
		
		group_putanna7 = new ButtonGroup();
		group_putanna7.add(radioB_putanna7_1);
		group_putanna7.add(radioB_putanna7_2);

		group_putanna8 = new ButtonGroup();
		group_putanna8.add(radioB_putanna8_1);
		group_putanna8.add(radioB_putanna8_2); 
		
		group_putanna3 = new ButtonGroup();
		group_putanna3.add(radioB_putanna3_1);
		group_putanna3.add(radioB_putanna3_2); 
		
		slider_putanna4.addChangeListener(slider4);
		slider_putanna5.addChangeListener(slider5);


		l_fonVodaOputuvanna = new JLabel("");
		l_fonVodaOputuvanna.setBounds(0, 0, 794, 565);
		l_fonVodaOputuvanna.setIcon(new ImageIcon("res/fon_Kimnatne.jpg"));
		getContentPane().add(l_fonVodaOputuvanna);
		
		
		setVisible(true);
	}

	class SliderListener4 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna4 = (JSlider) e.getSource();
			i_slider_putanna4 = (int) slider_putanna4.getValue();
		}
	}

	class SliderListener5 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna5 = (JSlider) e.getSource();
			i_slider_putanna5 = (int) slider_putanna5.getValue();
		}
	}

}

