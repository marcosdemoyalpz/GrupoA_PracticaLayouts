package com.mdemoya.layouts.grupoa_practicalayouts.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mdemoya.layouts.grupoa_practicalayouts.R;
import com.mdemoya.layouts.grupoa_practicalayouts.model.User;

import java.util.List;

/**
 * Created by Marcos on 2/24/2018.
 */

public class UserAdapter extends ArrayAdapter<User>
        implements AdapterView.OnItemClickListener {

    private UserSelectable userSelectableListener;

    public UserAdapter(@NonNull Context context, @NonNull List<User> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_user, parent, false);
        } else {

        }

        TextView userNameTextView = (TextView) convertView.findViewById(R.id.userName);
        TextView userAddressTextView = (TextView) convertView.findViewById(R.id.userAddress);

        userNameTextView.setText(user.name);
        userAddressTextView.setText(user.address);

        return convertView;
    }

    public void setUserSelectableListener(UserSelectable userSelectableListener) {
        this.userSelectableListener = userSelectableListener;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (userSelectableListener != null) {
            int position = i;
            User user = getItem(position);
            userSelectableListener.userSelected(position, user);
        }
    }

    public interface UserSelectable {
        void userSelected(int position, User user);
    }
}
