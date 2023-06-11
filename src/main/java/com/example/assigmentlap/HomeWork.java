package com.example.assigmentlap;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeWork implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
    @FXML
    private Button btnMoveItem;

    @FXML
    private Button btnMoveItems;

    @FXML
    private Button btnRetrunItem;

    @FXML
    private Button btnRetrunItems;

    @FXML
    private Button btnadd;

    @FXML
    private Label lblListViewCount;

    @FXML
    private Label lblListViewCount1;

    @FXML
    private ListView<String > listview;

    @FXML
    private ListView<String> listview1;

    @FXML
    private TextField txtfield;




//    btnadd
    public void btnadd(){



        if(txtfield.getText().isEmpty() || txtfield.getText().matches("[0-9]+") ){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error  ");
                alert.setHeaderText("Error ");
                alert.setContentText("Please enter a valid name in the textfield and not a number ");

                alert.showAndWait();
            }
        else {

            String s = txtfield.getText();
            listview.getItems().add(s);


            int count = listview.getItems().size();
            lblListViewCount.setText("Number of items in the listview: " + count);

            int count1 = listview1.getItems().size();
            lblListViewCount1.setText("Number of items in the listview: " + count1);






        }
        txtfield.clear();

        }




//    btnmoveItem
    public void btnMoveItem(){

        String s1 =  listview.getSelectionModel().getSelectedItem();

        if(s1.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error  ");
            alert.setHeaderText("Error ");


            alert.showAndWait();
        }
        else {

            listview1.getItems().add(s1);
            listview.getItems().remove(s1);
            int count = listview.getItems().size();

            lblListViewCount.setText("Number of items in the listview: " + count);

            int count1 = listview1.getItems().size();
            lblListViewCount1.setText("Number of items in the listview: " + count1);


        }
    }

    //    btnMoveItems

    public void btnMoveItems(){

        String s1 =  listview.getSelectionModel().getSelectedItem();

            listview1.getItems().add(s1);
            listview.getItems().remove(s1);


        int count = listview.getItems().size();
        lblListViewCount.setText("Number of items in the listview  : " + count);

        int count1 = listview1.getItems().size();
        lblListViewCount1.setText("Number of items in the listview: " + count1);




    }





//    btnRetrunItem
    public void btnRetrunItem(){

        String s1 =  listview1.getSelectionModel().getSelectedItem();

            listview.getItems().add(s1);
            listview1.getItems().remove(s1);


        int count = listview.getItems().size();
        lblListViewCount.setText("Number of items in the listview: " + count);

        int count1 = listview1.getItems().size();
        lblListViewCount1.setText("Number of items in the listview: " + count1);



    }


//    btnRetrunItems
    public void btnRetrunItems(){

        String s1 =  listview1.getSelectionModel().getSelectedItem();



            listview.getItems().add(s1);
            listview1.getItems().remove(s1);


        int count = listview.getItems().size();
        lblListViewCount.setText("Number of items in the listview: " + count);

        int count1 = listview1.getItems().size();
        lblListViewCount1.setText("Number of items in the listview: " + count1);




    }






}

