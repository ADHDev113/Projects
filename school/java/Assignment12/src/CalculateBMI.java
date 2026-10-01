import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class CalculateBMI extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane layout = new GridPane(10, 10);
        layout.setPadding(new Insets(10));

        Label weightLabel = new Label("Weight");
        TextField weightInput = new TextField();
        Label heightLabel = new Label("Height");
        TextField heightInput = new TextField();
        CheckBox imperialUnits = new CheckBox("Imperial Units");
        Button button = new Button("Calculate");
        Label bmiLabel = new Label("BMI:");
        Label result = new Label();

        layout.add(weightLabel, 0, 0);
        layout.add(weightInput, 1, 0);
        layout.add(heightLabel, 0, 1);
        layout.add(heightInput, 1, 1);
        layout.add(imperialUnits, 1, 2);
        layout.add(button, 0, 2);
        layout.add(bmiLabel, 0, 3);
        layout.add(result, 1, 3);

        button.setOnAction(event -> buttonHandler(weightInput, heightInput, imperialUnits, result));

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculate BMI");
        primaryStage.show();
    }

    public void buttonHandler(TextField weightInput, TextField heightInput, CheckBox imperialUnits, Label result)
    {
        double weight = Double.parseDouble(weightInput.getText());
        double height = Double.parseDouble(heightInput.getText());
        double bmi;

        if(imperialUnits.isSelected())
        {
            bmi = weight / (height * height) * 703;
        }
        else
        {
            bmi = weight / (height * height);
        }

        result.setText("" + bmi);
    }
}
