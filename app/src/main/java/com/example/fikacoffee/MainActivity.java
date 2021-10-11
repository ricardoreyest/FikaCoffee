package com.example.fikacoffee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.fikacoffee.adapter.CoffeeAdapter;
import com.example.fikacoffee.model.Coffee;
import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity
{
    private MaterialToolbar toolbar;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Soporte barra
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        recyclerView = findViewById(R.id.main_recycler);

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        lm.setOrientation(RecyclerView.VERTICAL);

        CoffeeAdapter adapter = new CoffeeAdapter(MainActivity.this,R.layout.item_coffee, Coffee.coffeeList());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

    }

    //Representación de la barra
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    //Eventos de la barra
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.main_menu_option1:
                Toast.makeText(MainActivity.this,"Option 1",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}