package com.blogspot.codesgram.endangeranimals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private ArrayList<Animal> dataList;

    public AnimalAdapter(ArrayList<Animal> dataList) {
        this.dataList = dataList;
    }
    @Nullable
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list_animal, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal hero = dataList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imganimal);
        holder.txtanimal.setText(hero.getName());
        holder.txtdetail.setText(hero.getDetail());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {

        private TextView txtanimal;
        private ImageView imganimal;
        private  TextView txtdetail;
        public AnimalViewHolder(View itemView) {
            super(itemView);
            this.txtanimal = (TextView) itemView.findViewById(R.id.tv_item_name);
            this.imganimal = (ImageView) itemView.findViewById(R.id.img_item_photo);
            this.txtdetail = (TextView) itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
