package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);


        Log.i( tag: "Lifecycle" msg: "Oncreate invoked");
    }

    @Override
    public void onStart(){

        super.onStart();
        Log.i( tag: "Lifecycle", msg: "onStart() invoked");

    }

    @Override
    public void onRestart(){

        super.onRestart();
        Log.i( tag: "Lifecycle", msg: "onRestart() invoked");

    }

    @Override
    public void onResume(){

        super.onResume();
        Log.i( tag: "Lifecycle", msg: "onResume() invoked");

    }

    @Override
    public void onPause(){

        super.onPause();
        Log.i( tag: "Lifecycle", msg: "onPause() invoked");

    }

    @Override
    public void onStop(){

        super.onStop();
        Log.i( tag: "Lifecycle", msg: "onStop() invoked");

    }

    @Override
    public void onDestroy(){

        super.onDestroy();
        Log.i( tag: "Lifecycle", msg: "onDestroy() invoked");

    }
}
