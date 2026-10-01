import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class CircleArea extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane layout = new GridPane(10, 10);
        layout.setPadding(new Insets(10));

        Label radiusLabel = new Label("Radius");
        TextField textField = new TextField();
        Label areaLabel = new Label("Area:");
        Label area = new Label();
        Button button = new Button("Calculate");

        layout.add(radiusLabel, 0, 0);
        layout.add(textField, 1, 0);
        layout.add(areaLabel, 0, 1);
        layout.add(area, 1, 1);
        layout.add(button, 0, 2);

        button.setOnAction(event -> buttonHandler(layout, textField, area));

        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setTitle("Circle Area");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonHandler(GridPane layout,TextField textField, Label area)
    {
        double radius = Double.parseDouble(textField.getText());
        double areaResult = Math.PI * Math.pow(radius, 2);

        area.setText("" + areaResult);

        Circle circle = new Circle(radius);
        circle.setFill(Color.CRIMSON);
        layout.add(circle, 1, 2);
    }
}
