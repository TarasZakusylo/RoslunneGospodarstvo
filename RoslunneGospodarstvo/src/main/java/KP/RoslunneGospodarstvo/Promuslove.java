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

public class Promuslove extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna2;
	private JLabel l_putanna4;
	private JLabel l_putanna3;
	private JLabel l_putanna6;
	private JLabel l_putanna5;
	private JRadioButton radioB_putanna1_1;
	private JRadioButton radioB_putanna1_2;
	private JSlider slider_putanna3;
	private JLabel l_slider_putanna3_1;
	private JLabel l_slider_putanna3_2;
	private JLabel l_slider_putanna3_3;
	private JSlider slider_putanna4;
	private JLabel l_slider_putanna4_1;
	private JLabel l_slider_putanna4_2;
	private JLabel l_slider_putanna4_3;
	private JSlider slider_putanna5;
	private JLabel l_slider_putanna5_1;
	private JLabel l_slider_putanna5_2;
	private JLabel l_slider_putanna5_3;
	private JRadioButton radioB_putanna6_1;
	private ButtonGroup group_putanna2;
	private ButtonGroup group_putanna6;
	private ButtonGroup group_putanna1;
	private JRadioButton radioB_putanna6_2;

	private JButton b_Gotovo;

	SliderListener3 slider3 = new SliderListener3();
	SliderListener4 slider4 = new SliderListener4();
	SliderListener5 slider5 = new SliderListener5();

	private int i_slider_putanna3 = 50;
	private int i_slider_putanna4 = 50;
	private int i_slider_putanna5 = 50;

	private int i_putanna1;
	private int i_putanna2;
	private int i_putanna6;

	private JLabel l_fonVodaOputuvanna;

	public Promuslove(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		l_putanna2 = new JLabel("Чи знаходяться у Вас лічильники ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(28, 58, 727, 30);
		getContentPane().add(l_putanna2);

		l_putanna4 = new JLabel("Як часто Ви вживаєте заморожені продукти ?");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna4.setBounds(24, 234, 727, 30);
		getContentPane().add(l_putanna4);

		l_putanna3 = new JLabel("Як часто Ви приймаєте ванну ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setBounds(20, 135, 727, 30);
		getContentPane().add(l_putanna3);

		l_putanna6 = new JLabel("Маєте автомобіль ?");
		l_putanna6.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna6.setBounds(28, 431, 727, 30);
		getContentPane().add(l_putanna6);

		l_putanna5 = new JLabel("Чи використовуєте Ви посудомийну та / або пральну машину ?");
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna5.setBounds(28, 331, 727, 30);
		getContentPane().add(l_putanna5);

		radioB_putanna1_1 = new JRadioButton("Центральне");
		radioB_putanna1_1.setOpaque(false);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});
		radioB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_1.setBounds(90, 87, 322, 25);
		getContentPane().add(radioB_putanna1_1);

		radioB_putanna1_2 = new JRadioButton("Автономне");
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_2.setBounds(506, 87, 249, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		slider_putanna3 = new JSlider();
		slider_putanna3.setOpaque(false);
		slider_putanna3.setBounds(0, 157, 770, 26);
		getContentPane().add(slider_putanna3);

		l_slider_putanna3_1 = new JLabel("Раз на день");
		l_slider_putanna3_1.setForeground(Color.BLACK);
		l_slider_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_1.setBounds(0, 183, 115, 16);
		getContentPane().add(l_slider_putanna3_1);

		l_slider_putanna3_2 = new JLabel("Раз на тиждень");
		l_slider_putanna3_2.setForeground(Color.BLACK);
		l_slider_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_2.setBounds(316, 183, 143, 16);
		getContentPane().add(l_slider_putanna3_2);

		l_slider_putanna3_3 = new JLabel("Раз на 2 тижні і більше");
		l_slider_putanna3_3.setForeground(Color.BLACK);
		l_slider_putanna3_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_3.setBounds(579, 183, 195, 16);
		getContentPane().add(l_slider_putanna3_3);

		slider_putanna4 = new JSlider();
		slider_putanna4.setOpaque(false);
		slider_putanna4.setBounds(4, 261, 770, 26);
		getContentPane().add(slider_putanna4);

		l_slider_putanna4_1 = new JLabel("Раз на день");
		l_slider_putanna4_1.setForeground(Color.BLACK);
		l_slider_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_1.setBounds(4, 287, 115, 16);
		getContentPane().add(l_slider_putanna4_1);

		l_slider_putanna4_2 = new JLabel("Раз на тиждень");
		l_slider_putanna4_2.setForeground(Color.BLACK);
		l_slider_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_2.setBounds(320, 287, 143, 16);
		getContentPane().add(l_slider_putanna4_2);

		l_slider_putanna4_3 = new JLabel("Раз на 2 тижні і більше");
		l_slider_putanna4_3.setForeground(Color.BLACK);
		l_slider_putanna4_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_3.setBounds(583, 288, 195, 16);
		getContentPane().add(l_slider_putanna4_3);

		slider_putanna5 = new JSlider();
		slider_putanna5.setOpaque(false);
		slider_putanna5.setBounds(8, 360, 770, 26);
		getContentPane().add(slider_putanna5);

		l_slider_putanna5_1 = new JLabel("Раз на день");
		l_slider_putanna5_1.setForeground(Color.BLACK);
		l_slider_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_1.setBounds(8, 386, 115, 16);
		getContentPane().add(l_slider_putanna5_1);

		l_slider_putanna5_2 = new JLabel("Раз на тиждень");
		l_slider_putanna5_2.setForeground(Color.BLACK);
		l_slider_putanna5_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_2.setBounds(324, 386, 143, 16);
		getContentPane().add(l_slider_putanna5_2);

		l_slider_putanna5_3 = new JLabel("Раз на 2 тижні і більше");
		l_slider_putanna5_3.setForeground(Color.BLACK);
		l_slider_putanna5_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_3.setBounds(587, 387, 195, 16);
		getContentPane().add(l_slider_putanna5_3);

		radioB_putanna6_1 = new JRadioButton("Так, я маю авто");
		radioB_putanna6_1.setForeground(Color.BLACK);
		radioB_putanna6_1.setOpaque(false);
		radioB_putanna6_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna6_1.setBounds(90, 470, 322, 25);
		getContentPane().add(radioB_putanna6_1);
		radioB_putanna6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 1;
			}
		});

		radioB_putanna6_2 = new JRadioButton("Ні, не маю");
		radioB_putanna6_2.setForeground(Color.BLACK);
		radioB_putanna6_2.setOpaque(false);
		radioB_putanna6_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna6_2.setBounds(506, 470, 249, 25);
		getContentPane().add(radioB_putanna6_2);
		radioB_putanna6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna6 = 2;
			}
		});

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);

		group_putanna2 = new ButtonGroup();

		group_putanna6 = new ButtonGroup();
		group_putanna6.add(radioB_putanna6_1);
		group_putanna6.add(radioB_putanna6_2);

		b_Gotovo = new JButton("Готово");
		b_Gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.out.println("s_putanna1 " + i_putanna1);
//				System.out.println("s_putanna2 " + i_putanna2);
//				System.out.println("i_slider_putanna3 " + i_slider_putanna3);
//				System.out.println("i_slider_putanna4 " + i_slider_putanna4);
//				System.out.println("i_slider_putanna5 " + i_slider_putanna5);
//				System.out.println("s_putanna6 " + i_putanna6);
//				System.out.println("i_slider_putanna7 " + i_slider_putanna7);

				if (i_putanna1 == 0 || i_putanna2 == 0 || i_putanna6 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {
//					new VodaRezultatu("Водозбереження. Результат",i_putanna1, i_putanna2, i_slider_putanna3, i_slider_putanna4, i_slider_putanna5,
//							i_putanna6, i_slider_putanna7);
//					setVisible(false);
				}

			}
		});
		b_Gotovo.setBounds(528, 524, 266, 41);
		getContentPane().add(b_Gotovo);

		l_fonVodaOputuvanna = new JLabel("");
		l_fonVodaOputuvanna.setBounds(0,-1, 794, 565);
		l_fonVodaOputuvanna.setIcon(new ImageIcon("res/fon_VodaOputuvanna.jpg"));
		getContentPane().add(l_fonVodaOputuvanna);
		
		slider_putanna3.addChangeListener(slider3);
		slider_putanna4.addChangeListener(slider4);
		slider_putanna5.addChangeListener(slider5);

		setVisible(true);
	}

	class SliderListener3 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna3 = (JSlider) e.getSource();
			i_slider_putanna3 = (int) slider_putanna3.getValue();
		}
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
