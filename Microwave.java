import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;

public class Microwave extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		GridPane root = new GridPane();
		GridPane gPane1 = new GridPane();
		GridPane gPane2 = new GridPane();
		TextField time = new TextField("Time to be displayed here");
		Label food = new Label("Place food here");
		
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
		
		gPane1.add(start_button, 1, 3);
		gPane1.add(stop_button, 2, 3);
		gPane1.add(button_0, 0, 3);
		gPane1.add(button_1, 0, 0);
		gPane1.add(button_2, 1, 0);
		gPane1.add(button_3, 2, 0);
		gPane1.add(button_4, 0, 1);
		gPane1.add(button_5, 1, 1);
		gPane1.add(button_6, 2, 1);
		gPane1.add(button_7, 0, 2);
		gPane1.add(button_8, 1, 2);
		gPane1.add(button_9, 2, 2);

		gPane2.add(time,0,0);
		root.setColumnIndex(food,0);
		root.setColumnIndex(gPane1,1);
		root.setColumnIndex(gPane2,1);
		root.setRowIndex(food,1);
		root.setRowIndex(gPane1,1);
		root.setRowIndex(gPane2,0);
		/*
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth(50);
		ColumnConstraints column2 = new ColumnConstraints();
		column2.setPercentWidth(50);
		root.getColumnConstraints().addAll(column1, column2);
		*/

		root.getChildren().addAll(gPane1,gPane2,food);		
		
		Scene scene = new Scene(root,200,50);
		primaryStage.setTitle("Microwave Oven");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
    	launch(args);
    }

}