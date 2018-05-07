package com.developerswork.gopinadh.mahalakshmifinance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity {
    Intent newActivity = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void appliances(View view){
        newActivity = new Intent(this,Appliances.class);
        startActivity(newActivity);
    }
    public void exchange(View view){
        newActivity = new Intent(this,Exchange.class);
        startActivity(newActivity);
    }
    public void cash(View view){
        newActivity = new Intent(this,Cash.class);
        startActivity(newActivity);
    }
    public void employee(View view){
        newActivity = new Intent(this,Employee.class);
        startActivity(newActivity);
    }
    public void reports(View view){
        newActivity = new Intent(this,Reports.class);
        startActivity(newActivity);
    }
    public void accessories(View view){
        newActivity = new Intent(this,Accessories.class);
        startActivity(newActivity);
    }
}
