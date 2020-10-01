package dad.javafx.holamundo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundoAWT {
	
	public static void main(String[] args) {
		
		// creamos una etiqueta para mostrar el saludo
		Label saludarLabel = new Label();
		saludarLabel.setText("Aquí saldrá el saludo");
		saludarLabel.setBounds(20, 20, 120, 50); // indicamos coordenadas (x,y) y dimensiones (ancho,alto) 
		
		// creamos el botón para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		// establecemos un "listener" para la pulsación del botón (capturar el evento)
		saludarButton.addActionListener(e -> saludarLabel.setText("¡¡¡Hola Mundo!!!")); // mostramos el saludo en la etiqueta al pulsar el botón

		// panel (contenedor) que contiene la etiqueta y el botón
		Panel root = new Panel(); 
		root.setLayout(null); // fijar la disposición de los componentes
		root.add(saludarLabel);
		root.add(saludarButton);
		
		// ventana
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo con AWT");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // centrar la ventana en pantalla
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose(); // cerrar la ventana 
			}
		});
		frame.add(root);
		
		frame.setVisible(true);
		
	}

}

