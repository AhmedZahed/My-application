package app.papr.instalogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.ArrayList;

import app.papr.instalogin.Adapter.FriendsAdapter;
import app.papr.instalogin.model.Friends;

public class SecoundActivity extends AppCompatActivity {
    String names[] = {
            "حسن محمد",
            "محمد قربان",
            "صالح راغب الله",
            "حسن  علي",
            "أحمد زاهد",
    };
    String desc [] = {
            "انسان هادئ لا يحب الازعاج - لطيف - قلبه كبير ",
            "انسان غير هادئ على الاطلاق - مرح ومضحك - قلبه كالعسل",
            "انسان متواضع ومرح ومزعج - معفن - قلبه محب للوالدين ",
            "انسان انطوائي محب للعمل - لطيف - قلبه كالوردة",
            "انسان مزعج فالعالم - مضحك - قلبه يتسع العالم :)",
    };
    String countries [] = {

            "السعودية - اسبانساا",
            "السعودية - ايطاليا",
            "السعودية - السعودية",
            "السعودية - فرنساا",
            "السعودية - الماتياا",

    };
    int images [] = {R.drawable.hs1, R.drawable.muh,
                      R.drawable.sa, R.drawable.hsa,
                       R.drawable.ahm
    };
ArrayList<Friends> friendss = new ArrayList<>();
private ListView listView;
private FriendsAdapter friendsAdapter;
private TextView textView;
private String friendname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
          textView = findViewById(R.id.NameTextView);
          friendname = getIntent().getStringExtra("welcome");
         textView.setText(String.format("%s %s",getString(R.string.welcome),friendname +" *_* "));


        listView = findViewById(R.id.secListView);



        for(int i = 0; i < names.length; ++i){
             Friends friends = new Friends(names[i],desc[i],countries[i],images[i] );
            friendss.add(friends);

            }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                openDetalis(friendss.get(position));
            }



        });
       friendsAdapter = new FriendsAdapter(friendss,this);
        listView.setAdapter(friendsAdapter);
    }



    private void openDetalis (Friends friends){

        Intent intent = new Intent(SecoundActivity.this ,ThirdActivity.class);

        intent.putExtra(getString(R.string.frined_key),friends);
        intent.putExtra("exit",getString(R.string.welcome_now));
        startActivity(intent);
    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opithon, menu);
        return true;
    }*/
    /* public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_opithon);
        popup.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

    } */
}
