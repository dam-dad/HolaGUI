package dad.javafx.holamundo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundoAWT {
	
	public static void main(String[] args) {
		
		Label saludarLabel = new Label();
		saludarLabel.setText("Aquí saldrá el saludo");
		saludarLabel.setBounds(20, 20, 120, 50);
		
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludarLabel.setText("¡¡¡Hola Mundo!!!");			
			}
		});
		
		Panel root = new Panel(); 
		root.setLayout(null);
		root.add(saludarLabel);
		root.add(saludarButton);
		
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo con AWT");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.add(root);
		
		frame.setVisible(true);
		
	}

}

