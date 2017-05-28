package KP.RoslunneGospodarstvo;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
public class Promuslove extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna1;
	private JLabel l_putanna3;
	private JLabel l_putanna2;
	private JLabel l_putanna5;
	private JLabel l_putanna4;
	private JSlider slider_putanna2;
	private JLabel l_slider_putanna2_1;
	private JLabel l_slider_putanna2_2;
	private JSlider slider_putanna3;
	private JSlider slider_putanna4;
	private JLabel l_slider_putanna4_1;
	private JLabel l_slider_putanna4_2;
	private JRadioButton radioB_putanna5_1;
	private ButtonGroup group_putanna5;
	private JRadioButton radioB_putanna5_2;

	private JButton b_Dali;

	SliderListener2 slider2 = new SliderListener2();
	SliderListener3 slider3 = new SliderListener3();
	SliderListener4 slider4 = new SliderListener4();

	private int i_slider_putanna2 = 50;
	private int i_slider_putanna3 = 50;
	private int i_slider_putanna4 = 50;

	private int i_putanna5;

	private JLabel l_fonVodaOputuvanna;
	private Choice choice_putanna1;
	private JLabel l_slider_putanna3_1;
	private JLabel l_slider_putanna3_2;

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
				new Menu("Рослинне господарство");
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

		l_putanna1 = new JLabel("Вкажіть галузь :");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setBounds(29, 75, 363, 30);
		getContentPane().add(l_putanna1);

		l_putanna3 = new JLabel("Вкажіть кількість працівників, що Ви плануєте використовувати :");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setBounds(24, 234, 727, 30);
		getContentPane().add(l_putanna3);

		l_putanna2 = new JLabel("Вкажіть Ваші фінансові можливості :");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(20, 135, 727, 30);
		getContentPane().add(l_putanna2);

		l_putanna5 = new JLabel("Чи є у Вас склади для зберігання продукції ?");
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna5.setBounds(28, 431, 727, 30);
		getContentPane().add(l_putanna5);

		l_putanna4 = new JLabel("Вкажіть кількість техніки, шо ви плануєте використовувати :");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna4.setBounds(28, 331, 727, 30);
		getContentPane().add(l_putanna4);

		// l_fonVodaOputuvanna = new JLabel("");
		// l_fonVodaOputuvanna.setBounds(0,-1, 794, 565);
		// l_fonVodaOputuvanna.setIcon(new
		// ImageIcon("res/fon_VodaOputuvanna.jpg"));
		// getContentPane().add(l_fonVodaOputuvanna);

		choice_putanna1 = new Choice();
		choice_putanna1.setBounds(465, 83, 249, 22);
		getContentPane().add(choice_putanna1);
		choice_putanna1.add("Зернові культури");
		choice_putanna1.add("Зернобобові культури");
		choice_putanna1.add("Кормові культури");
		choice_putanna1.add("Технічні культури");
		choice_putanna1.add("Овоче-баштанні культури");
		choice_putanna1.add("Цитрусові культури");
		choice_putanna1.add("Тонізуючі та наркотичні культури");
		choice_putanna1.add("Олійні і ефіроолійні культури");
		choice_putanna1.add("Виноградарство");
		choice_putanna1.add("Садівництво");
		choice_putanna1.add("Грибництво");

		slider_putanna2 = new JSlider();
		slider_putanna2.setOpaque(false);
		slider_putanna2.setBounds(0, 157, 770, 26);
		getContentPane().add(slider_putanna2);

		l_slider_putanna2_1 = new JLabel("< 10 000 $");
		l_slider_putanna2_1.setForeground(Color.BLACK);
		l_slider_putanna2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna2_1.setBounds(12, 184, 115, 16);
		getContentPane().add(l_slider_putanna2_1);

		l_slider_putanna2_2 = new JLabel("1 000 000 $ <");
		l_slider_putanna2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna2_2.setForeground(Color.BLACK);
		l_slider_putanna2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna2_2.setBounds(579, 183, 195, 16);
		getContentPane().add(l_slider_putanna2_2);

		slider_putanna3 = new JSlider();
		slider_putanna3.setOpaque(false);
		slider_putanna3.setBounds(4, 261, 770, 26);
		getContentPane().add(slider_putanna3);

		slider_putanna4 = new JSlider();
		slider_putanna4.setOpaque(false);
		slider_putanna4.setBounds(8, 360, 770, 26);
		getContentPane().add(slider_putanna4);

		l_slider_putanna4_1 = new JLabel("0");
		l_slider_putanna4_1.setForeground(Color.BLACK);
		l_slider_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_1.setBounds(38, 386, 115, 16);
		getContentPane().add(l_slider_putanna4_1);

		l_slider_putanna4_2 = new JLabel("100");
		l_slider_putanna4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna4_2.setForeground(Color.BLACK);
		l_slider_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_2.setBounds(550, 386, 195, 16);
		getContentPane().add(l_slider_putanna4_2);

		radioB_putanna5_1 = new JRadioButton("Так, Є");
		radioB_putanna5_1.setForeground(Color.BLACK);
		radioB_putanna5_1.setOpaque(false);
		radioB_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna5_1.setBounds(90, 470, 322, 25);
		getContentPane().add(radioB_putanna5_1);
		radioB_putanna5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 1;
			}
		});

		radioB_putanna5_2 = new JRadioButton("Ні, не має");
		radioB_putanna5_2.setForeground(Color.BLACK);
		radioB_putanna5_2.setOpaque(false);
		radioB_putanna5_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna5_2.setBounds(506, 470, 249, 25);
		getContentPane().add(radioB_putanna5_2);
		radioB_putanna5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 2;
			}
		});

		group_putanna5 = new ButtonGroup();
		group_putanna5.add(radioB_putanna5_1);
		group_putanna5.add(radioB_putanna5_2);

		b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s_putanna1 = choice_putanna1.getSelectedItem();

				System.out.println("s_putanna1 " + s_putanna1);
				System.out.println("i_slider_putanna2 " + i_slider_putanna2);
				System.out.println("i_slider_putanna3 " + i_slider_putanna3);
				System.out.println("i_slider_putanna4 " + i_slider_putanna4);
				System.out.println("s_putanna5 " + i_putanna5);

				if (i_putanna5 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {
					new PromusloveMap("Карта. Промислове рослинне господарство", s_putanna1, i_slider_putanna2,
							i_slider_putanna3, i_slider_putanna4, i_putanna5);
					setVisible(false);
				}

			} 
		});
		b_Dali.setBounds(90, 523, 610, 41);
		getContentPane().add(b_Dali);

		l_slider_putanna3_1 = new JLabel("< 10 чол.");
		l_slider_putanna3_1.setForeground(Color.BLACK);
		l_slider_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_1.setBounds(10, 290, 115, 16);
		getContentPane().add(l_slider_putanna3_1);

		l_slider_putanna3_2 = new JLabel("10 000 чол. <");
		l_slider_putanna3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna3_2.setForeground(Color.BLACK);
		l_slider_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_2.setBounds(659, 290, 115, 16);
		getContentPane().add(l_slider_putanna3_2);

		slider_putanna2.addChangeListener(slider2);
		slider_putanna3.addChangeListener(slider3);
		slider_putanna4.addChangeListener(slider4);

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

	class SliderListener2 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna2 = (JSlider) e.getSource();
			i_slider_putanna2 = (int) slider_putanna2.getValue();
		}
	}
}
