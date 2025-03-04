package com.example.templatemodule2;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class unknownController  implements Initializable {
    boolean firstEntry = false;
    @FXML
    public Label userTypeLabel;
    @FXML
    public TextField searchTextField;
    @FXML
    public Label labelOne;
    @FXML
    public Label labelTwo;
    @FXML
    public Label labelThree;
    @FXML
    public Label labelFour;
    @FXML
    public Label labelFive;
    @FXML
    public Label labelSix;
    @FXML
    public Label labelSeven;
    @FXML
    public Label labelEight;
    @FXML
    public Label labelNine;
    @FXML
    public Label labelTen;
    @FXML
    public Label labelEleven;
    @FXML
    public Label labelTweleve;
    @FXML
    public Label labelThirteen;
    @FXML
    public Label labelFourteen;


    @FXML
    public Label[] infoList = new Label[14];

    public unknownController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        infoList[0] = labelOne;
        infoList[1] = labelTwo;
        infoList[2] = labelThree;
        infoList[3] = labelFour;
        infoList[4] = labelFive;
        infoList[5] = labelSix;
        infoList[6] = labelSeven;
        infoList[7] = labelEight;
        infoList[8] = labelNine;
        infoList[9] = labelTen;
        infoList[10] = labelEleven;
        infoList[11] = labelTweleve;
        infoList[12] = labelThirteen;
        infoList[13] = labelFourteen;

        for (int i = 0; i < 14; i++)
        {
            infoList[i].setText(i + "");
        }
    }


    @FXML
    protected void onSubjectManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "subjectManagment");
    }
    @FXML
    protected void onCourseManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "courseManagment");
    }
    @FXML
    protected void onStudentManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "studentManagment");
    }
    @FXML
    protected void onFacuiltyManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "facuiltyManagment");
    }
    @FXML
    protected void onEventManagmentButton() throws IOException {
        Stage currentStage = (Stage) userTypeLabel.getScene().getWindow();
        main.switchScene(currentStage, "eventManagment");
    }

    @FXML
    protected void onFeatureButtonOne()
    {
        userTypeLabel.setText("hello");
    }

    @FXML
    protected void onSearchButton()
    {
        String name ="";
        name = searchTextField.getText();
        String candidates[] = new String[14];
        int canHolder = 0;
        for (int i = 0; i < main.facuilties.length; i++)
        {
            if (name.equals(main.facuilties[i].name))
            {
                candidates[canHolder] = name;
                canHolder++;
            }
        }
        for (int i = 0; i < 14; i++)
        {
            infoList[i].setText(candidates[i]);
        }

    }

}
