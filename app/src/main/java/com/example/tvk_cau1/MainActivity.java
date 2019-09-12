package com.example.tvk_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editTentk, editPass;
    CheckBox checkLuu;
    Button btndangnhap, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTentk = (EditText) findViewById(R.id.User);
        editPass = (EditText) findViewById(R.id.Password);
        btndangnhap = (Button) findViewById(R.id.Commit);
        checkLuu = (CheckBox) findViewById(R.id.Checked);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkLuu.isChecked()) {
                    Toast.makeText(MainActivity.this, "Chào m?ng b?n dang nh?p h? th?ng, thông tin c?a b?n dã du?c luu", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Chào m?ng b?n dang nh?p h? th?ng, thông tin c?a b?n không du?c luu", Toast.LENGTH_LONG).show();
            }
        });

    }
}
