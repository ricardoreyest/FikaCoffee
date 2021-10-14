package com.example.fikacoffee.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fikacoffee.DetailActivity;
import com.example.fikacoffee.MainActivity;
import com.example.fikacoffee.R;
import com.example.fikacoffee.model.Coffee;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.CoffeeHolder>
{
    private Activity activity;
    private int layout;
    private List<Coffee> coffeeList;

    public CoffeeAdapter(Activity activity, int layout, List<Coffee> coffeeList)
    {
        this.activity = activity;
        this.layout = layout;
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public CoffeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        return new CoffeeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeHolder holder, int position)
    {
        Coffee coffee = coffeeList.get(position);
        holder.imageView.setImageResource(coffee.getImage());
        holder.txt_title.setText(coffee.getName());
        holder.txt_price.setText("$"+coffee.getPrice());
    }

    @Override
    public int getItemCount()
    {
        return coffeeList.size();
    }

    public class CoffeeHolder extends RecyclerView.ViewHolder
    {
        public MaterialCardView card;
        public ImageView imageView;
        public TextView txt_title, txt_price;

        public CoffeeHolder(@NonNull View itemView)
        {
            super(itemView);
            card = itemView.findViewById(R.id.item_card);
            imageView = itemView.findViewById(R.id.item_image);
            txt_title = itemView.findViewById(R.id.item_title);
            txt_price =itemView.findViewById(R.id.item_price);

            card.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(activity, DetailActivity.class);
                    intent.putExtra(MainActivity.NAME_COFFEE, txt_title.getText().toString());
                    activity.startActivity(intent);
                }
            });
        }
    }
}
