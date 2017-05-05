package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_Nazva;
	private JButton b_Promuslove;
	private JButton b_Domahne;
	private JButton b_Kimnatne;
	private JLabel l_Zakk;
	private JLabel l_logo;
	private JButton b_SadovoParkove;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Nazva = new JLabel("Рослинне господарство");
		l_Nazva.setForeground(Color.BLUE);
		l_Nazva.setFont(new Font("Segoe UI", Font.ITALIC, 55));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(0, 0, 794, 78);
		getContentPane().add(l_Nazva);

		b_Promuslove = new JButton("Промислове рослинництво");
		b_Promuslove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Promuslove("Промислове рослинництво");
				setVisible(false);
			}
		});
		b_Promuslove.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Promuslove.setBounds(34, 417, 352, 46);
		getContentPane().add(b_Promuslove);

		b_Domahne = new JButton("Домашнє рослинництво");
		b_Domahne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Domahne("Домашнє рослинництво");
				setVisible(false);
			}
		});
		b_Domahne.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Domahne.setBounds(34, 487, 352, 46);
		getContentPane().add(b_Domahne);

		b_Kimnatne = new JButton("Кімнатне рослинництво");
		b_Kimnatne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Kimnatne("Кімнатне рослинництво");
				setVisible(false);
			}
		});
		
		b_SadovoParkove = new JButton("Садово-паркове мистецтво");
		b_SadovoParkove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SadovoParkove("Садово-паркове мистецтво");
				setVisible(false);
			}
		});
		b_SadovoParkove.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_SadovoParkove.setBounds(398, 417, 354, 46);
		getContentPane().add(b_SadovoParkove);
		b_Kimnatne.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Kimnatne.setBounds(398, 487, 354, 46);
		getContentPane().add(b_Kimnatne);

		l_Zakk = new JLabel("");
		l_Zakk.setBounds(698, 481, 84, 71);
		l_Zakk.setIcon(new ImageIcon("res/Zakk.png"));
		getContentPane().add(l_Zakk);
		
		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 794, 565);
		l_logo.setIcon(new ImageIcon("res/logo_menu.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}
