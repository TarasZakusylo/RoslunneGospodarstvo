package KP.RoslunneGospodarstvo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PromusloveRecomendacia extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JLabel l_Nazva;
	private JButton b_Nazad;
	
	public PromusloveRecomendacia(String s, String s_Region, String s_putanna1,
			 int i_slider_putanna2, int i_slider_putanna3, int  i_slider_putanna4,
			 int i_putanna5) {
		super(s);
		 
		System.out.println(s_Region);
		
	}

}
