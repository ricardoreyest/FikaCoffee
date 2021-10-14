package com.example.fikacoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fikacoffee.model.Coffee;
import com.google.android.material.card.MaterialCardView;

public class DetailActivity extends AppCompatActivity
{
    private ImageView imageView;
    private TextView txt_name, txt_description;
    private MaterialCardView color;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.detail_image);
        txt_name = findViewById(R.id.detail_name);
        txt_description = findViewById(R.id.detail_description);
        color=findViewById(R.id.detail_card);

        String name = getIntent().getStringExtra(MainActivity.NAME_COFFEE);
        Coffee coffee = Coffee.findCoffee(name);

        imageView.setImageResource(coffee.getImage());
        txt_name.setText(coffee.getName());
        txt_description.setText(coffee.getDescription());
        color.setCardBackgroundColor(coffee.getColor());
    }
}