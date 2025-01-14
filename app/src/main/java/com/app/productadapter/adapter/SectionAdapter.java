package com.app.productadapter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.productadapter.DTO.SectionDTO;
import com.app.productadapter.R;


import java.util.List;

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.SectionViewHolder> {
    private List<SectionDTO> sections;
    private OnSectionClickListener listener;

    public interface OnSectionClickListener {
        void onSectionClick(int position);
    }

    public SectionAdapter(List<SectionDTO> sections, OnSectionClickListener listener) {
        this.sections = sections;
        this.listener = listener;
    }


    @NonNull
    @Override
    public SectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_section, parent, false);
        return new SectionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionViewHolder holder, int position) {
        SectionDTO section = sections.get(position);
        holder.textView.setText(section.getNAME());
        holder.itemView.setOnClickListener(v -> listener.onSectionClick(position));
    }

    @Override
    public int getItemCount() {
        return sections.size();
    }

    static class SectionViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public SectionViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.selectorText);
        }
    }
}