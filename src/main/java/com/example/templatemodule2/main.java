package com.example.templatemodule2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class main extends Application {
    static public char userType = 'u';
    public static void switchScene (Stage stage,  String s) throws IOException {
        /*FXMLLoader subManagment = new FXMLLoader(runApplication.class.getResource("subModule.fxml"));
        FXMLLoader courManagment = new FXMLLoader(runApplication.class.getResource("courModule.fxml"));
        FXMLLoader studManagment = new FXMLLoader(runApplication.class.getResource("studModule.fxml"));
        FXMLLoader facManagment = new FXMLLoader(runApplication.class.getResource("facModule.fxml"));
        FXMLLoader evenManagment = new FXMLLoader(runApplication.class.getResource("evenModule.fxml"));
        FXMLLoader logModule = new FXMLLoader(runApplication.class.getResource("logModule.fxml"));

        //Scene subManagmentScene = new Scene(subManagment.load());
        //Scene courManagmentScene = new Scene(courManagment.load());
        //Scene studManagmentScene = new Scene(studManagment.load());
        //Scene facManagmentScene = new Scene(facManagment.load());
        //Scene evenManagmentScene = new Scene(evenManagment.load());
        Scene logModuleScene = new Scene(logModule.load());

        if (s == "subjectManagement")
        {
            stage.setTitle("subjectManagment");
            stage.setScene(subManagment);
            stage.show();
        }
        if (s == "courseManagment")
        {
            stage.setTitle("courseManagment");
            stage.setScene(courManagment);
            stage.show();
        }
        if (s == "studentManagement")
        {
            stage.setTitle("studentManagement");
            stage.setScene(studManagment);
            stage.show();
        }
        if (s == "facuiltyManagment")
        {
            stage.setTitle("facuiltyManagment");
            stage.setScene(facManagment);
            stage.show();
        }
        if (s == "eventManagment")
        {
            stage.setTitle("eventManagment");
            stage.setScene(evenManagment);
            stage.show();
        }
        if (s == "loginModule")
        {
            stage.setTitle("loginModule");
            stage.setScene(logModule);
            stage.show();
        }

 */
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("Module.fxml"));
        unknownController controller = new unknownController();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("moduleName");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}