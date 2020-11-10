package com.vedroid;


import androidx.appcompat.app.AppCompatActivity;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    private Button  button, nextButton, alert;
    private EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerButton();
    }



    // срабатывает при нажатии на любые кнопки,
    // посему button.setOnClickListener - как бы проверяем на какую именно кнопку мы нажали
    public void addListenerButton() {
        // находим и назначаем поле
        password = (EditText) findViewById(R.id.editTextPassword);
        // находим и назначаем кнопку
        alert = (Button) findViewById(R.id.alert);
        button = (Button) findViewById(R.id.button);
        nextButton = (Button) findViewById(R.id.nextButton);

        // добавляем обработчика событий енопке
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // если я хочу чтобы на кнопке менялся текст
                        button.setText("Done");
                        // меняет цвет кнопки
                        button.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                        // добавляем всплывающее окно
                        Toast.makeText(
                                // указываем с какой именно страницей мы работаем,
                                // что хотим отоброзить
                                // как долго будет отобразаться всплывающее окно
                                MainActivity.this, password.getText(), Toast.LENGTH_SHORT
                        ).show(); // открывает и сразу показывает всплывающее окно
                    }
                }
        );
        nextButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // меняет цвет кнопки
                        button.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                        // добавляем всплывающее окно
                        Toast.makeText(
                                // указываем с какой именно страницей мы работаем,
                                // что хотим отоброзить
                                // как долго будет отобразаться всплывающее окно
                                MainActivity.this, "We restart all", Toast.LENGTH_SHORT
                        ).show(); // открывает и сразу показывает всплывающее окно
                    }
                }
        );
        alert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                    }
                }
        );
    }



    public void onButtonClick(View v) {
        // EditText - служит для работы с полями
        // взяли нужное поле и поместили его в EditText
//        EditText el1 = (EditText)findViewById(R.id.Num1);
//        EditText el2 = (EditText)findViewById(R.id.Num2);
        // подключаем поле результата
//        TextView resText = (TextView)findViewById(R.id.Result);
        // получаеим значения из полей
//        int num1 = Integer.parseInt(el1.getText().toString());
//        int num2 = Integer.parseInt(el2.getText().toString());
//        int resSum = num1 + num2;

        // закидываем результат в поле результат)))
//        resText.setText(Integer.toString(resSum));
    }
}