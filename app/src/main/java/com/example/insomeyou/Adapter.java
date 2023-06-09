package com.example.insomeyou;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Recycler> usersList;

    public Adapter (List<Recycler>usersList){
        this .usersList=usersList;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int imgResource = usersList.get(position).getImageview1();
        String detailsResource = usersList.get(position).getDetail1();

        holder.setData(imgResource, detailsResource);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview1);
            textView2 = itemView.findViewById(R.id.detail1);

        }

        public void setData(int imgResource, String detailsResource) {
            imageView.setImageResource(imgResource);
            textView2.setText(detailsResource);
        }
    }

}
