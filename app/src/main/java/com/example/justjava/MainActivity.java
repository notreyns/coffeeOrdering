package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        int price= quantity*3;
        String priceMessage= price+" dollars for "+ quantity+" cups of coffees. Pay up";
        displayMessage(priceMessage);
    }
    int quantity=0;
    public void increment(View view){
        quantity++;
        display(quantity);
    }
    public void decrement(View view){
        quantity--;
        display(quantity);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void display(int number){
        TextView quantityTextView =(TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText(" "+ number);
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}