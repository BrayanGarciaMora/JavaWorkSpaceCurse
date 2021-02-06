package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosDeRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConRaton marco = new MarcoConRaton(820, 110);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConRaton extends JFrame {

	public MarcoConRaton(int x, int y) {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miIcono = mipantalla.getImage("src/graficos/sdjiwe.png");
		setIconImage(miIcono);
		setBounds(x, y, 400, 400);
		setVisible(true);
		setTitle("Eventos con el Raton");
		EventosConRaton Mause = new EventosConRaton();
		
		addMouseListener(Mause);

	}

}

//PODEMOS UTILIZAR TANTO LA CLASE MOUSE ADAPTER COMO LA INTERFACE MOUSE LISTENER
//SI IMPLEMENTAMOS LA ITERFACE MouseListener NOS VEMOS OBLIGADO A CREAR TODO LOS METODOS
class EventosConRaton extends JPanel/* implements MouseMotionListener extends MouseAdapter */ implements MouseListener {
	JButton botonAzul = new JButton("Azul");
	EventosConRaton(){
		add(botonAzul);	
	}
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("estas arrastrando");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("estas moviendo");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ESTAS FUERA ");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

//	public void mousePressed(MouseEvent e) {
//
//		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
//			System.out.println("Izquiedo");
//		} 
//		else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
//			System.out.println("Rueda");
//		}
//		else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
//			System.out.println("Derecho");
//		}
//	}

}
