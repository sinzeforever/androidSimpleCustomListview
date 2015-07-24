package com.yahoo.adapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sinze on 7/24/15.
 */
public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, List<User> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        // Todo: use view holder to hold the view instead of finding it every times
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
        tvName.setText((user.getName()));
        tvHome.setText((user.getHometown()));

        return convertView;
    }

}
