package com.example.smartpantrymanager.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.smartpantrymanager.R;
import com.example.smartpantrymanager.models.PantryItem;
import java.util.List;

public class PantryAdapter extends RecyclerView.Adapter<PantryAdapter.PantryViewHolder> {
    private List<PantryItem> pantryList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(PantryItem item);
    }

    public PantryAdapter(List<PantryItem> pantryList, OnItemClickListener listener) {
        this.pantryList = pantryList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PantryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pantry, parent, false);
        return new PantryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PantryViewHolder holder, int position) {
        PantryItem item = pantryList.get(position);
        holder.textName.setText(item.getName());
        holder.textQty.setText(item.getQuantity() + " " + (item.getUnit() != null ? item.getUnit() : ""));
        holder.textExpiry.setText("Expires: " + (item.getExpiryDate() != null ? item.getExpiryDate() : "N/A"));
        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() { return pantryList.size(); }

    public static class PantryViewHolder extends RecyclerView.ViewHolder {
        TextView textName, textQty, textExpiry;
        public PantryViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textPantryName);
            textQty = itemView.findViewById(R.id.textPantryQty);
            textExpiry = itemView.findViewById(R.id.textPantryExpiry);
        }
    }
}