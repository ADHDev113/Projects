import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.input.MouseEvent;

public class DrawLines extends Application
{
    boolean newLine = true;
    double x1;
    double y1;

    @Override
    public void start(Stage primaryStage)
    {
        Pane canvas = new Pane();

        canvas.setOnMouseClicked(event -> mouseHandler(event, canvas));

        Scene scene = new Scene(canvas, 750, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Draw Lines");
        primaryStage.show();
    }

    public void mouseHandler(MouseEvent event,Pane canvas)
    {
        double x = event.getX();
        double y = event.getY();

        Circle circle = new Circle(4);
        circle.setCenterX(x);
        circle.setCenterY(y);
        canvas.getChildren().add(circle);

        if(newLine)
        {
            x1 = x;
            y1 = y;
            newLine = false;
        }
        else
        {
            Line line = new Line(x1, y1, x, y);
            line.setStrokeWidth(2);
            canvas.getChildren().add(line);
            newLine = true;
        }

    }
}
