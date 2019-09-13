package dad.javafx.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HolaMundoFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label saludoLabel = new Label();
		saludoLabel.setText("Aquí saldrá el saludo");
		saludoLabel.setLayoutX(20);
		saludoLabel.setLayoutY(20);
		
		Button saludarButton = new Button();
		saludarButton.setText("Saludar");
		saludarButton.setTooltip(new Tooltip("Cuando me pulses te saludo"));
		saludarButton.setLayoutX(20);
		saludarButton.setLayoutY(80);
		saludarButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				saludoLabel.setText("¡¡¡Hola Mundo!!!");
			}
		});
		
		Pane root = new Pane();
		root.getChildren().addAll(saludoLabel, saludarButton);

		Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Hola Mundo con JavaFX");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
