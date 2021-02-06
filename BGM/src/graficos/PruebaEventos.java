package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Marcos y Botones");
		setBounds(700,300,500,300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
	}
	
}
class LaminaBotones extends JPanel implements ActionListener{//LA LAMINA TIENE QUE IMPLEMENTAR LA INTERFAZ ACTIONLISTENER YA QUE ELLA ES LA QUE RESIBE EL EVENTO
	
	JButton botonAzul = new JButton("Azul");
	JButton botonRojo = new JButton("Rojo");
	JButton botonAmari = new JButton("Amarillo");
	JButton botonVerde = new JButton("verde");
	JButton botonMagenta = new JButton("Morado");
	JButton botonNegro = new JButton("Negro");
	JButton botonMamel = new JButton("Mamel");
	JButton botonBlanco = new JButton("Blanco");
	public LaminaBotones() {
		add(botonAzul);
		add(botonRojo);
		add(botonAmari);
		add(botonVerde);
		add(botonMagenta);
		add(botonNegro);
		add(botonMamel);
		add(botonBlanco);
		
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmari.addActionListener(this);
		botonVerde.addActionListener(this);
		botonMagenta.addActionListener(this);
		botonNegro.addActionListener(this);
		botonMamel.addActionListener(this);
		botonBlanco.addActionListener(this);
		

	}
	
	public void actionPerformed(ActionEvent e ) {
		 Object clickBoton = e.getSource();
		 
		 if (clickBoton == botonAzul) {
			 setBackground(Color.BLUE);
		 }
		 else if (clickBoton == botonRojo) {
			 setBackground(Color.RED);
		 }
		 else if(clickBoton == botonAmari){
			 setBackground(Color.YELLOW);
		 }
		 else if (clickBoton == botonVerde) {
			 setBackground(Color.GREEN);
		 }
		 else if (clickBoton == botonMagenta) {
			 setBackground(Color.MAGENTA);
		 }
		 else if (clickBoton == botonNegro) {
			 setBackground(Color.BLACK);
			 
		 }
		 else if (clickBoton == botonBlanco) {
			 setBackground(Color.WHITE);
		 }
		 else {
			 setBackground(Color.ORANGE);
		 }
		 
			 
		 
	}
	
}  






