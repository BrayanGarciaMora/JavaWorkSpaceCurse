package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco = new miMarco();
		marco.setVisible(true); // PERMITE QUE UN FRAME SEA VISIBLE
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EVITA QUE SI HAY MAS FRAME SE CIERREN TODOS

	}

}

class miMarco extends JFrame {

	public miMarco() {// METODO COSTRUCTOR

		// setSize(500,300); //PARA EL ALTO Y EL ACHO DE UN FRAME
		// setLocation(300,300); //PARA LA UBICASION DE UN FRAME YA SEA EN EL EJE (X) o
		// (Y)
		setBounds(/* EJE X */200, /* EJE Y */200, /* ANCHO */1000, /* ALTO */500); // COMBINA: setLocation Y setSize
		setTitle("Esto es un titulo parA un frame");
		// setResizable(false); // PARA EVITAR QUE UN FRAME SE PUEDA REDIMENCIONAR
		// setExtendedState(Frame.MAXIMIZED_BOTH); // MAXIMIZA UN FRAME

	}

}