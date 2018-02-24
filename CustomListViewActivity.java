package com.mdemoya.layouts.grupoa_practicalayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.mdemoya.layouts.grupoa_practicalayouts.adapter.UserAdapter;
import com.mdemoya.layouts.grupoa_practicalayouts.model.User;

import java.util.ArrayList;
import java.util.List;

// ShowUsersActivity
// DeleteUsersActivity
// UpdateUsersActivity

public class CustomListViewActivity extends AppCompatActivity
        implements UserAdapter.UserSelectable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        if (getIntent().hasExtra(MainActivity.MY_TITLE_BAR)) {
            String titleBar = getIntent().getStringExtra(MainActivity.MY_TITLE_BAR);
            getSupportActionBar().setTitle(titleBar);
        }

        ListView listView = (ListView) findViewById(R.id.myCustomListViewComponent);

        List<User> users = new ArrayList<>();
//        users.add(new User("Juan", "Calle 1"));
//        users.add(new User("Pedro", "Calle 2"));
//        users.add(new User("José", "Calle 3"));

        for (int i = 0; i <= 1000; i++) {
            users.add(new User("Juan " + Integer.toString(i), "Calle " + Integer.toString((i * 11) + i)));
        }

        UserAdapter userAdapter = new UserAdapter(this, users);
        listView.setAdapter(userAdapter);
        listView.setOnItemClickListener(userAdapter);

        userAdapter.setUserSelectableListener(this);
    }

    @Override
    public void userSelected(int position, User user) {
        Toast.makeText(this,
                user.name + " clicked!\nposition: " + position,
                Toast.LENGTH_SHORT).show();
    }
}
