import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class TicTacToeFx extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		GridPane grid = new GridPane();
		Image o = new Image("o.gif");
		Image x = new Image("x.gif");
		int rows = 4;
		int cols = 4;

		// set up the board
		for (int r=0; r<rows; r++) {
			RowConstraints row = new RowConstraints(40);
            grid.getRowConstraints().add(row);
		}

		for (int c=0; c<cols; c++) {
			ColumnConstraints column = new ColumnConstraints(40);
            grid.getColumnConstraints().add(column);
		}

		// randomnly place x's and o's or blanks
		int i=0;
		while(i<8)
		{	
			int r = (int)(Math.random()*4);
			int c = (int)(Math.random()*4);
			if(i%2 == 0){
				grid.add(new ImageView(o),c,r);
			}
			else{
				grid.add(new ImageView(x),c,r);
			}				
			i++;
		}

		Scene scene = new Scene(grid,200,50);
		primaryStage.setTitle("Randomn Tic Tac Toe");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args)
	{
    	launch(args);
    }
}