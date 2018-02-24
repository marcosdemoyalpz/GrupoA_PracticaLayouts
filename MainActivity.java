package com.mdemoya.layouts.grupoa_practicalayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String MY_TITLE_BAR = "TITLE_BAR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button myLinearLayoutHorizontal = (Button)
                findViewById(R.id.my_linear_layout_horizontal);
        Button myLinearLayoutVertical = (Button)
                findViewById(R.id.my_linear_layout_vertical);
        myLinearLayoutHorizontal.setOnClickListener(this);
        myLinearLayoutVertical.setOnClickListener(this);
        */

        findViewById(R.id.my_linear_layout_horizontal).setOnClickListener(this);
        findViewById(R.id.my_linear_layout_vertical).setOnClickListener(this);
        findViewById(R.id.my_relative_layout).setOnClickListener(this);
        findViewById(R.id.my_table_layout).setOnClickListener(this);
        findViewById(R.id.my_frame_layout).setOnClickListener(this);
        findViewById(R.id.my_list_view).setOnClickListener(this);
        findViewById(R.id.my_grid_view).setOnClickListener(this);
        findViewById(R.id.my_constraint_layout).setOnClickListener(this);
        findViewById(R.id.CustomListView).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        Toast.makeText(this, "Cualquier mensaje", Toast.LENGTH_LONG).show();
        Intent intent = null;
        switch (view.getId()) {
            case R.id.my_linear_layout_horizontal:
                Log.d("MainActivity", "myLinearLayoutHorizontal clicked!");
                intent = new Intent(this, LinearLayoutHorizontalActivity.class);
                break;

            case R.id.my_linear_layout_vertical:
                Log.d("MainActivity", "myLinearLayoutVertical clicked!");
                break;

            case R.id.my_relative_layout:
                intent = new Intent(this, RelativeLayoutActivity.class);
                break;

            case R.id.my_table_layout:
                Toast.makeText(this, "Table Layout clicked!", Toast.LENGTH_LONG).show();
                intent = new Intent(this, TableLayoutActivity.class);
                break;

            case R.id.my_frame_layout:
                Toast.makeText(this, "Frame Layout clicked!", Toast.LENGTH_LONG).show();
                intent = new Intent(this, FrameLayoutActivity.class);
                break;

            case R.id.my_list_view:
                Toast.makeText(this, "List View clicked!", Toast.LENGTH_LONG).show();
                intent = new Intent(this, ListViewActivity.class);
                break;

            case R.id.my_grid_view:
                Toast.makeText(this, "Grid View clicked!", Toast.LENGTH_LONG).show();
                intent = new Intent(this, GridViewActivity.class);
                break;

            case R.id.my_constraint_layout:
                Toast.makeText(this, "Constraint Layout clicked!", Toast.LENGTH_LONG).show();
                break;

            case R.id.CustomListView:
                Toast.makeText(this, "Custom ListView clicked!", Toast.LENGTH_LONG).show();
                intent = new Intent(this, CustomListViewActivity.class);
                intent.putExtra(MY_TITLE_BAR, "Custom List View X)");
                break;

            default:
                Log.d("MainActivity", "Unknown button clicked!");
                Toast.makeText(this, "Unknown button clicked!", Toast.LENGTH_LONG).show();
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
