package com.app.productadapter.adapter;

import static com.app.productadapter.services.RetrofitClient.BASE_URL;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.productadapter.DTO.ProductDTO;
import com.app.productadapter.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<ProductDTO> products;

    public ProductAdapter(List<ProductDTO> products) {
        this.products = products;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductDTO product = products.get(position);
        holder.productPrice.setText(String.valueOf(product.getEXTENDED_PRICE().get(0).getPRICE()) + " P");

        // Загрузите изображение, например, используя Glide
        Glide.with(holder.itemView.getContext())
                .load(BASE_URL + product.getDETAIL_PICTURE())
                .into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView productPrice;
        ImageView productImage;

        public ProductViewHolder(View itemView) {
            super(itemView);
            productPrice = itemView.findViewById(R.id.productPrice);
            productImage = itemView.findViewById(R.id.productImage);
        }
    }
}
