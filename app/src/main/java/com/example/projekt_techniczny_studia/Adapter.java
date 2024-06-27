package com.example.projekt_techniczny_studia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    public DataFromAddNewFriends[] listData;
    public Adapter(Context context, DataFromAddNewFriends[] listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.single_recycle_view_to_list_of_friends, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.name.setText(listData[position].getName());
        holder.localization.setText(listData[position].getName());
        holder.hairColour.setText(listData[position].getName());
        holder.eyesColour.setText(listData[position].getName());
        holder.description.setText(listData[position].getName());
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView localization;
        TextView hairColour;
        TextView eyesColour;
        TextView description;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            name = itemView.findViewById(R.id.text_wiew_in_list_of_friends_for_name);
            localization = itemView.findViewById(R.id.text_wiew_in_list_of_friends_for_localization);
            hairColour = itemView.findViewById(R.id.text_wiew_in_list_of_friends_for_hair_colour);
            eyesColour = itemView.findViewById(R.id.text_wiew_in_list_of_friends_for_eyes_colours);
            description = itemView.findViewById(R.id.text_wiew_in_list_of_friends_for_description);

        }
    }
}
