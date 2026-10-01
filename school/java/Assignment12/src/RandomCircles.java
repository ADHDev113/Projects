import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class RandomCircles extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane layout = new BorderPane();

        Label countLabel = new Label("Count:");
        TextField count = new TextField();
        Button button = new Button("Draw");

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(countLabel, count, button);
        hBox.setPadding(new Insets(10));
        hBox.setAlignment(Pos.CENTER);

        layout.setTop(hBox);

        button.setOnAction(event -> buttonHandler(count, layout, hBox));

        Scene scene = new Scene(layout,800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Circles");
        primaryStage.show();
    }

    public void buttonHandler(TextField count, BorderPane layout, HBox hBox)
    {
        int num = Integer.parseInt(count.getText());

        for (int i = 0; i < num; i++)
        {
            Circle circle = new Circle(Math.random() * 100);
            circle.setCenterX(Math.random() * 801);
            circle.setCenterY(Math.random() * 601);
            double red = Math.random();
            double green = Math.random();
            double blue = Math.random();
            Color randomColor = new Color(red, green, blue, 1);
            circle.setFill(randomColor);

            layout.getChildren().add(circle);
        }

        hBox.toFront();
    }
}
