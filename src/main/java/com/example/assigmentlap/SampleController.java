package com.example.assigmentlap;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

public class SampleController implements Initializable {


    @FXML
    private Button COPYITEM;

    @FXML
    private Button COPYITEMS;

    @FXML
    private ListView<String> lv;

    @FXML
    private TextArea ta;
    @FXML
    private Button CLEAR;


    String[] names = {"Ali", "Mohamed", "Ayan"};

    public void COPYITEM(){
        String s = lv.getSelectionModel().getSelectedItem();
        ta.appendText(s + "\n");
    }
    public void COPYITMES(){
        String s1 = "";
        ObservableList<String> list = lv.getSelectionModel().getSelectedItems();
        for(String item : list){
            ta.appendText(item + "\n");
            s1 += item + "\n";
        }
        ta.setText(s1);
    }
    public void CLEAR(){
        ta.clear();
    }
    public  void moveitem (){
        ObservableList<String> list = lv.getSelectionModel().getSelectedItems();
        for(String item : list){
            ta.appendText(item + "\n");
            lv.getItems().remove(item);
        }
    }
    public void moveitems(){
        ObservableList<String> list = lv.getSelectionModel().getSelectedItems();
        for(String item : list){
            ta.appendText(item + "\n");
            lv.getItems().remove(item);
        }
    }
    public void returnitem(){
        String s = ta.getText();
        lv.getItems().add(s);
    }

    public void returnitems(){
        String s = ta.getText();
        lv.getItems().add(s);
    }



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        lv.getItems().addAll(names);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }


}
