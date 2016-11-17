package Far;

/**
 * Created by blackdartq on 10/26/16.
 */
import ToyMaker.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;





//public class Far extends Application {
public class Far{
    Button btn;



    public static void main(String[] args) {
        //launch(args);


        Entity character = new Entity();
        character.createMainCharacter();





    }





/*
    @Override
    public void start(Stage primaryStage) {

        Entity mainDude;
        mainDude = new Entity();
        mainDude.setName("Bro");
        mainDude.getName();
        primaryStage.setTitle("Far");
        btn = new Button();
        btn.setText("Press this");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                btn.setText(mainDude.getName());
            }
        });

        mainDude.createCharacter(primaryStage, mainDude);


        mainDude.setAttribute(Entity.attributes.STRENGTH,12);
        System.out.println(mainDude.getAttribute(Entity.attributes.STRENGTH));









    }
    */


}