package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FocoVentana miObjeto = new FocoVentana();
		
		miObjeto.iniciar();
		
	}

	public void iniciar() { //ESTO ES UN METODO PARA DARLES PROPIEDADES A UN MARCO
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);

		marco1.setBounds(100, 100, 450, 350);
		marco2.setBounds(700, 100, 450, 350);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent we) {
		// TODO Auto-generated method stub
		
		if (we.getSource()==marco1) {
			marco1.setTitle("tengo el foco");	
		}else {
			marco2.setTitle("tengo el foco");
		}
		

	}

	@Override
	public void windowLostFocus(WindowEvent we) {
		// TODO Auto-generated method stub
		
		if (we.getSource()==marco1) {
			marco1.setTitle("perdi el foco");	
		}else {
			marco2.setTitle("perdi el foco");
		}
		

	}

	FocoVentana marco1;
	FocoVentana marco2;

}
