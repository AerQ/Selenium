package JavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class Main extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Group group = new Group();       // корневой узел
//        FXMLLoader loader = new FXMLLoader(new File("C:/Users/Остап/IdeaProjects/Selenium/src/main/resources/FXML/myFirstApp.fxml").toURI().toURL());
//        Parent roots = loader.load();/
        Parent content = FXMLLoader.load(getClass().getResource("resources/myFirstApp.fxml"));
//        Parent content = FXMLLoader.load(getClass().getResource("/myFirstApp.fxml"));
        BorderPane root= new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);
        stage.setTitle("PromBot");
        stage.setScene(new Scene(group));
        stage.show();
    }
}
