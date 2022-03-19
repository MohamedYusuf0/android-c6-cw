package com.example.shopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    List<Items> itemsList;
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);

        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.shopping_listview , parent , false);

        Items currentItems = itemsList.get(position);

        TextView itemName = view.findViewById(R.id.itemName);
        TextView itemPrice = view.findViewById(R.id.itemPrice);
        ImageView itemImage = view.findViewById(R.id.itemImage);

        itemName.setText(currentItems.getItemName());
        itemPrice.setText(currentItems.getItemPrice() + "");
        itemImage.setImageResource(currentItems.getItemImage());

        return view;
    }
}
