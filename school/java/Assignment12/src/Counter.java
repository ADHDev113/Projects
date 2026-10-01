import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Counter extends Application
{

    int count = 0;

    @Override
    public void start(Stage primaryStage)
    {

        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10));

        Label label = new Label("" + count);
        Button button = new Button("Count");
        BorderPane.setAlignment(button, Pos.CENTER);

        layout.setCenter(label);
        layout.setBottom(button);

        button.setOnAction(event -> buttonHandler(label));

        Scene scene = new Scene(layout, 200, 100);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Counter");
        primaryStage.show();
    }

    public void buttonHandler(Label label)
    {
        count++;
        label.setText("" + count);
    }
}
