package KP.RoslunneGospodarstvo;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class PromusloveMap extends JFrame {

	private static final long serialVersionUID = 1L; 

	private JButton b_Nazad; 
 
	public PromusloveMap(String s, final String s_putanna1,
			final int i_slider_putanna2, final int i_slider_putanna3, final int i_slider_putanna4,
			final int i_putanna5) {
		super(s);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_Hapka = new JLabel("Будь ласка, оберіть регіон");
		l_Hapka.setFont(new Font("Segoe UI", Font.ITALIC, 40));
		l_Hapka.setForeground(Color.GREEN);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(10, 0, 770, 51);
		getContentPane().add(l_Hapka);

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

		JLabel l_luck = new JLabel("");
		l_luck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство", "Луцьк",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});
		l_luck.setBounds(92, 98, 84, 88);
		getContentPane().add(l_luck);

		JLabel l_Rivne = new JLabel("");
		l_Rivne.setBounds(175, 106, 56, 97);
		getContentPane().add(l_Rivne);
		l_Rivne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Рівне",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Jutomur = new JLabel("");
		l_Jutomur.setBounds(238, 117, 92, 117);
		getContentPane().add(l_Jutomur);
		l_Jutomur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Житомир", s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Kiev = new JLabel("");
		l_Kiev.setBounds(328, 128, 56, 149);
		getContentPane().add(l_Kiev);
		l_Kiev.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Київ",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Kiev1 = new JLabel("");
		l_Kiev1.setBounds(380, 183, 56, 51);
		getContentPane().add(l_Kiev1);
		l_Kiev1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Київ",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Cernigiv = new JLabel("");
		l_Cernigiv.setBounds(380, 64, 105, 122);
		getContentPane().add(l_Cernigiv);
		l_Cernigiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Чернігів",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Summy = new JLabel("");
		l_Summy.setBounds(473, 74, 118, 122);
		getContentPane().add(l_Summy);
		l_Summy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Суми",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Lviv = new JLabel("");
		l_Lviv.setBounds(39, 199, 97, 75);
		getContentPane().add(l_Lviv);
		l_Lviv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Львів",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Ternopol = new JLabel("");
		l_Ternopol.setBounds(148, 216, 46, 97);
		getContentPane().add(l_Ternopol);
		l_Ternopol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Тернопіль",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Hmelnuckuy = new JLabel("");
		l_Hmelnuckuy.setBounds(196, 199, 56, 117);
		getContentPane().add(l_Hmelnuckuy);
		l_Hmelnuckuy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Хмельницький",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Vinnisa = new JLabel("");
		l_Vinnisa.setBounds(248, 235, 92, 112);
		getContentPane().add(l_Vinnisa);
		l_Vinnisa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Вінниця",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);			
			}
		});

		JLabel l_Cerkasu = new JLabel("");
		l_Cerkasu.setBounds(338, 262, 68, 51);
		getContentPane().add(l_Cerkasu);
		l_Cerkasu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Черкаси",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Cerkasu1 = new JLabel("");
		l_Cerkasu1.setBounds(396, 235, 78, 63);
		getContentPane().add(l_Cerkasu1);
		l_Cerkasu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Черкаси",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Poltava = new JLabel("");
		l_Poltava.setBounds(458, 199, 105, 88);
		getContentPane().add(l_Poltava);
		l_Poltava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Полтава",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Harkiv = new JLabel("");
		l_Harkiv.setBounds(566, 187, 118, 111);
		getContentPane().add(l_Harkiv);
		l_Harkiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Харків",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Lugansk = new JLabel("");
		l_Lugansk.setBounds(702, 216, 78, 131);
		getContentPane().add(l_Lugansk);
		l_Lugansk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel l_Ujgorod = new JLabel("");
		l_Ujgorod.setBounds(10, 287, 84, 65);
		getContentPane().add(l_Ujgorod);
		l_Ujgorod.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Ужгород",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_IF = new JLabel("");
		l_IF.setBounds(90, 280, 61, 88);
		getContentPane().add(l_IF);
		l_IF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","ІФ",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Cernivci = new JLabel("");
		l_Cernivci.setBounds(147, 314, 92, 51);
		getContentPane().add(l_Cernivci);
		l_Cernivci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Чернівці",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Kirovograd = new JLabel("");
		l_Kirovograd.setBounds(380, 297, 118, 50);
		getContentPane().add(l_Kirovograd);
		l_Kirovograd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Кіровоград",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Dnipro = new JLabel("");
		l_Dnipro.setBounds(497, 300, 146, 47);
		getContentPane().add(l_Dnipro);
		l_Dnipro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Дніпро",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Dnipro1 = new JLabel("");
		l_Dnipro1.setBounds(469, 344, 84, 35);
		getContentPane().add(l_Dnipro1);
		l_Dnipro1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Дніпро",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Doneck = new JLabel("");
		l_Doneck.setBounds(634, 287, 78, 131);
		getContentPane().add(l_Doneck);
		l_Doneck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel l_Odessa1 = new JLabel("");
		l_Odessa1.setBounds(279, 352, 84, 173);
		getContentPane().add(l_Odessa1);
		l_Odessa1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Одеса",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Odessa = new JLabel("");
		l_Odessa.setBounds(362, 382, 34, 88);
		getContentPane().add(l_Odessa);
		l_Odessa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Одеса",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Mukolaiv = new JLabel("");
		l_Mukolaiv.setBounds(396, 359, 45, 88);
		getContentPane().add(l_Mukolaiv);
		l_Mukolaiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Миколаїв",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Mukolaiv1 = new JLabel("");
		l_Mukolaiv1.setBounds(429, 360, 56, 58);
		getContentPane().add(l_Mukolaiv1);
		l_Mukolaiv1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Миколаїв",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Mukolaiv2 = new JLabel("");
		l_Mukolaiv2.setBounds(361, 344, 68, 35);
		getContentPane().add(l_Mukolaiv2);
		l_Mukolaiv2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Миколаїв",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Herson = new JLabel("");
		l_Herson.setBounds(439, 425, 118, 41);
		getContentPane().add(l_Herson);
		l_Herson.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Херсон",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Herson1 = new JLabel("");
		l_Herson1.setBounds(473, 382, 68, 36);
		getContentPane().add(l_Herson1);
		l_Herson1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Херсон",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Zaporija = new JLabel("");
		l_Zaporija.setBounds(545, 352, 98, 95);
		getContentPane().add(l_Zaporija);
		l_Zaporija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new PromusloveRecomendacia("Рекомендація. Промислове рослинне господпрство","Запоріжжя",  s_putanna1,
						 i_slider_putanna2,  i_slider_putanna3,  i_slider_putanna4,
						 i_putanna5);
			}
		});

		JLabel l_Simferopol = new JLabel("");
		l_Simferopol.setBounds(442, 479, 190, 86);
		getContentPane().add(l_Simferopol);
		l_Simferopol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Вибачте, на даний момент цей регіон недоступний.");
			}
		});

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("res/map.jpg"));
		label.setBounds(0, 0, 794, 565);
		getContentPane().add(label);

		setVisible(true);
	}
}
