package dad.javafx.holamundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundoSwing {
	
	public static void main(String[] args) {
		
		// creamos una etiqueta para mostrar el saludo
		JLabel saludarLabel = new JLabel();
		saludarLabel.setText("Aquí saldrá el saludo");
		saludarLabel.setBounds(20, 20, 120, 50);
		
		// creamos el botón para saludar
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Cuando me pulses te saludo"); // establecemos el tooltip del botón
		// establecemos un "listener" para la pulsación del botón (capturar el evento)		
		saludarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludarLabel.setText("¡¡¡Hola Mundo!!!");			
			}
		});
		
		// panel (contenedor) que contiene la etiqueta y el botón
		JPanel root = new JPanel(); 
		root.setLayout(null); // fijar la disposición de los componentes
		root.add(saludarLabel);
		root.add(saludarButton);
		
		// creamos la ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null); // centrar la ventana en pantalla
		frame.setContentPane(root);
		
		// mostramos la ventana (abrimos)
		frame.setVisible(true);
		
	}

}




