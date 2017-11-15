import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Microwave extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		GridPane gPane = new GridPane();
		
		Button start_button = new Button("Start");
		Button stop_button = new Button("Stop");
		Button button_0 = new Button("0");
		Button button_1 = new Button("1");
		Button button_2 = new Button("2");
		Button button_3 = new Button("3");
		Button button_4 = new Button("4");
		Button button_5 = new Button("5");
		Button button_6 = new Button("6");
		Button button_7 = new Button("7");
		Button button_8 = new Button("8");
		Button button_9 = new Button("9");
		
		gPane.add(start_button, 1, 3);
		gPane.add(stop_button, 2, 3);
		gPane.add(button_0, 0, 3);
		gPane.add(button_1, 0, 0);
		gPane.add(button_2, 1, 0);
		gPane.add(button_3, 2, 0);
		gPane.add(button_4, 0, 1);
		gPane.add(button_5, 1, 1);
		gPane.add(button_6, 2, 1);
		gPane.add(button_7, 0, 2);
		gPane.add(button_8, 1, 2);
		gPane.add(button_9, 2, 2);

		ColumnConstraints column0 = new ColumnConstraints();
		
		
		gPane.setPadding(new Insets(10,10,10,10));

		Scene scene = new Scene(gPane,200,50);
		primaryStage.setTitle("Microwave Oven");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
    	launch(args);
    }

}