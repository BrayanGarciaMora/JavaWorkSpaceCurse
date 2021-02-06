package graficos;


import java.awt.FlowLayout;

//Definicion de los paquetes ha ser utilizado
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLayout marcoLayout = new MarcoLayout();
		marcoLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoLayout extends JFrame {
	public MarcoLayout() {
		setTitle("Marco con Layout");
		setBounds(750, 100, 400, 400);
		setVisible(true);
		PanelLayouts lamina = new PanelLayouts();
		add(lamina);
		
		lamina.setLayout(new FlowLayout(0));
	}
}
 
class PanelLayouts extends JPanel {//ESTA ES LA LAMINA
	public PanelLayouts() {
		add(new JButton("Amarillo"));
		add(new JButton("azul"));
		add(new JButton("verde"));
	}

}
