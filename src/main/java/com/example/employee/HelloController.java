package com.example.employee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Member;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    public static Stage pStage;
    @FXML
    private TableView<Member> tbMember;

    @FXML
    private TableColumn<Member, String> tcID;

    @FXML
    private TableColumn<Member, String> tcName;

    @FXML
    private TableColumn<Member, String> tcJobtitle;

    @FXML
    private TableColumn<Member, String> tcGender;

    @FXML
    private TableColumn<Member, String> tcPhone;

    @FXML
    private ObservableList<Member> data;

    @FXML
    private Button btnAdd, btnDelete;

    @FXML
    void handleButtonClick(ActionEvent event){
        if (event.getSource() == btnAdd){
            showDialog("addmember");

        }
        if (event.getSource() == btnDelete){
            showDialog("deletemember");

        }

    }
    private void showDialog(String fxml)
    {
        try {

            Parent load= FXMLLoader.load(getClass().getResource("/fxml/" + fxml + ".fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(load);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setAlwaysOnTop(true);
            stage.setX(pStage.getX() +50);
            stage.show();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //@Override
    //public void initialize(URL url, ResourceBundle resourceBundle) {
       // tcID.setCellFactory(new PropertyValueFactory<>("ID"));
       // tcName.setCellFactory(new PropertyValueFactory<>("Name"));

       // data = FXCollections.observableArrayList(
      //          new Member("RandomMembner", "")


      //  tbMember.setItems(data);
   // }
}


