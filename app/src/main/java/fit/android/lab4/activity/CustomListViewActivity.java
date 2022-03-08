package fit.android.lab4.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import fit.android.lab4.R;
import fit.android.lab4.adapter.ItemsAdapter;
import fit.android.lab4.model.Item;

public class CustomListViewActivity extends AppCompatActivity {
    private List<Item> listItems;
    private ListView lstView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view_activity);

        lstView = findViewById(R.id.idListView);
        listItems = new ArrayList<>();

        listItems.add(new Item(1, "Ca nấu lẫu, nấu mì mini", "Devang"));
        listItems.add(new Item(2, "1Kg Khô gà bơ tỏi", "LTD Food"));
        listItems.add(new Item(3, "Xe cần cẩu đa năng", "Thế giới đồ chơi"));
        listItems.add(new Item(4, "Đồ chơi dạng mô hình", "Thế giới đồ chơi"));
        listItems.add(new Item(5, "Lãnh đạo đơn giản", "Minh Long Book"));
        listItems.add(new Item(6, "Hiểu lòng con trẻ", "Minh Long Book"));
        listItems.add(new Item(7, "Donal Trump Thiên tài lãnh đạo", "Minh Long Book"));

        ItemsAdapter adapter = new ItemsAdapter(this, R.layout.item_custom_list_view, listItems);
        lstView.setAdapter(adapter);
    }
}
