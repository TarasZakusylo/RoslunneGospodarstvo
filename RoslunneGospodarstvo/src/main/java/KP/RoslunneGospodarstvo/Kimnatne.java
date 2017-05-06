package KP.RoslunneGospodarstvo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
 
public class Kimnatne extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_Nazva;
	private JButton b_Nazad;

	public Kimnatne(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Nazva = new JLabel("Рослинне господарство");
		l_Nazva.setForeground(Color.YELLOW);
		l_Nazva.setFont(new Font("Segoe UI", Font.ITALIC, 55));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(0, 0, 794, 78);
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

		// l_logo = new JLabel("");
		// l_logo.setBounds(0, 0, 794, 565);
		// l_logo.setIcon(new ImageIcon("res/logo_menu.jpg"));
		// getContentPane().add(l_logo);

		setVisible(true);
	}
}
