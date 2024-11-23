package com.example.xo_multi_layer_perceptron_algorithm;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HelloController {
    static final double ALPHA = 0.000000001;
    static double [] hiddenNeurons;
    static double [][] inputHiddenWeight;
    static double [] inputHiddenBias;
    static double [] inputHiddenNetInput;
    static double [] hiddenOutPutWeight;
    static double [] hiddenOutputBias;
    static double [] inputHiddenDelta;
    static double [] hiddenOutputDelta;
    static double [] inputHiddenWeightDifference;
    static double [] hiddenOutputWeightDifference;
    static double maximumInputHiddenWeightDifference;
    static double maximumHiddenOutputWeightDifference;


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btn16;
    public Button btn17;
    public Button btn18;
    public Button btn19;
    public Button btn20;
    public Button btn21;
    public Button btn22;
    public Button btn23;
    public Button btn24;
    public Button btn25;
    public Label result;
    public Button btnClear;
    public Button btnGo;
    public Button btnTraining;


    public void btn1Clicked(ActionEvent actionEvent) {
        if (btn1.getText().equals("*")) {
            btn1.setText("");
        } else {
            btn1.setText("*");
        }
    }

    public void btn2Clicked(ActionEvent actionEvent) {
        if (btn2.getText().equals("*")) {
            btn2.setText("");
        } else {
            btn2.setText("*");
        }
    }

    public void btn3Clicked(ActionEvent actionEvent) {
        if (btn3.getText().equals("*")) {
            btn3.setText("");
        } else {
            btn3.setText("*");
        }
    }

    public void btn4Clicked(ActionEvent actionEvent) {
        if (btn4.getText().equals("*")) {
            btn4.setText("");
        } else {
            btn4.setText("*");
        }
    }

    public void btn5Clicked(ActionEvent actionEvent) {
        if (btn5.getText().equals("*")) {
            btn5.setText("");
        } else {
            btn5.setText("*");
        }
    }

    public void btn6Clicked(ActionEvent actionEvent) {
        if (btn6.getText().equals("*")) {
            btn6.setText("");
        } else {
            btn6.setText("*");
        }
    }

    public void btn7Clicked(ActionEvent actionEvent) {
        if (btn7.getText().equals("*")) {
            btn7.setText("");
        } else {
            btn7.setText("*");
        }
    }

    public void btn8Clicked(ActionEvent actionEvent) {
        if (btn8.getText().equals("*")) {
            btn8.setText("");
        } else {
            btn8.setText("*");
        }
    }

    public void btn9Clicked(ActionEvent actionEvent) {
        if (btn9.getText().equals("*")) {
            btn9.setText("");
        } else {
            btn9.setText("*");
        }
    }

    public void btn10Clicked(ActionEvent actionEvent) {
        if (btn10.getText().equals("*")) {
            btn10.setText("");
        } else {
            btn10.setText("*");
        }
    }

    public void btn11Clicked(ActionEvent actionEvent) {
        if (btn11.getText().equals("*")) {
            btn11.setText("");
        } else {
            btn11.setText("*");
        }
    }

    public void btn12Clicked(ActionEvent actionEvent) {
        if (btn12.getText().equals("*")) {
            btn12.setText("");
        } else {
            btn12.setText("*");
        }
    }

    public void btn13Clicked(ActionEvent actionEvent) {
        if (btn13.getText().equals("*")) {
            btn13.setText("");
        } else {
            btn13.setText("*");
        }
    }

    public void btn14Clicked(ActionEvent actionEvent) {
        if (btn14.getText().equals("*")) {
            btn14.setText("");
        } else {
            btn14.setText("*");
        }
    }

    public void btn15Clicked(ActionEvent actionEvent) {
        if (btn15.getText().equals("*")) {
            btn15.setText("");
        } else {
            btn15.setText("*");
        }
    }

    public void btn16Clicked(ActionEvent actionEvent) {
        if (btn16.getText().equals("*")) {
            btn16.setText("");
        } else {
            btn16.setText("*");
        }
    }

    public void btn17Clicked(ActionEvent actionEvent) {
        if (btn17.getText().equals("*")) {
            btn17.setText("");
        } else {
            btn17.setText("*");
        }
    }

    public void btn18Clicked(ActionEvent actionEvent) {
        if (btn18.getText().equals("*")) {
            btn18.setText("");
        } else {
            btn18.setText("*");
        }
    }

    public void btn19Clicked(ActionEvent actionEvent) {
        if (btn19.getText().equals("*")) {
            btn19.setText("");
        } else {
            btn19.setText("*");
        }
    }

    public void btn20Clicked(ActionEvent actionEvent) {
        if (btn20.getText().equals("*")) {
            btn20.setText("");
        } else {
            btn20.setText("*");
        }
    }

    public void btn21Clicked(ActionEvent actionEvent) {
        if (btn21.getText().equals("*")) {
            btn21.setText("");
        } else {
            btn21.setText("*");
        }
    }

    public void btn22Clicked(ActionEvent actionEvent) {
        if (btn22.getText().equals("*")) {
            btn22.setText("");
        } else {
            btn22.setText("*");
        }
    }

    public void btn23Clicked(ActionEvent actionEvent) {
        if (btn23.getText().equals("*")) {
            btn23.setText("");
        } else {
            btn23.setText("*");
        }
    }

    public void btn24Clicked(ActionEvent actionEvent) {
        if (btn24.getText().equals("*")) {
            btn24.setText("");
        } else {
            btn24.setText("*");
        }
    }

    public void btn25Clicked(ActionEvent actionEvent) {
        if (btn25.getText().equals("*")) {
            btn25.setText("");
        } else {
            btn25.setText("*");
        }
    }

    public void btnGoClicked(ActionEvent actionEvent) throws IOException {
        String final_result = input_array_calculate();
        result.setText(final_result);

    }

    public void btnClearClicked(ActionEvent actionEvent) {
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        btn10.setText(" ");
        btn11.setText(" ");
        btn12.setText(" ");
        btn13.setText(" ");
        btn14.setText(" ");
        btn15.setText(" ");
        btn16.setText(" ");
        btn17.setText(" ");
        btn18.setText(" ");
        btn19.setText(" ");
        btn20.setText(" ");
        btn21.setText(" ");
        btn22.setText(" ");
        btn23.setText(" ");
        btn24.setText(" ");
        btn25.setText(" ");
        result.setText(" ");
    }

    public void btnTrainingClicked(ActionEvent actionEvent) {
        training();
    }

    public String input_array_calculate() throws IOException {
        double[][] input_array = new double[5][5];
        if (btn1.getText().equals("*")) {
            input_array[0][0] = 1;
        } else {
            input_array[0][0] = -1;
        }
        if (btn2.getText().equals("*")) {
            input_array[1][0] = 1;
        } else {
            input_array[1][0] = -1;
        }
        if (btn3.getText().equals("*")) {
            input_array[2][0] = 1;
        } else {
            input_array[2][0] = -1;
        }
        if (btn4.getText().equals("*")) {
            input_array[3][0] = 1;
        } else {
            input_array[3][0] = -1;
        }
        if (btn5.getText().equals("*")) {
            input_array[4][0] = 1;
        } else {
            input_array[4][0] = -1;
        }
        if (btn6.getText().equals("*")) {
            input_array[0][1] = 1;
        } else {
            input_array[0][1] = -1;
        }
        if (btn7.getText().equals("*")) {
            input_array[1][1] = 1;
        } else {
            input_array[1][1] = -1;
        }
        if (btn8.getText().equals("*")) {
            input_array[2][1] = 1;
        } else {
            input_array[2][1] = -1;
        }
        if (btn9.getText().equals("*")) {
            input_array[3][1] = 1;
        } else {
            input_array[3][1] = -1;
        }
        if (btn10.getText().equals("*")) {
            input_array[4][1] = 1;
        } else {
            input_array[4][1] = -1;
        }
        if (btn11.getText().equals("*")) {
            input_array[0][2] = 1;
        } else {
            input_array[0][2] = -1;
        }
        if (btn12.getText().equals("*")) {
            input_array[1][2] = 1;
        } else {
            input_array[1][2] = -1;
        }
        if (btn13.getText().equals("*")) {
            input_array[2][2] = 1;
        } else {
            input_array[2][2] = -1;
        }
        if (btn14.getText().equals("*")) {
            input_array[3][2] = 1;
        } else {
            input_array[3][2] = -1;
        }
        if (btn15.getText().equals("*")) {
            input_array[4][2] = 1;
        } else {
            input_array[4][2] = -1;
        }
        if (btn16.getText().equals("*")) {
            input_array[0][3] = 1;
        } else {
            input_array[0][3] = -1;
        }
        if (btn17.getText().equals("*")) {
            input_array[1][3] = 1;
        } else {
            input_array[1][3] = -1;
        }
        if (btn18.getText().equals("*")) {
            input_array[2][3] = 1;
        } else {
            input_array[2][3] = -1;
        }
        if (btn19.getText().equals("*")) {
            input_array[3][3] = 1;
        } else {
            input_array[3][3] = -1;
        }

        if (btn20.getText().equals("*")) {
            input_array[4][3] = 1;
        } else {
            input_array[4][3] = -1;
        }
        if (btn21.getText().equals("*")) {
            input_array[0][4] = 1;
        } else {
            input_array[0][4] = -1;
        }
        if (btn22.getText().equals("*")) {
            input_array[1][4] = 1;
        } else {
            input_array[1][4] = -1;
        }
        if (btn23.getText().equals("*")) {
            input_array[2][4] = 1;
        } else {
            input_array[2][4] = -1;
        }
        if (btn24.getText().equals("*")) {
            input_array[3][4] = 1;
        } else {
            input_array[3][4] = -1;
        }
        if (btn25.getText().equals("*")) {
            input_array[4][4] = 1;
        } else {
            input_array[4][4] = -1;
        }

        String isXO = "";

        double result = multi_layer_perceptron(input_array);
        isXO = String.valueOf(result);
        return isXO;

    }




    public static void training() {
//        reading the data from the file
        Random random = new Random();
        String fileName = "xo-data-for-bardi.txt"; // Replace with your file name
        List<double[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split("\\s+"); // Split by whitespace
                double[] row = new double[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    row[i] = Float.parseFloat(numbers[i]);
                }
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Convert the List to a 2D array if needed
        double[][] vectors = data.toArray(new double[data.size()][]);
        hiddenNeurons = new double[25];
        inputHiddenWeight = new double[vectors[0].length - 1][hiddenNeurons.length];
        inputHiddenBias = new double[hiddenNeurons.length];
        hiddenOutPutWeight = new double[hiddenNeurons.length];
        hiddenOutputBias = new double[1];
        hiddenOutputDelta = new double[1];
        inputHiddenWeightDifference = new double[vectors[0].length - 1];
        hiddenOutputWeightDifference = new double[hiddenNeurons.length];
        inputHiddenNetInput = new double[hiddenNeurons.length];
        Arrays.fill(inputHiddenNetInput , 0);
        inputHiddenDelta = new double[vectors[0].length];
        double totalEpoch = 0;


        for(int rowIndex = 0 ; rowIndex < inputHiddenWeight.length ; rowIndex++){
            for(int colIndex = 0 ; colIndex < inputHiddenWeight[0].length; colIndex++){
                inputHiddenWeight[rowIndex][colIndex] = random.nextDouble(1) ;
            }
        }

        for(int index = 0 ; index < inputHiddenBias.length ; index++){
            inputHiddenBias[index] = random.nextDouble(1);
        }

        for (int i = 0 ; i < hiddenOutPutWeight.length; i++){
            hiddenOutPutWeight[i] = random.nextDouble(1);
        }

        hiddenOutputBias[0] = random.nextDouble(1);
        maximumInputHiddenWeightDifference = inputHiddenWeightDifference[0];
        maximumHiddenOutputWeightDifference = hiddenOutputWeightDifference[0];

        while (true){
            for(int epochLength = 0 ; epochLength < vectors.length ; epochLength++){
                double [] vector = vectors[epochLength];
                for(int i = 0 ; i < vector.length - 1 ; i++){
                    for(int j = 0 ; j < hiddenNeurons.length; j++){
                        inputHiddenNetInput[i] += vector[j] * inputHiddenWeight[i][j];
                    }
                    inputHiddenNetInput[i] += inputHiddenBias[i];
                    double f = activation_function(inputHiddenNetInput[i]);
                    hiddenNeurons[i] = f;
                }

                double outputNetInput = 0;
                for(int j = 0 ; j < hiddenNeurons.length; j++){
                    outputNetInput += hiddenNeurons[j] * hiddenOutPutWeight[j];
                }
                outputNetInput += hiddenOutputBias[0];
                double f = activation_function(outputNetInput);
                hiddenOutputDelta[0]= (vector[vector.length - 1] - f) * derivative_function(outputNetInput);

                for(int j = 0 ; j < hiddenNeurons.length ; j++){
                    double Dj = 0;
                    for(int k = 0 ; k < 1 ; k++){
                        Dj += hiddenOutputDelta[k] * hiddenOutPutWeight[j];
                    }
                    inputHiddenDelta[j] = Dj * derivative_function(hiddenNeurons[j]);
                }


                for(int j = 0 ; j < hiddenOutputWeightDifference.length ; j++){
                    hiddenOutputWeightDifference[j] = ALPHA * hiddenOutputDelta[0] * inputHiddenNetInput[j];
                    hiddenOutPutWeight[j] += hiddenOutputWeightDifference[j];
                }
                hiddenOutputBias [0] += hiddenOutputBias[0] * ALPHA;

                for(int i = 0 ; i < vector.length -1 ; i++){
                    for(int j = 0 ; j < hiddenNeurons.length ; j++){
                        inputHiddenWeightDifference[j] = ALPHA * hiddenOutputDelta[0] * inputHiddenNetInput[j];
                        inputHiddenWeight[i][j] += inputHiddenWeightDifference[j];
                    }
                    inputHiddenBias[i]+= ALPHA * inputHiddenDelta[i];
                }


                for(int i = 0 ; i < inputHiddenWeightDifference.length ; i++){
                    if(inputHiddenWeightDifference[i] > maximumInputHiddenWeightDifference){
                        maximumInputHiddenWeightDifference = inputHiddenWeightDifference[i];
                    }
                }


                for(int i = 0 ; i < hiddenOutputWeightDifference.length ; i++){
                    if(hiddenOutputWeightDifference[i] > maximumHiddenOutputWeightDifference){
                        maximumHiddenOutputWeightDifference = hiddenOutputWeightDifference[i];
                    }
                }












            }



            totalEpoch += 1;
            if((maximumInputHiddenWeightDifference < 0.00001) && (maximumHiddenOutputWeightDifference < 0.00001)){
                System.out.println("Training Finished!!!");
                System.out.println("Total epochs are: " + totalEpoch);
                break;
            }


        }

//        declare total epoch



//



















    }




    private double multi_layer_perceptron(double[][] inputArray) {
        double [] inputs = new double[25];
        for(int r = 0 ; r < 5 ; r++){
            for(int c=0 ; c < 5 ; c++){
                inputs[r*5 + c] = inputArray[r][c];
            }
        }
        for (int i = 0; i< hiddenNeurons.length; i++){
            System.out.print(hiddenNeurons[i] + " ");
        }

        for(int i = 0 ; i < inputs.length ; i++){
            for(int j = 0 ; j < hiddenNeurons.length; j++){
                inputHiddenNetInput[i] += inputs[i] * inputHiddenWeight[i][j];
            }
            inputHiddenNetInput[i] += inputHiddenBias[i];
            double f = activation_function(inputHiddenNetInput[i]);
            hiddenNeurons [i] = f;
        }

        double net_input = 0;
        for(int i = 0; i < hiddenNeurons.length; i++){
            net_input += hiddenOutPutWeight[i] * hiddenNeurons[i];

        }
        net_input += hiddenOutputBias[0];


        double f = activation_function(net_input);
        f = Math.round(f);
        return f;




    }


    public static double activation_function(double net_input){
        double result = (double) 1 / (1 + (Math.pow(Math.E, (net_input * (-1)))) );
        System.out.println("The y is: " + result);
        return  result;
    }

    public static double derivative_function(double net_input){
        double result_activation_function = activation_function(net_input);
        double result = result_activation_function * (1 - result_activation_function);
        System.out.println("The derivative of y is: " + result);
        return result ;
    }















    public void btn1Entered(MouseEvent mouseEvent) {
        btn1.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn1Exited(MouseEvent mouseEvent) {
        btn1.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn2Entered(MouseEvent mouseEvent) {
        btn2.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn2Exited(MouseEvent mouseEvent) {
        btn2.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn3Entered(MouseEvent mouseEvent) {
        btn3.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn3Exited(MouseEvent mouseEvent) {
        btn3.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn4Entered(MouseEvent mouseEvent) {
        btn4.setStyle("--fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn5Entered(MouseEvent mouseEvent) {
        btn5.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn5Exited(MouseEvent mouseEvent){
        btn5.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");

    }

    public void btn4Exited(MouseEvent mouseEvent) {
        btn4.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn6Entered(MouseEvent mouseEvent) {
        btn6.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn6Exited(MouseEvent mouseEvent) {
        btn6.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn7Exited(MouseEvent mouseEvent) {
        btn7.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn7Entered(MouseEvent mouseEvent) {
        btn7.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn8Entered(MouseEvent mouseEvent) {
        btn8.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn8Exited(MouseEvent mouseEvent) {
        btn8.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn9Entered(MouseEvent mouseEvent) {
        btn9.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn9Exited(MouseEvent mouseEvent) {
        btn9.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn10Entered(MouseEvent mouseEvent) {
        btn10.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn10Exited(MouseEvent mouseEvent) {
        btn10.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn11Entered(MouseEvent mouseEvent) {
        btn11.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn11Exited(MouseEvent mouseEvent) {
        btn11.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn12Entered(MouseEvent mouseEvent) {
        btn12.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn12Exited(MouseEvent mouseEvent) {
        btn12.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn13Entered(MouseEvent mouseEvent) {
        btn13.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn13Exited(MouseEvent mouseEvent) {
        btn13.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn14Exited(MouseEvent mouseEvent) {
        btn14.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn14Entered(MouseEvent mouseEvent) {
        btn14.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn15Entered(MouseEvent mouseEvent) {
        btn15.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn15Exited(MouseEvent mouseEvent) {
        btn15.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn16Entered(MouseEvent mouseEvent) {
        btn16.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn16Exited(MouseEvent mouseEvent) {
        btn16.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn17Entered(MouseEvent mouseEvent) {
        btn17.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn17Exited(MouseEvent mouseEvent) {
        btn17.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn18Entered(MouseEvent mouseEvent) {
        btn18.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn18Exited(MouseEvent mouseEvent) {
        btn18.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn19Entered(MouseEvent mouseEvent) {
        btn19.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn19Exited(MouseEvent mouseEvent) {
        btn19.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn20Entered(MouseEvent mouseEvent) {
        btn20.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn20Exited(MouseEvent mouseEvent) {
        btn20.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn21Entered(MouseEvent mouseEvent) {
        btn21.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn21Exited(MouseEvent mouseEvent) {
        btn21.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn22Entered(MouseEvent mouseEvent) {
        btn22.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn22Exited(MouseEvent mouseEvent) {
        btn22.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn23Entered(MouseEvent mouseEvent) {
        btn23.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn23Exited(MouseEvent mouseEvent) {
        btn23.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn24Entered(MouseEvent mouseEvent) {
        btn24.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn24Exited(MouseEvent mouseEvent) {
        btn24.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn25Entered(MouseEvent mouseEvent) {
        btn25.setStyle("-fx-background-color: #c8cdcf; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btn25Exited(MouseEvent mouseEvent) {
        btn25.setStyle("-fx-background-color: #D4F6FF; -fx-pref-width: 100; -fx-pref-height:100;");
    }

    public void btnClearEntered(MouseEvent mouseEvent) {
        btnClear.setStyle("-fx-background-color: #ffb7a1; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnClearExited(MouseEvent mouseEvent) {
        btnClear.setStyle("-fx-background-color: #F87A53; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnGoEntered(MouseEvent mouseEvent) {
        btnGo.setStyle("-fx-background-color: #daf7dc; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnGoExited(MouseEvent mouseEvent) {
        btnGo.setStyle("-fx-background-color: #C2FFC7; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnTrainingEntered(MouseEvent mouseEvent) {
        btnTraining.setStyle("-fx-background-color: #fffaed; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;");
    }

    public void btnTrainingExited(MouseEvent mouseEvent) {
        btnTraining.setStyle("-fx-background-color: #F5E8C7; -fx-pref-width: 100; -fx-pref-height:100; -fx-font-weight: bold;" );
    }


















}