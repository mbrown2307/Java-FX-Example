import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DemoMain extends Application
{

   public static void main(String[] args)
   {   
      launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception
   {
      // Load the GUI from FXML built in Scene Builder
      Parent root = FXMLLoader.load(getClass().getResource("DemoView.fxml"));    
      Scene scene = new Scene(root);      
      stage.setTitle("Demo JavaFX with Scene BUilder");      
      stage.setScene(scene);
      stage.show();
      
      // All of the code that interacts with the API and the Scene 
      //   is found in DemoViewController.java
      
   }


}