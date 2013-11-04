package il.ac.shenkar;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemListBaseAdapter extends BaseAdapter {

    private static ArrayList<ItemDetails> itemDetailsArrayList;
    private LayoutInflater l_Inflater;

    public ItemListBaseAdapter(Context context, ArrayList<ItemDetails> results) {
        itemDetailsArrayList = results;
        l_Inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemDetailsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemDetailsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = l_Inflater.inflate(R.layout.item_details_view, null);
            holder = new ViewHolder();
            holder.txt_itemName = (TextView) convertView.findViewById(R.id.name);
            holder.txt_itemDescription = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txt_itemName.setText(itemDetailsArrayList.get(position).getName());
        holder.txt_itemDescription.setText(itemDetailsArrayList.get(position).getDescription());
        return convertView;
    }

    static class ViewHolder {
        TextView txt_itemName;
        TextView txt_itemDescription;
    }
}











