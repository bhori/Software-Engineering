package com.example.hamesakem.Result;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.hamesakem.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class result extends AppCompatActivity {
    String course_choice="";
    String university_choice="";
    String lecturer_choice="";
    ArrayList<Summary> sum_array;
    RecyclerView rv ;
    RvAdapter rv_adapter;
    FirebaseFirestore fStore;

    ArrayList<Summary> sum_list = new ArrayList<Summary>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        sum_array= (ArrayList<Summary>) getIntent().getSerializableExtra("sum_result");
        rv= findViewById(R.id.RV);
        rv_adapter = new RvAdapter(sum_array,this,this);
        rv.setAdapter(rv_adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
         course_choice=getIntent().getExtras().getString("course_choice");
         university_choice=getIntent().getExtras().getString("university_choice");;
         lecturer_choice=getIntent().getExtras().getString("lecturer_choice");;
    }
}
