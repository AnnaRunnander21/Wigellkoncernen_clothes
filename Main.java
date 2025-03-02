import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        //skapar en knapp
        Button button = new Button("Server");
        button.setOnAction(event -> System.out.println("Waiting for connection..."));
        //lägger knappen i en layout
        StackPane root = new StackPane();
        root.getChildren().add(button);
        //skapar scen
        Scene scene = new Scene(root, 10, 10);
        primaryStage.setTitle("Welcome!");
        primaryStage.setScene(scene);
        primary.Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
