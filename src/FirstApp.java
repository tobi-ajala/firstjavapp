import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane; //ability to importing the layout
import javafx.scene.Scene;


public class FirstApp extends Application {
	Pane root = new Pane();
	Scene scene = new Scene(root,800,600);
	Button b1 = new Button("Don't click me!");
	Label l1 = new Label("Hello there");
	EventHandler<ActionEvent> bHandler = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			l1.setText("Ouch, I said don't click me");
			
		}};

		public static void main(String[] args) {
			launch(args);
		}

	public void start(Stage stage) throws Exception {
		stage.setScene(scene);
		stage.setTitle("Hello App");
		stage.show();
		
		root.getChildren().add(l1); //returning the reference to the array list
		l1.setLayoutX(100); //positioning pixels
		l1.setLayoutY(100);
		
		root.getChildren().add(b1);
		b1.setLayoutX(100);
		b1.setLayoutY(300);
		b1.setOnAction(bHandler);
	
	}
}
