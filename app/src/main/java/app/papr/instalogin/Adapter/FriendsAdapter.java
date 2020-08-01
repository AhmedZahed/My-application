package app.papr.instalogin.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.papr.instalogin.R;
import app.papr.instalogin.model.Friends;

public class FriendsAdapter extends BaseAdapter {
    ArrayList<Friends> data;
    Context context;

    public FriendsAdapter(ArrayList<Friends> friends, Context context){

        this.data = friends;
        this.context= context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (convertView == null)
            v = LayoutInflater.from(context).inflate(R.layout.friend_item, parent , false);
        ((ImageView) v.findViewById(R.id.imageView)).setImageResource(data.get(position).getImage());
        ((TextView) v.findViewById(R.id.titleTextView)).setText(data.get(position).getName());
        ((TextView) v.findViewById(R.id.CountextView)).setText(data.get(position).getCountry());

        return v;
    }
}
