package fit.android.lab4.activity;

import androidx.appcompat.app.AppCompatActivity;
import fit.android.lab4.R;
import fit.android.lab4.adapter.ProductAdapter;
import fit.android.lab4.model.Product;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class CustomGridViewActivity extends AppCompatActivity {
    private List<Product> listProducts;
    private GridView grdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        grdView = findViewById(R.id.idGridView);
        listProducts = new ArrayList<>();

        listProducts.add(new Product(1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));
        listProducts.add(new Product(2, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));
        listProducts.add(new Product(3, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));
        listProducts.add(new Product(4, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));
        listProducts.add(new Product(5, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));
        listProducts.add(new Product(6, "Cáp chuyển từ Cổng USB sang PS2...", 15, 69900, 39));

        //System.out.println(listProducts.size());
        ProductAdapter adapter = new ProductAdapter(this, R.layout.item_custom_grid_view, listProducts);
        grdView.setAdapter(adapter);
    }
}
