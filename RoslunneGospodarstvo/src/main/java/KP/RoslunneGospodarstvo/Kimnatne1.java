package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Kimnatne1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JButton b_Dali;
	private JLabel l_fonVodaOputuvanna;

	private JLabel label_1;
	private JLabel label_4;
	private JLabel label_2;
	private JLabel label_3;
	private JCheckBox checkBox1_0;
	private JCheckBox checkBox1_1;
	private JCheckBox checkBox1_3;
	private JCheckBox checkBox1_2;
	private JCheckBox checkBox1_7;
	private JCheckBox checkBox1_6;
	private JCheckBox checkBox1_5;
	private JCheckBox checkBox1_4;
	private JCheckBox checkBox1_8;
	private JCheckBox checkBox1_9;
	private JCheckBox checkBox1_10;
	private JCheckBox checkBox1_11;
	private JCheckBox checkBox4_10;
	private JCheckBox checkBox4_9;
	private JCheckBox checkBox4_8;
	private JCheckBox checkBox4_7;
	private JCheckBox checkBox4_6;
	private JCheckBox checkBox4_5;
	private JCheckBox checkBox4_4;
	private JCheckBox checkBox4_3;
	private JCheckBox checkBox4_2;
	private JCheckBox checkBox4_1;
	private JCheckBox checkBox4_0;
	private JCheckBox checkBox2_5;
	private JCheckBox checkBox2_4;
	private JCheckBox checkBox2_3;
	private JCheckBox checkBox2_2;
	private JCheckBox checkBox2_1;
	private JCheckBox checkBox2_0;
	private JCheckBox checkBox3_5;
	private JCheckBox checkBox3_4;
	private JCheckBox checkBox3_3;
	private JCheckBox checkBox3_2;
	private JCheckBox checkBox3_1;
	private JCheckBox checkBox3_0;

	public Kimnatne1(String s, final int i_putanna1, final int i_putanna2, final int i_putanna3,
			final int i_slider_putanna4, final int i_slider_putanna5, final int i_putanna6, final int i_putanna7,
			final int i_putanna8) {
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

		l_Hapka = new JLabel("Виберіть рослини, що Вам до вподоби");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		b_Dali = new JButton("Далі");
		b_Dali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// String s_putanna1 = choice_putanna1.getSelectedItem();
				//
				// System.out.println("s_putanna1 " + s_putanna1);
				// System.out.println("i_slider_putanna2 " + i_slider_putanna2);
				// System.out.println("i_slider_putanna3 " + i_slider_putanna3);
				// System.out.println("i_slider_putanna4 " + i_slider_putanna4);
				// System.out.println("s_putanna5 " + i_putanna5);

				int i_checkBox1_0 = 0;
				int i_checkBox1_1 = 0;
				int i_checkBox1_2 = 0;
				int i_checkBox1_3 = 0;
				int i_checkBox1_4 = 0;
				int i_checkBox1_5 = 0;
				int i_checkBox1_6 = 0;
				int i_checkBox1_7 = 0;
				int i_checkBox1_8 = 0;
				int i_checkBox1_9 = 0;
				int i_checkBox1_10 = 0;
				int i_checkBox1_11 = 0;

				if (checkBox1_0.isSelected() == true) {
					i_checkBox1_0 = 1;
				}
				if (checkBox1_1.isSelected() == true) {
					i_checkBox1_1 = 1;
				}
				if (checkBox1_2.isSelected() == true) {
					i_checkBox1_2 = 1;
				}
				if (checkBox1_3.isSelected() == true) {
					i_checkBox1_3 = 1;
				}
				if (checkBox1_4.isSelected() == true) {
					i_checkBox1_4 = 1;
				}
				if (checkBox1_5.isSelected() == true) {
					i_checkBox1_5 = 1;
				}
				if (checkBox1_6.isSelected() == true) {
					i_checkBox1_6 = 1;
				}
				if (checkBox1_7.isSelected() == true) {
					i_checkBox1_7 = 1;
				}
				if (checkBox1_8.isSelected() == true) {
					i_checkBox1_8 = 1;
				}
				if (checkBox1_9.isSelected() == true) {
					i_checkBox1_9 = 1;
				}
				if (checkBox1_10.isSelected() == true) {
					i_checkBox1_10 = 1;
				}
				if (checkBox1_11.isSelected() == true) {
					i_checkBox1_11 = 1;
				}

				int i_checkBox2_0 = 0;
				int i_checkBox2_1 = 0;
				int i_checkBox2_2 = 0;
				int i_checkBox2_3 = 0;
				int i_checkBox2_4 = 0;
				int i_checkBox2_5 = 0;

				if (checkBox2_0.isSelected() == true) {
					i_checkBox2_0 = 1;
				}
				if (checkBox2_1.isSelected() == true) {
					i_checkBox2_1 = 1;
				}
				if (checkBox2_2.isSelected() == true) {
					i_checkBox2_2 = 1;
				}
				if (checkBox2_3.isSelected() == true) {
					i_checkBox2_3 = 1;
				}
				if (checkBox2_4.isSelected() == true) {
					i_checkBox2_4 = 1;
				}
				if (checkBox2_5.isSelected() == true) {
					i_checkBox2_5 = 1;
				}

				int i_checkBox3_0 = 0;
				int i_checkBox3_1 = 0;
				int i_checkBox3_2 = 0;
				int i_checkBox3_3 = 0;
				int i_checkBox3_4 = 0;
				int i_checkBox3_5 = 0;

				if (checkBox3_0.isSelected() == true) {
					i_checkBox3_0 = 1;
				}
				if (checkBox3_1.isSelected() == true) {
					i_checkBox3_1 = 1;
				}
				if (checkBox3_2.isSelected() == true) {
					i_checkBox3_2 = 1;
				}
				if (checkBox3_3.isSelected() == true) {
					i_checkBox3_3 = 1;
				}
				if (checkBox3_4.isSelected() == true) {
					i_checkBox3_4 = 1;
				}
				if (checkBox3_5.isSelected() == true) {
					i_checkBox3_5 = 1;
				}

				int i_checkBox4_0 = 0;
				int i_checkBox4_1 = 0;
				int i_checkBox4_2 = 0;
				int i_checkBox4_3 = 0;
				int i_checkBox4_4 = 0;
				int i_checkBox4_5 = 0;
				int i_checkBox4_6 = 0;
				int i_checkBox4_7 = 0;
				int i_checkBox4_8 = 0;
				int i_checkBox4_9 = 0;
				int i_checkBox4_10 = 0;

				if (checkBox4_0.isSelected() == true) {
					i_checkBox4_0 = 1;
				}
				if (checkBox4_1.isSelected() == true) {
					i_checkBox4_1 = 1;
				}
				if (checkBox4_2.isSelected() == true) {
					i_checkBox4_2 = 1;
				}
				if (checkBox4_3.isSelected() == true) {
					i_checkBox4_3 = 1;
				}
				if (checkBox4_4.isSelected() == true) {
					i_checkBox4_4 = 1;
				}
				if (checkBox4_5.isSelected() == true) {
					i_checkBox4_5 = 1;
				}
				if (checkBox4_6.isSelected() == true) {
					i_checkBox4_6 = 1;
				}
				if (checkBox4_7.isSelected() == true) {
					i_checkBox4_7 = 1;
				}
				if (checkBox4_8.isSelected() == true) {
					i_checkBox4_8 = 1;
				}
				if (checkBox4_9.isSelected() == true) {
					i_checkBox4_9 = 1;
				}
				if (checkBox4_10.isSelected() == true) {
					i_checkBox4_10 = 1;
				}

				// System.out.println( i_checkBox1_0 );
				// System.out.println( i_checkBox1_1 );
				// System.out.println( i_checkBox1_2 );
				// System.out.println( i_checkBox1_3 );
				// System.out.println( i_checkBox1_4 );
				// System.out.println( i_checkBox1_5 );
				// System.out.println( i_checkBox1_6 );
				// System.out.println( i_checkBox1_7 );
				// System.out.println( i_checkBox1_8 );
				// System.out.println( i_checkBox1_9 );
				// System.out.println( i_checkBox1_10 );
				// System.out.println( i_checkBox1_11 );
				//
				// System.out.println( i_checkBox2_0 );
				// System.out.println( i_checkBox2_1 );
				// System.out.println( i_checkBox2_2 );
				// System.out.println( i_checkBox2_3 );
				// System.out.println( i_checkBox2_4 );
				// System.out.println( i_checkBox2_5 );
				//
				// System.out.println( i_checkBox3_0 );
				// System.out.println( i_checkBox3_1 );
				// System.out.println( i_checkBox3_2 );
				// System.out.println( i_checkBox3_3 );
				// System.out.println( i_checkBox3_4 );
				// System.out.println( i_checkBox3_5 );
				//
				// System.out.println( i_checkBox4_0 );
				// System.out.println( i_checkBox4_1 );
				// System.out.println( i_checkBox4_2 );
				// System.out.println( i_checkBox4_3 );
				// System.out.println( i_checkBox4_4 );
				// System.out.println( i_checkBox4_5 );
				// System.out.println( i_checkBox4_6 );
				// System.out.println( i_checkBox4_7 );
				// System.out.println( i_checkBox4_8 );
				// System.out.println( i_checkBox4_9 );
				// System.out.println( i_checkBox4_10 );
				// System.out.println();

				new KimnatneResultatu("Кімнатне рослинництво. Результат", i_putanna1, i_putanna2, i_putanna3,
						i_slider_putanna4, i_slider_putanna5, i_putanna6, i_putanna7, i_putanna8, i_checkBox1_0,
						i_checkBox1_1, i_checkBox1_2, i_checkBox1_3, i_checkBox1_4, i_checkBox1_5, i_checkBox1_6,
						i_checkBox1_7, i_checkBox1_8, i_checkBox1_9, i_checkBox1_10, i_checkBox1_11, i_checkBox2_0,
						i_checkBox2_1, i_checkBox2_2, i_checkBox2_3, i_checkBox2_4, i_checkBox2_5, i_checkBox3_0,
						i_checkBox3_1, i_checkBox3_2, i_checkBox3_3, i_checkBox3_4, i_checkBox3_5, i_checkBox4_0,
						i_checkBox4_1, i_checkBox4_2, i_checkBox4_3, i_checkBox4_4, i_checkBox4_5, i_checkBox4_6,
						i_checkBox4_7, i_checkBox4_8, i_checkBox4_9, i_checkBox4_10);
				setVisible(false);

			}
		});
		b_Dali.setBounds(90, 523, 610, 41);
		getContentPane().add(b_Dali);

		label_1 = new JLabel("Декоративно-квітучі");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(-6, 47, 200, 30);
		getContentPane().add(label_1);

		label_4 = new JLabel("Декоративно-листяні");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_4.setBounds(594, 47, 200, 30);
		getContentPane().add(label_4);

		label_2 = new JLabel("Сукуленти :");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(194, 47, 200, 30);
		getContentPane().add(label_2);

		label_3 = new JLabel("Плодові :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_3.setBounds(386, 47, 200, 30);
		getContentPane().add(label_3);

		checkBox1_0 = new JCheckBox("Гіацинт");
		checkBox1_0.setOpaque(false);
		checkBox1_0.setBounds(0, 96, 160, 25);
		getContentPane().add(checkBox1_0);

		checkBox1_1 = new JCheckBox("Крокус");
		checkBox1_1.setOpaque(false);
		checkBox1_1.setBounds(0, 134, 160, 25);
		getContentPane().add(checkBox1_1);

		checkBox1_3 = new JCheckBox("Хризантеми");
		checkBox1_3.setOpaque(false);
		checkBox1_3.setBounds(0, 204, 160, 25);
		getContentPane().add(checkBox1_3);

		checkBox1_2 = new JCheckBox("Примула");
		checkBox1_2.setOpaque(false);
		checkBox1_2.setBounds(0, 169, 160, 25);
		getContentPane().add(checkBox1_2);

		checkBox1_7 = new JCheckBox("Герань");
		checkBox1_7.setOpaque(false);
		checkBox1_7.setBounds(0, 344, 160, 25);
		getContentPane().add(checkBox1_7);

		checkBox1_6 = new JCheckBox("Сенполія (фіалка)");
		checkBox1_6.setOpaque(false);
		checkBox1_6.setBounds(0, 308, 160, 25);
		getContentPane().add(checkBox1_6);

		checkBox1_5 = new JCheckBox("Гіппеаструм");
		checkBox1_5.setOpaque(false);
		checkBox1_5.setBounds(0, 274, 160, 25);
		getContentPane().add(checkBox1_5);

		checkBox1_4 = new JCheckBox("Антуріум");
		checkBox1_4.setOpaque(false);
		checkBox1_4.setBounds(0, 238, 160, 25);
		getContentPane().add(checkBox1_4);

		checkBox1_8 = new JCheckBox("Орхідея");
		checkBox1_8.setOpaque(false);
		checkBox1_8.setBounds(0, 380, 160, 25);
		getContentPane().add(checkBox1_8);

		checkBox1_9 = new JCheckBox("Клівія");
		checkBox1_9.setOpaque(false);
		checkBox1_9.setBounds(0, 417, 160, 25);
		getContentPane().add(checkBox1_9);

		checkBox1_10 = new JCheckBox("Бальзамін");
		checkBox1_10.setOpaque(false);
		checkBox1_10.setBounds(0, 450, 160, 25);
		getContentPane().add(checkBox1_10);

		checkBox1_11 = new JCheckBox("Азалія");
		checkBox1_11.setOpaque(false);
		checkBox1_11.setBounds(0, 486, 160, 25);
		getContentPane().add(checkBox1_11);

		checkBox4_10 = new JCheckBox("Фікус");
		checkBox4_10.setOpaque(false);
		checkBox4_10.setBounds(626, 450, 160, 25);
		getContentPane().add(checkBox4_10);

		checkBox4_9 = new JCheckBox("Монстера");
		checkBox4_9.setOpaque(false);
		checkBox4_9.setBounds(626, 417, 160, 25);
		getContentPane().add(checkBox4_9);

		checkBox4_8 = new JCheckBox("Юкка");
		checkBox4_8.setOpaque(false);
		checkBox4_8.setBounds(626, 380, 160, 25);
		getContentPane().add(checkBox4_8);

		checkBox4_7 = new JCheckBox("Драцена");
		checkBox4_7.setOpaque(false);
		checkBox4_7.setBounds(626, 344, 160, 25);
		getContentPane().add(checkBox4_7);

		checkBox4_6 = new JCheckBox("Диффенбахія");
		checkBox4_6.setOpaque(false);
		checkBox4_6.setBounds(626, 308, 160, 25);
		getContentPane().add(checkBox4_6);

		checkBox4_5 = new JCheckBox("Гіппеаструм");
		checkBox4_5.setOpaque(false);
		checkBox4_5.setBounds(626, 274, 160, 25);
		getContentPane().add(checkBox4_5);

		checkBox4_4 = new JCheckBox("Папоротеві");
		checkBox4_4.setOpaque(false);
		checkBox4_4.setBounds(626, 238, 160, 25);
		getContentPane().add(checkBox4_4);

		checkBox4_3 = new JCheckBox("Бегонія Бауера");
		checkBox4_3.setOpaque(false);
		checkBox4_3.setBounds(626, 204, 160, 25);
		getContentPane().add(checkBox4_3);

		checkBox4_2 = new JCheckBox("Кротон");
		checkBox4_2.setOpaque(false);
		checkBox4_2.setBounds(626, 169, 160, 25);
		getContentPane().add(checkBox4_2);

		checkBox4_1 = new JCheckBox("Пуансетія");
		checkBox4_1.setOpaque(false);
		checkBox4_1.setBounds(626, 134, 160, 25);
		getContentPane().add(checkBox4_1);

		checkBox4_0 = new JCheckBox("Традесканція");
		checkBox4_0.setOpaque(false);
		checkBox4_0.setBounds(626, 96, 160, 25);
		getContentPane().add(checkBox4_0);

		checkBox2_5 = new JCheckBox("Молочай");
		checkBox2_5.setOpaque(false);
		checkBox2_5.setBounds(218, 274, 160, 25);
		getContentPane().add(checkBox2_5);

		checkBox2_4 = new JCheckBox("Сансевієрія");
		checkBox2_4.setOpaque(false);
		checkBox2_4.setBounds(218, 238, 160, 25);
		getContentPane().add(checkBox2_4);

		checkBox2_3 = new JCheckBox("Кактуси");
		checkBox2_3.setOpaque(false);
		checkBox2_3.setBounds(218, 204, 160, 25);
		getContentPane().add(checkBox2_3);

		checkBox2_2 = new JCheckBox("Каланхое");
		checkBox2_2.setOpaque(false);
		checkBox2_2.setBounds(218, 169, 160, 25);
		getContentPane().add(checkBox2_2);

		checkBox2_1 = new JCheckBox("Товстянка");
		checkBox2_1.setOpaque(false);
		checkBox2_1.setBounds(218, 134, 160, 25);
		getContentPane().add(checkBox2_1);

		checkBox2_0 = new JCheckBox("Алое");
		checkBox2_0.setOpaque(false);
		checkBox2_0.setBounds(218, 96, 160, 25);
		getContentPane().add(checkBox2_0);

		checkBox3_5 = new JCheckBox("Інжир");
		checkBox3_5.setOpaque(false);
		checkBox3_5.setBounds(410, 274, 160, 25);
		getContentPane().add(checkBox3_5);

		checkBox3_4 = new JCheckBox("Ананас");
		checkBox3_4.setOpaque(false);
		checkBox3_4.setBounds(410, 238, 160, 25);
		getContentPane().add(checkBox3_4);

		checkBox3_3 = new JCheckBox("Авокадо");
		checkBox3_3.setOpaque(false);
		checkBox3_3.setBounds(410, 204, 160, 25);
		getContentPane().add(checkBox3_3);

		checkBox3_2 = new JCheckBox("Кавове дерево");
		checkBox3_2.setOpaque(false);
		checkBox3_2.setBounds(410, 169, 160, 25);
		getContentPane().add(checkBox3_2);

		checkBox3_1 = new JCheckBox("Гранат");
		checkBox3_1.setOpaque(false);
		checkBox3_1.setBounds(410, 134, 160, 25);
		getContentPane().add(checkBox3_1);

		checkBox3_0 = new JCheckBox("Цитрусові");
		checkBox3_0.setOpaque(false);
		checkBox3_0.setBounds(410, 96, 160, 25);
		getContentPane().add(checkBox3_0);

		l_fonVodaOputuvanna = new JLabel("");
		l_fonVodaOputuvanna.setBounds(0, -1, 794, 565);
		l_fonVodaOputuvanna.setIcon(new ImageIcon("C:\\Users\\Zakkk\\Desktop\\artleo.com-51610.jpg"));
		getContentPane().add(l_fonVodaOputuvanna);

		setVisible(true);
	}
}
