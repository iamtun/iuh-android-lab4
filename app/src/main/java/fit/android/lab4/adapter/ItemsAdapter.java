package fit.android.lab4.adapter;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

import fit.android.lab4.R;
import fit.android.lab4.model.Item;

public class ItemsAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Item> listItems;
    private int positionSelect = -1;

    public ItemsAdapter(Context context, int idLayout, List<Item> listItems) {
        this.context = context;
        this.idLayout = idLayout;
        this.listItems = listItems;
    }


    @Override
    public int getCount() {
        if(listItems.size() != 0 && !listItems.isEmpty()) {
            return listItems.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        }

        ImageView imgImage = (ImageView) convertView.findViewById(R.id.Image);
        TextView txtName = (TextView) convertView.findViewById(R.id.Name);
        TextView txtShop = (TextView) convertView.findViewById(R.id.Shop);
        final ConstraintLayout constraintLayout = (ConstraintLayout) convertView.findViewById(R.id.idConconstraintlayout);
        final Item item = listItems.get(position);

        if(listItems != null && !listItems.isEmpty()) {
            txtName.setText(item.getName());
            txtShop.setText(item.getShop());
            int idItem = item.getId();
            switch (idItem) {
                case 1: imgImage.setImageResource(R.drawable.ca_nau_lau); break;
                case 2: imgImage.setImageResource(R.drawable.ga_bo_toi); break;
                case 3: imgImage.setImageResource(R.drawable.xa_can_cau); break;
                case 4: imgImage.setImageResource(R.drawable.do_choi_dang_mo_hinh); break;
                case 5: imgImage.setImageResource(R.drawable.lanh_dao_gian_don); break;
                case 6: imgImage.setImageResource(R.drawable.hieu_long_con_tre); break;
                case 7: imgImage.setImageResource(R.drawable.trump_1); break;
            }
        }

        convertView.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getName(), Toast.LENGTH_SHORT).show();
                positionSelect = position;
                notifyDataSetChanged();
            }
        });

        if(positionSelect == position) {
            constraintLayout.setBackgroundColor(Color.BLUE);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }

        return convertView;
    }
}
