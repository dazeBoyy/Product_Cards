package com.app.productadapter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;


import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;


import com.app.productadapter.DTO.ApiResponseDTO;
import com.app.productadapter.DTO.ProductDTO;
import com.app.productadapter.DTO.SectionDTO;
import com.app.productadapter.adapter.ProductAdapter;
import com.app.productadapter.adapter.SectionAdapter;
import com.app.productadapter.databinding.ActivityMainBinding;
import com.app.productadapter.services.ApiService;
import com.app.productadapter.services.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerSections;
    private ViewPager2 viewPagerProducts;
    private SectionAdapter sectionAdapter;

    private LinearLayout productBlock;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerSections = findViewById(R.id.recyclerSections);
        viewPagerProducts = findViewById(R.id.viewPagerProducts);


        viewPagerProducts.setOffscreenPageLimit(3);
        recyclerSections.setAdapter(sectionAdapter);
        recyclerSections.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        fetchData();
    }

    private void fetchData() {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        apiService.getSections("topglav").enqueue(new Callback<ApiResponseDTO>() {

            @Override
            public void onResponse(Call<ApiResponseDTO> call, Response<ApiResponseDTO> response) {
                if (response.isSuccessful()) {
                    productBlock = findViewById(R.id.productBlock);
                    String status = response.body().getStatus();
                    Log.d("Main", "Response body: " + response.body());
                    if (response.body() != null && "Success".equals(response.body().getStatus())) {
                        productBlock.setVisibility(View.VISIBLE);
                        List<SectionDTO> sections = response.body().getTOVARY();
                        setupSections(sections);
                        setupProducts(sections.get(0).getData());
                    }else if ("Error".equals(status)) {
                        // Скрываем блок данных
                        productBlock.setVisibility(View.GONE);
                    }
                } else {
                    Log.d("Main", "Response failed with code: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<ApiResponseDTO> call, Throwable t) {
                Log.d("Main", "Request failed: " + t.getMessage());
            }
        });
    }

    private void setupSections(List<SectionDTO> sections) {
        sectionAdapter = new SectionAdapter(sections, position -> {
            setupProducts(sections.get(position).getData());
        });
        recyclerSections.setAdapter(sectionAdapter);
    }

    private void setupProducts(List<ProductDTO> products) {
        productAdapter = new ProductAdapter(products);
        viewPagerProducts.setAdapter(productAdapter);
    }
}
