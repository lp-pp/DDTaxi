package com.lp.ddtaxi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.lp.ddtaxi.Bean.MenuItemsEntity;
import com.lp.ddtaxi.R;
import com.lp.ddtaxi.utils.WebDetailActivityUtils;

import java.util.List;

public class MenuItemsAdapter extends RecyclerView.Adapter<MenuItemsAdapter.ViewHolder> {

    private List<MenuItemsEntity> mMenuItemsEntityList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        View MenuItemsEntityView;
        ImageView MenuItemsEntityImage;
        TextView MenuItemsEntityName;

        public ViewHolder(View view) {
            super(view);
            MenuItemsEntityView = view;
            MenuItemsEntityImage = (ImageView) view.findViewById(R.id.item_image);
            MenuItemsEntityName = (TextView) view.findViewById(R.id.item_title);
        }
    }

    public MenuItemsAdapter(List<MenuItemsEntity> MenuItemsEntityList) {
        mMenuItemsEntityList = MenuItemsEntityList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.left_menu_items_entity_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.MenuItemsEntityView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                MenuItemsEntity MenuItemsEntity = mMenuItemsEntityList.get(position);
                WebDetailActivityUtils.startDDInfoActivity(v.getContext(),MenuItemsEntity.getMenuItemDetails());
            }
        });
        holder.MenuItemsEntityImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                MenuItemsEntity MenuItemsEntity = mMenuItemsEntityList.get(position);
                Toast.makeText(v.getContext(),"Image  "+ MenuItemsEntity.getMenuItemsTitle(),Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MenuItemsEntity MenuItemsEntity = mMenuItemsEntityList.get(position);
        holder.MenuItemsEntityImage.setImageResource(MenuItemsEntity.getMenuItemsImgId());
        holder.MenuItemsEntityName.setText(MenuItemsEntity.getMenuItemsTitle());
    }

    @Override
    public int getItemCount() {
        return mMenuItemsEntityList.size();
    }
}