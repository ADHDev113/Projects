import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;

public class RandomRectangles extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10));

        Label countLabel = new Label("Count:");
        TextField countInput = new TextField();
        Button button = new Button("Draw");

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(countLabel, countInput, button);

        layout.setTop(hbox);

        button.setOnAction(event -> buttonHandler(countInput, layout, hbox));

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Random Rectangles");
        primaryStage.show();
    }

    public void buttonHandler(TextField countInput, BorderPane layout, HBox hBox)
    {
        int count = Integer.parseInt(countInput.getText());

        for (int i = 0; i < count; i++)
        {
            Rectangle rectangle = new Rectangle();
            rectangle.setWidth(Math.random() * 100);
            rectangle.setHeight(Math.random() * 100);
            double red = Math.random();
            double green = Math.random();
            double blue = Math.random();
            Color color = new Color(red, green, blue, 1);
            rectangle.setFill(color);
            rectangle.setX(Math.random() * 801);
            rectangle.setY(Math.random() * 601);
            layout.getChildren().add(rectangle);
        }

        hBox.toFront();
    }
}
