import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;

public class RandomAvatar extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(50, 50, 10, 50));
        GridPane canvas = new GridPane();
        canvas.setPadding(new Insets(0, 0, 15, 0));

        Button button = new Button("Generate");

        buttonHandler(canvas);

        layout.setCenter(canvas);
        layout.setBottom(button);
        BorderPane.setAlignment(button, Pos.CENTER);

        button.setOnAction(event -> buttonHandler(canvas));

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Avatars");
        primaryStage.show();
    }

    public void buttonHandler(GridPane canvas)
    {
        canvas.getChildren().clear();

        int[][] avatar = new int[5][5];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                avatar[j][i] = (int)(Math.random() * 2);
            }
        }
        for (int i = 0; i < 5; i++)
        {
            avatar[i][3] = avatar[i][1];
        }
        for (int i = 0; i < 5; i++)
        {
            avatar[i][4] = avatar[i][0];
        }

        double red = Math.random();
        double green = Math.random();
        double blue = Math.random();
        Color randomColor = new Color(red, green, blue, 1);

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (avatar[j][i] == 1)
                {
                    Rectangle rectangle = new Rectangle(100, 100);
                    rectangle.setFill(randomColor);
                    canvas.add(rectangle, i, j);
                }
                else
                {
                    Rectangle rectangle = new Rectangle(100, 100);
                    rectangle.setFill(Color.TRANSPARENT);
                    canvas.add(rectangle, i, j);
                }
            }
        }
    }
}
