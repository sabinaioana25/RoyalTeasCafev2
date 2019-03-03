package com.example.android.royalteascafe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final String LOCATION_MAP_URL = "https://www.google.co" +
            ".uk/maps/place/Royal+Teas/@51.4761121,-0.0121641," +
            "17z/data=!3m1!4b1!4m5!3m4!1s0x487602864916a17b:0xa02da532b33f5658!8m2!3d51.4761121" +
            "!4d-0.0099754?hl=en";
    public final String LOCATION_TEL_TEXT = "tel:";
    public final String LOCATION_TEL_VALUE = "44(0)208691 7240";
    public final String LOCATION_WEBSITE = "http://www.royalteascafe.co.uk";
    public final String LOCATION_MENU = "http://royalteascafe.co.uk/Breakfasts.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView see_address = findViewById(R.id.address);
        see_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent address_maps = new Intent(Intent.ACTION_VIEW, Uri.parse(LOCATION_MAP_URL));
                startActivity(address_maps);
            }
        });

        TextView call_number = findViewById(R.id.phone);
        call_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phone_call = new Intent(Intent.ACTION_DIAL, Uri.parse(LOCATION_TEL_TEXT +
                        " " + LOCATION_TEL_VALUE));
                startActivity(phone_call);
            }
        });

        TextView visit_site = findViewById(R.id.website);
        visit_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visit_site = new Intent(Intent.ACTION_VIEW, Uri.parse(LOCATION_WEBSITE));
                startActivity(visit_site);
            }
        });

        Button view_menu = findViewById(R.id.button);
        view_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view_menu = new Intent(Intent.ACTION_VIEW, Uri.parse(LOCATION_MENU));
                startActivity(view_menu);
            }
        });
    }
}