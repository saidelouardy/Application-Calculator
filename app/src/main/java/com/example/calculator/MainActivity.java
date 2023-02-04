package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Scriptable;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView textecrit , textresult;
    MaterialButton buttondelet , buttonplus , buttonmoin , buttonegale , buttonleft , buttondivisie ,buttonfoux;
    MaterialButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textecrit=findViewById(R.id.textecrit);
        textresult=findViewById(R.id.textresult);
        btt(buttondelet,R.id.buttondelet);
        btt(buttonplus,R.id.buttonplus);
        btt(buttonmoin,R.id.buttonmoin);
        btt(buttonegale,R.id.buttonegale);
        btt(buttonleft,R.id.buttonleft);
        btt(buttondivisie,R.id.buttondivise);
        btt(buttonfoux,R.id.buttonfoux);
        btt(button0,R.id.button0);
        btt(button1,R.id.button1);
        btt(button2,R.id.button2);
        btt(button3,R.id.button3);
        btt(button4,R.id.button4);
        btt(button5,R.id.button5);
        btt(button6,R.id.button6);
        btt(button7,R.id.button7);
        btt(button8,R.id.button8);
        btt(button9,R.id.button9);


    }
    public void btt(MaterialButton btn , int id){
        btn =findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        MaterialButton button = (MaterialButton) v;
        String textb = button.getText().toString();
        String datacalcult =textecrit.getText().toString();
        datacalcult = datacalcult+textb;
        if(textb.equals("C")){
            textecrit.setText("");
            textresult.setText("0");
            return;
        }
        if(textb.equals("=")){
            textresult.setText(textecrit.getText());
            return;
        }

        textecrit.setText(datacalcult);
        String finalResult = getreslt(datacalcult);
        if(!finalResult.equals("er")){
            textresult.setText(finalResult);
        }
    }
    String getreslt(String data){
        try{
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initSafeStandardObjects();
            String finalResult = context.evaluateString(scriptable,data,"JavaScript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
            }
            return finalResult;
        }catch(Exception e){
            return "er";
        }
    }
}