package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			FXMLLoader loader = new  FXMLLoader(getClass().getResource("/views/LoginView.fxml"));
//			
//			//Inflate the view using the loader
//            AnchorPane root = (AnchorPane) loader.load();
//			Scene scene = new Scene(root);
//			
//			//point to stylesheet for possible styles
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//            LoginController controller = loader.getController();
//            
//            //Set the parent stage in the controller
//			primaryStage.show();
			
			
			//load LoginView
			FXMLLoader loader = new  FXMLLoader(getClass().getResource("/views/LoginView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("BitTicket");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
