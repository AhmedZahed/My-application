package app.papr.instalogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import app.papr.instalogin.model.Friends;

public class ThirdActivity extends AppCompatActivity {
    private ImageView typeimageView;
    private TextView TitleTextView;
    private TextView DescTextView;
    private Friends friends;
    private TextView textView;
    private String exit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
       textView = findViewById(R.id.textView2);

        friends = (Friends) getIntent().getSerializableExtra(getString(R.string.frined_key));

        exit1 = getIntent().getStringExtra("exit");
          textView.setText(exit1);


        typeimageView = findViewById(R.id.typeimageView);
        TitleTextView = findViewById(R.id.TitleTextView);
        DescTextView = findViewById(R.id.DescTextView);



        typeimageView.setImageResource(friends.getImage());
        TitleTextView.setText(friends.getName());
        DescTextView.setText(friends.getDesc());




    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_opithon, popup.getMenu());
        popup.show();

    }
}

