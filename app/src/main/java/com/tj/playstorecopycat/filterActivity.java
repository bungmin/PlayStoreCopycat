package com.tj.playstorecopycat;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tj.playstorecopycat.databinding.ActivityFilterBinding;

public class filterActivity extends AppCompatActivity {
    ActivityFilterBinding act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //act = ContactsContract.DatasetContentView();
        act = DataBindingUtil.setContentView(this, R.layout.activity_filter);


        act.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int minRating = Integer.parseInt(act.minRatingEdt.getText().toString());

                Intent resultIntent = new Intent();
                resultIntent.putExtra("최소평점", minRating);
                setResult(RESULT_OK,resultIntent);
                finish();

            }
        });
    }


}
