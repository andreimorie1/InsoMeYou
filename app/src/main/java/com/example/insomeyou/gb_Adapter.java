package com.example.insomeyou;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class gb_Adapter extends RecyclerView.Adapter<gb_Adapter.ViewHolder> {

    private List<gb_Recycler> gb_usersList;

    public gb_Adapter (List<gb_Recycler>gb_usersList){ this .gb_usersList=gb_usersList; }

    @NonNull
    @Override
    public gb_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gb_item_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull gb_Adapter.ViewHolder holder, int position) {
        int image = gb_usersList.get(position).getGb_imageview1();
        String header = gb_usersList.get(position).getGb_header1();
        String detail = gb_usersList.get(position).getGb_detail1();

        holder.setData(image, header,detail);
    }

    @Override
    public int getItemCount() {
       return gb_usersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView header;
        private TextView detail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.gb_cardview1);
            header = itemView.findViewById(R.id.gb_header1);
            detail = itemView.findViewById(R.id.gb_detail1);
        }


        public void setData(int image, String head1, String details1){
            imageView.setImageResource(image);
            header.setText(head1);
            detail.setText(details1);
        }
    }
}
