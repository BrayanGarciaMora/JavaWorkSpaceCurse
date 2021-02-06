package graficos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambiEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEstado marco1 = new MarcoEstado();
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame {

	public MarcoEstado() {
		setVisible(true);
		setBounds(700, 150, 400, 300);
		CambiaEstado estadoA = new CambiaEstado();
		addWindowStateListener(estadoA);
	}
}

class CambiaEstado implements WindowStateListener {

	public void windowStateChanged(WindowEvent e) {
		System.out.println("cambio de estaado");
		//System.out.println(e.getNewState());
		
		if (e.getNewState() == JFrame.NORMAL) {
			System.out.println("estado normal");
		}
		else if (e.getNewState() == JFrame.MAXIMIZED_BOTH) {
			System.out.println("estado completo");
		}
		else if(e.getNewState() == JFrame.MAXIMIZED_HORIZ) {
			System.out.println("horizontal maximo");
		}
		
		
	}

}