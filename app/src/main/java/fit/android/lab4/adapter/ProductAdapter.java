package fit.android.lab4.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import fit.android.lab4.R;

import java.text.DecimalFormat;
import java.util.List;

import fit.android.lab4.model.Product;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Product> listProducts;
    private int positionSelected = -1;

    public ProductAdapter(Context context, int id, List<Product> list) {
        this.context = context;
        this.idLayout = id;
        this.listProducts = list;
    }

    @Override
    public int getCount() {
        if(listProducts.size() != 0 && !listProducts.isEmpty())
            return listProducts.size();
        return 0;
    }

    @Override
    public Object getItem(int index) {
        return null;
    }

    @Override
    public long getItemId(int index) {
        return 0;
    }

    @Override
    public View getView(final int index, View convertView, ViewGroup parent) {
       if(convertView == null) {
           convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
       }

        TextView txtNameProduct = (TextView) convertView.findViewById(R.id.txtNameProduct);
        TextView txtNumberBuyer = (TextView) convertView.findViewById(R.id.txtNumBuyer);
        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
        TextView txtDiscount = (TextView) convertView.findViewById(R.id.txtDiscount);
        ImageView imgImage = (ImageView) convertView.findViewById(R.id.imgImage);

        final ConstraintLayout constraintLayout = convertView.findViewById(R.id.constraintLayout);
        final Product product = listProducts.get(index);

        DecimalFormat df = new DecimalFormat("#,### VNĐ");
        if(listProducts != null && !listProducts.isEmpty()) {
            txtNameProduct.setText(product.getNameProduct());
            txtNumberBuyer.setText("(" + product.getNumBuyer() + ")");
            txtPrice.setText(df.format(product.getPrice()));
            txtDiscount.setText(product.getDiscount() + " %");

            int idProduct = product.getId();
            switch (idProduct) {
                case 1: imgImage.setImageResource(R.drawable.giacchuyen_1);break;
                case 2: imgImage.setImageResource(R.drawable.daynguon_1); break;
                case 3: imgImage.setImageResource(R.drawable.dauchuyendoipsps2_1); break;
                case 4: imgImage.setImageResource(R.drawable.dauchuyendoi_1); break;
                case 5: imgImage.setImageResource(R.drawable.carbusbtops2_1); break;
                case 6: imgImage.setImageResource(R.drawable.daucam_1); break;
            }
        }

        convertView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(context, product.getNameProduct(), Toast.LENGTH_SHORT).show();
                positionSelected = index;
                notifyDataSetChanged();
            }
        });

        if(positionSelected == index) {
            constraintLayout.setBackgroundColor(Color.CYAN);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }

        return convertView;
    }
}
