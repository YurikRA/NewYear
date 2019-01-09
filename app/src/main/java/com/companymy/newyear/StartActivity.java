package com.companymy.newyear;

import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    private  Typewrite writer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView imageView = (ImageView)findViewById(R.id.image_tree_vertical);
        imageView.setImageResource(R.drawable.christmas_tree_vertical);
        TextView textView = findViewById(R.id.textFirst);

        String textWrite = "Happy New Year!!! ";

        Typewrite writer = new Typewrite(textView);
        writer.animateText(textWrite);

//        final EditText editname = (EditText)findViewById(R.id.editName);
//        final String nameString = editname.getText().toString();


        findViewById(R.id.buttonFirst).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
    }


    public void send(){
        EditText editName = (EditText)findViewById(R.id.editName);
        String nameString = editName.getText().toString();
        Intent intent = new Intent(this, CongratulationActivity.class);
        intent.putExtra("name", nameString);
        startActivity(intent);
    }
}
