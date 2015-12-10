package simple.tutorial;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import simple.tutorial.view.RootLayoutController;

/**
 * Created by Игорь on 10.12.2015.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        SpringFxmlLoader loader = new SpringFxmlLoader(context);
        Parent root = (Parent) loader.load("/fxml/RootLayout.fxml", RootLayoutController.class);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
