package graficos;

import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MarcoConFuentes mimarco = new MarcoConFuentes();
mimarco.setVisible(true);
mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConFuentes extends JFrame {

	public MarcoConFuentes() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("src/graficos/descarga.gif");
		setIconImage(miIcono);

		setTitle("Prueba con Fuentes");

		setSize(400, 400);

		LaminaConFuentes milamina = new LaminaConFuentes();

		add(milamina);
		milamina.setForeground(Color.BLUE.brighter()); // ESTABLECE EL COLOR DE TODO EL TEXTO DE UN FRAME
			}
}

class LaminaConFuentes extends JPanel {
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Courier",Font.BOLD, 36);
		
		g2.setFont(mifuente);
	//	g2.setColor(Color.blue);	
		g2.drawString("S0doma ", 100, 100);
		
		
		
		Font mifuente1 = new Font ("Verdana",1, 50);
		g2.setFont(mifuente1);
		g2.setColor(new Color(255,0,225).brighter());
		g2.drawString("Gomorra", 100, 150);
		
	}
}









