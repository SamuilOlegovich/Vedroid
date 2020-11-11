package com.vedroid;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    private Button  button, nextButton, alert;
    private EditText password;
    private TextView textShow;
    private RatingBar rating;


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
        nextButton = (Button) findViewById(R.id.nextButton);
        rating = (RatingBar) findViewById(R.id.ratingBar);
        textShow = (TextView) findViewById(R.id.rating);
        button = (Button) findViewById(R.id.button);
        alert = (Button) findViewById(R.id.alert);

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
                // Окна с вопросом и действиями
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Строитель окон
                        // указываем с какой именно страницей мы работаем
                        AlertDialog.Builder aBuilder = new AlertDialog.Builder(MainActivity.this);
                        // указываем нужное нам сообщение
                        aBuilder.setMessage("Do you want to quit close the application?")
                                // можем ли мы отменить это окно
                                .setCancelable(false)
                                // кнопка да закрывает программу
                                // далее делаем событие которое отслеживает и реагирует на нажатие этой кнопки
                                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                    }
                                })
                                // кнопка нет закрывает всплывающее окно
                                // далее делаем событие которое отслеживает и реагирует на нажатие этой кнопки
                                .setNegativeButton("NOT", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        // создание диалогового окна
                        AlertDialog alert = aBuilder.create();
                        // заголовок всплывающего окна
                        alert.setTitle("Сlosing the program");
                        // активируем показ окна
                        alert.show();
                    }
                }
        );
        // срабатывает при изменении рейтинга
        rating.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        textShow.setText(String.valueOf(rating));
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