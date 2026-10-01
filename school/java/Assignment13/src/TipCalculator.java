import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;

public class TipCalculator extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane layout = new GridPane(10, 10);
        layout.setPadding(new Insets(20, 40, 20, 40));

        Label subtotalLabel = new Label("Subtotal:");
        TextField subtotalInput = new TextField();
        Label tipRateLabel = new Label("Tip Rate:");
        TextField tipRateInput = new TextField();
        Label tipLabel = new Label("Tip:");
        Label tipResult = new Label();
        Label totalLabel = new Label("Total:");
        Label totalResult = new Label();
        Button button = new Button("Calculate");

        button.setOnAction(event -> buttonHandler(subtotalInput, tipRateInput, tipResult, totalResult));

        layout.add(subtotalLabel, 0, 0);
        layout.add(subtotalInput, 1, 0);
        layout.add(tipRateLabel, 0, 1);
        layout.add(tipRateInput, 1, 1);
        layout.add(tipLabel, 0, 2);
        layout.add(tipResult, 1, 2);
        layout.add(totalLabel, 0, 3);
        layout.add(totalResult, 1, 3);
        layout.add(button, 1, 4);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tip Calculator");
        primaryStage.show();
    }

    public void buttonHandler(TextField sutotalInput, TextField tipRateInput, Label tipResult, Label totalResult)
    {
        double subtotal = Double.parseDouble(sutotalInput.getText());
        double tipRate = Double.parseDouble(tipRateInput.getText()) / 100;

        double tip = subtotal * tipRate;
        double total = subtotal + tip;

        tipResult.setText(String.format("$%.2f", tip));
        totalResult.setText(String.format("$%.2f", total));
    }
}
