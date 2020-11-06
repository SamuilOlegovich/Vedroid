package com.vedroid;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onButtonClick(View v) {
        // EditText - служит для работы с полями
        // взяли нужное поле и поместили его в EditText
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        // подключаем поле результата
        TextView resText = (TextView)findViewById(R.id.Result);
        // получаеим значения из полей
        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;

        // закидываем результат в поле результат)))
        resText.setText(Integer.toString(resSum));
    }
}