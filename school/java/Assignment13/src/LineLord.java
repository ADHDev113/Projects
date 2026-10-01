import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.input.*;

public class LineLord extends Application
{
    double x1 = 200;
    double y1 = 300;
    double x2 = 600;
    double y2 = 300;

    @Override
    public void start(Stage primaryStage)
    {
        Pane canvas = new Pane();

        Circle startCircle = new Circle(10);
        startCircle.setFill(Color.DARKVIOLET);
        startCircle.setCenterX(x1);
        startCircle.setCenterY(y1);

        Circle endCircle = new Circle(10);
        endCircle.setFill(Color.CRIMSON);
        endCircle.setCenterX(x2);
        endCircle.setCenterY(y2);

        Line line = new Line(x1, y1, x2, y2);
        line.setStrokeWidth(2);

        canvas.getChildren().addAll(line, startCircle, endCircle);

        canvas.setOnKeyPressed(event -> keyHandler(event, startCircle, endCircle, line));

        Scene scene = new Scene(canvas, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Line Lord");
        primaryStage.show();

        canvas.requestFocus();
    }

    public void keyHandler(KeyEvent event, Circle startCircle, Circle endCircle, Line line)
    {
        final int STEP = 10;

        switch (event.getCode())
        {
            case W:
                y1 -= STEP;
                line.setStartY(y1);
                startCircle.setCenterY(y1);
                break;
            case A:
                x1 -= STEP;
                line.setStartX(x1);
                startCircle.setCenterX(x1);
                break;
            case S:
                y1 += STEP;
                line.setStartY(y1);
                startCircle.setCenterY(y1);
                break;
            case D:
                x1 += STEP;
                line.setStartX(x1);
                startCircle.setCenterX(x1);
                break;
            case UP:
                y2 -= STEP;
                line.setEndY(y2);
                endCircle.setCenterY(y2);
                break;
            case LEFT:
                x2 -= STEP;
                line.setEndX(x2);
                endCircle.setCenterX(x2);
                break;
            case DOWN:
                y2 += STEP;
                line.setEndY(y2);
                endCircle.setCenterY(y2);
                break;
            case RIGHT:
                x2 += STEP;
                line.setEndX(x2);
                endCircle.setCenterX(x2);
                break;
            default:
                break;
        }
    }
}
