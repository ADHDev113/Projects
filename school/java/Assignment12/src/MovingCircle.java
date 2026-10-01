import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.input.*;

public class MovingCircle extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Pane canvas = new Pane();

        Circle circle = new Circle(50);
        circle.setCenterY(400);
        circle.setCenterX(400);
        circle.setFill(Color.CRIMSON);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        canvas.getChildren().add(circle);

        canvas.setOnKeyPressed(event -> keyHandler(event, circle));

        Scene scene = new Scene(canvas, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving Circle");
        primaryStage.show();

        canvas.requestFocus();
    }

    public void keyHandler(KeyEvent event, Circle circle)
    {
        final int STEP = 10;

        switch (event.getCode())
        {
            case UP:
                circle.setCenterY(circle.getCenterY() - STEP);
                break;
            case DOWN:
                circle.setCenterY(circle.getCenterY() + STEP);
                break;
            case LEFT:
                circle.setCenterX(circle.getCenterX() - STEP);
                break;
            case RIGHT:
                circle.setCenterX(circle.getCenterX() + STEP);
        }
    }
}
