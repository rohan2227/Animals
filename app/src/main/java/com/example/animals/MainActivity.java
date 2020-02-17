package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    LinearLayout linearLayout1;
    boolean flag=true;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        image=(ImageView)findViewById( R.id.image);
        linearLayout1=(LinearLayout)findViewById( R.id.linearlayout1 );
        scrollView=(ScrollView)findViewById( R.id.scrollview );

        linearLayout1.setVisibility( linearLayout1.INVISIBLE );

        image.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag){
                    linearLayout1.setVisibility( View.VISIBLE );
                    flag=false;
                }else {
                    linearLayout1.setVisibility( View.INVISIBLE );
                    flag=true;
                }

            }

        } );

    }
}
