package dad.javafx.holamundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundoSwing {
	
	public static void main(String[] args) {
		
		JLabel saludarLabel = new JLabel();
		saludarLabel.setText("Aquí saldrá el saludo");
		saludarLabel.setBounds(20, 20, 120, 50);
		
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Cuando me pulses te saludo");
		saludarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludarLabel.setText("¡¡¡Hola Mundo!!!");			
			}
		});
		
		JPanel root = new JPanel(); 
		root.setLayout(null);
		root.add(saludarLabel);
		root.add(saludarButton);
		
		JFrame frame = new JFrame();
		frame.setTitle("Hola Mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(root);
		
		frame.setVisible(true);
		
	}

}

