import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.input.*;

public class EllipseMaster extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Pane canvas = new Pane();

        Ellipse ellipse = new Ellipse(115, 200);
        ellipse.setFill(Color.CRIMSON);
        ellipse.setStroke(Color.BLACK);
        ellipse.setCenterX(400);
        ellipse.setCenterY(300);

        canvas.getChildren().add(ellipse);

        canvas.setOnKeyPressed(event -> keyHandler(event, ellipse));

        Scene scene = new Scene(canvas, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ellipse Master");
        primaryStage.show();

        canvas.requestFocus();
    }

    public void keyHandler(KeyEvent event, Ellipse ellipse)
    {
        final int STEP = 10;

        switch (event.getCode())
        {
            case UP:
                ellipse.setRadiusY(ellipse.getRadiusY() + STEP);
                break;
            case DOWN:
                ellipse.setRadiusY(ellipse.getRadiusY() - STEP);
                break;
            case LEFT:
                ellipse.setRadiusX(ellipse.getRadiusX() - STEP);
                break;
            case RIGHT:
                ellipse.setRadiusX(ellipse.getRadiusX() + STEP);
                break;
        }
    }
}
