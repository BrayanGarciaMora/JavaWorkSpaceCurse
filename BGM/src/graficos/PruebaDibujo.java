package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcosConDibujos marco = new MarcosConDibujos();

		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcosConDibujos extends JFrame {

	public MarcosConDibujos() {

		setTitle("prueba dibujo ");
		setSize(400, 400);
		LaminiConConfiguras lamina1 = new LaminiConConfiguras();
		add(lamina1);
		lamina1.setBackground(Color.green);

	}
}

class LaminiConConfiguras extends JPanel {

	public void paintComponent(Graphics g) {

//		g.drawRect(400/4, 400/4, 200, 200);
//		g.drawLine(100, 100, 300, 200);
//		g.drawArc(100, 100, 250, 250, 300, 360);
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

		g2.setPaint(Color.RED);
		g2.fill(rectangulo);

		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setColor(new Color(64, 0, 64));// ESTABLECER EL COLOR CON EL SISTEMA RGB
//		g2.setColor(Color.red);// FORMA PRIMITIVA DE ESTABLECER COLORB
		g2.fill(elipse);

//Line2D linea = new Line2D.Double(100, 100, 300, 250);
//g2.draw(linea);
//		g2.draw(new Line2D.Double(100, 100, 300, 250));// INSTANCIADO EN EL METODO DRAW
//		double CentroEnX = rectangulo.getCenterX();
//		double CentroEnY = rectangulo.getCenterY();
//		double radio = 143;
//		Ellipse2D circulo = new Ellipse2D.Double();
//		circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnY + radio, CentroEnY + radio);
//		g2.draw(circulo); 
	}
}
