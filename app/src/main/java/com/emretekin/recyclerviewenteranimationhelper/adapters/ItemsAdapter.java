package com.emretekin.recyclerviewenteranimationhelper.adapters;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.emretekin.recyclerviewenteranimationhelper.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emretekin on 08/01/18.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    private ArrayList<String> items = new ArrayList<>();

    public ItemsAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list_item, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder itemsViewHolder, int position) {
        String data = items.get(position);
        itemsViewHolder.getTvName().setText(data);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    //    HOLDER
    public class ItemsViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView tvName;

        private ItemsViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            tvName = mView.findViewById(R.id.tvName);
        }

        public View getmView() {
            return mView;
        }

        public TextView getTvName() {
            return tvName;
        }
    }
}
