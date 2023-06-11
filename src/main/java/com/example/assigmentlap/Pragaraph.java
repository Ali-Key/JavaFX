package com.example.assigmentlap;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.List;

public class Pragaraph {




        @FXML
        private Button btnrun;

        @FXML
        private Label lbldisplay;

        @FXML
        private Label lbldisplay1;

        @FXML
        private TextArea txtarea;

        @FXML
        private TextField txtfeild;





//        btnrun
    public  void  btnrun (){
        if (txtarea.getText().equals("")){
            lbldisplay.setText("Please Type some text in the text area.");
            lbldisplay1.setText("Which consonant letter are you looking for? ");
            lbldisplay.setTextFill(Color.RED);
            lbldisplay1.setTextFill(Color.RED);
        }
        else {
            int list = txtarea.getText().length();
            System.out.println("list: "+list);

            String line[] = txtarea.getText().split("\\n");
            List<String> lists = Arrays.asList(line);


            String s = "";
            System.out.println(lists);
            for (int i = 0; i < line.length; i++) {
                s += lists.get(i);
                System.out.println(s);
            }


            int vowelcount = s.replaceAll("(?i)[^aeiou]", "").length();


            lbldisplay.setText("We have " + vowelcount + " vowel(s) in the above text.");

            lbldisplay.textFillProperty().setValue(Color.BLACK);
        }


        if (txtfeild.getText().equals("")){
            lbldisplay1.setText("Which consonant letter are you looking for? ");
            lbldisplay1.setTextFill(Color.RED);
        }
        else{
            String line[] = txtarea.getText().split("\\n");
            List<String> lists = Arrays.asList(line);
            String s = "";

            for (int i = 0; i < lists.size(); i++) {
                s += lists.get(i);
            }


            int counter = 0;
            for (int i = 0; i < txtfeild.getLength(); i++) {
                if (txtfeild.getText().charAt(i) != 'a' && txtfeild.getText().charAt(i) != 'A' && txtfeild.getText().charAt(i) != 'E'
                        && txtfeild.getText().charAt(i) != 'e' && txtfeild.getText().charAt(i) != 'I'
                        && txtfeild.getText().charAt(i) != 'i' && txtfeild.getText().charAt(i) != 'O' && txtfeild.getText().charAt(i) != 'o'
                        && txtfeild.getText().charAt(i) != 'U' && txtfeild.getText().charAt(i) != 'u') {
                    counter = countChar(s, txtfeild.getText().charAt(i));

                    lbldisplay1.setText("The letter " + txtfeild.getText() + " repeated " + counter + " time(s) in the above text.");
                    lbldisplay1.setTextFill(Color.BLACK);
                    lbldisplay1.setOpacity(1);
                } else {
                    lbldisplay1.setText("Are you looking for consonants?");
                    lbldisplay1.setTextFill(Color.RED);
                    lbldisplay1.setOpacity(1);
                }

            }
        }
    }


    public int countChar(String str, char c) {
        String check = str.toLowerCase();
        int count = 0;

        for (int j = 0; j < check.length(); j++) {
            if (check.charAt(j) == c)
                count++;
        }

        return count;}












}

