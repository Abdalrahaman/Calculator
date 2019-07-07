package com.example.pro_abdo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    double Number1 ;
    double Number2 ;

    String flag ;
    int clearFlag = 0;

    TextView showScreen ;
    TextView hintScreen ;
    Button zero ;
    Button one ;
    Button two ;
    Button three ;
    Button four ;
    Button five ;
    Button six ;
    Button seven ;
    Button eight ;
    Button nine ;
    Button add ;
    Button subtract ;
    Button multiply ;
    Button division ;
    Button equal ;
    Button dot ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showScreen = (TextView)findViewById(R.id.showScreen);
        hintScreen = (TextView)findViewById(R.id.hintScreen);

        zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(this);

        one = (Button)findViewById(R.id.one);
        one.setOnClickListener(this);

        two = (Button)findViewById(R.id.two);
        two.setOnClickListener(this);

        three = (Button)findViewById(R.id.three);
        three.setOnClickListener(this);

        four = (Button)findViewById(R.id.four);
        four.setOnClickListener(this);

        five = (Button)findViewById(R.id.five);
        five.setOnClickListener(this);

        six = (Button)findViewById(R.id.six);
        six.setOnClickListener(this);

        seven = (Button)findViewById(R.id.seven);
        seven.setOnClickListener(this);

        eight = (Button)findViewById(R.id.eight);
        eight.setOnClickListener(this);

        nine = (Button)findViewById(R.id.nine);
        nine.setOnClickListener(this);

        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(this);

        subtract = (Button)findViewById(R.id.subtract);
        subtract.setOnClickListener(this);

        multiply = (Button)findViewById(R.id.multiply);
        multiply.setOnClickListener(this);

        division = (Button)findViewById(R.id.division);
        division.setOnClickListener(this);

        equal = (Button)findViewById(R.id.equal);
        equal.setOnClickListener(this);

        dot = (Button)findViewById(R.id.dot);
        dot.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

        String previousValue = "";

        switch (view.getId()){

            case R.id.zero:
                previousValue = showScreen.getText().toString();
              //  Toast.makeText(this, ""+previousValue, Toast.LENGTH_SHORT).show();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("0");
                }else{
                    showScreen.setText(previousValue+"0");
                }
                clearFlag = 0 ;

                break;

            case R.id.one:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("1");
                }else{
                    showScreen.setText(previousValue+"1");
                }
                clearFlag = 0 ;

                break;

            case R.id.two:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("2");
                }else{
                    showScreen.setText(previousValue+"2");
                }
                clearFlag = 0 ;

                break;

            case R.id.three:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("3");
                }else{
                    showScreen.setText(previousValue+"3");
                }
                clearFlag = 0 ;

                break;

            case R.id.four:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("4");
                }else{
                    showScreen.setText(previousValue+"4");
                }
                clearFlag = 0 ;

                break;

            case R.id.five:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("5");
                }else{
                    showScreen.setText(previousValue+"5");
                }
                clearFlag = 0 ;

                break;

            case R.id.six:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("6");
                }else{
                    showScreen.setText(previousValue+"6");
                }
                clearFlag = 0 ;

                break;

            case R.id.seven:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("7");
                }else{
                    showScreen.setText(previousValue+"7");
                }
                clearFlag = 0 ;

                break;

            case R.id.eight:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("8");
                }else{
                    showScreen.setText(previousValue+"8");
                }
                clearFlag = 0 ;

                break;

            case R.id.nine:
                previousValue = showScreen.getText().toString();
                if("0".equals(previousValue) || clearFlag == 1){
                    showScreen.setText("9");
                }else{
                    showScreen.setText(previousValue+"9");
                }
                clearFlag = 0 ;

                break;

            case R.id.add:

                Number1 = Double.parseDouble(showScreen.getText().toString());

                hintScreen.setText(Number1+" +");

                flag = "+";

                clearFlag = 1 ;

                break;

            case R.id.subtract:

                Number1 = Double.parseDouble(showScreen.getText().toString());

                hintScreen.setText(Number1+" -");

                flag = "-";

                clearFlag = 1 ;

                break;

            case R.id.multiply:

                Number1 = Double.parseDouble(showScreen.getText().toString());

                hintScreen.setText(Number1+" *");

                flag = "*";

                clearFlag = 1 ;

                break;

            case R.id.division:

                Number1 = Double.parseDouble(showScreen.getText().toString());

                hintScreen.setText(Number1+" /");

                flag = "/";

                clearFlag = 1 ;

                break;


            case R.id.equal:

                Number2 = Double.parseDouble(showScreen.getText().toString());

                operations(Number1 , Number2);

                hintScreen.setText("");

                clearFlag = 1 ;

                break;


            case R.id.dot:
                previousValue = showScreen.getText().toString();
                showScreen.setText(previousValue+".");
                break;


        }



    }

    public void operations(double number1 , double number2){

        switch (flag){

            case "+":
                showScreen.setText(""+(number1+number2));
                break;

            case "-":
                showScreen.setText(""+(number1-number2));
                break;

            case "*":
                showScreen.setText(""+(number1*number2));
                break;

            case "/":
                showScreen.setText(""+(number1/number2));
                break;

                default:
                    showScreen.setText("Error !!");
                    break;
        }

    }


    public void deleteNumber(View view){

        showScreen.setText("0");
    }
}
