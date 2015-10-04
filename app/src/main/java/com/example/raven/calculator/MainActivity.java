package com.example.raven.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView tv_result;
    TextView tv_sum, tv_op1, tv_op2;

    String  operand1, operand2, sum;
    int  result;

    boolean m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_sum = (TextView) findViewById(R.id.tv_sum);
        tv_op1 = (TextView) findViewById(R.id.tv_op1);
        tv_op2 = (TextView) findViewById(R.id.tv_op2);

        m = true;
        sum="";
        operand1 = "";
        operand2 = "";


    }

    public void onNumberClick(View view)    {
        Button btn = (Button)view;

        tv_result.append(btn.getText().toString());

    }

    public void onOperatorClick(View view)  {
        Button btn = (Button)view;

        if(btn.getText().equals("C"))   {
            tv_sum.setText(btn.getText().toString());
            sum="";
            operand1="";
            operand2="";
            tv_result.setText("0");
            m=true;

            showTest();

            return;
        }

        if(btn.getText().equals("="))   {
            tv_sum.setText(btn.getText().toString());

            sum = tv_result.getText().toString();
/*            result = Integer.parseInt(sum);

            tv_result.setText(""+result);*/


            return;
        }

        if(btn.getText().equals("+"))   {
            tv_result.append(btn.getText().toString());



            showTest();


            return;
        }

        if(btn.getText().equals("-"))   {
            tv_sum.setText(btn.getText().toString());

            return;
        }

        if(btn.getText().equals("*"))   {
            tv_sum.setText(btn.getText().toString());

            return;
        }


    }

    public void toInteger() {
    }

    public void showTest()  {
        tv_op1.setText(operand1);
        tv_op2.setText(operand2);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
