package com.poly.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("test", " Gọi Hàm OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", " Gọi Hàm onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("test", " Gọi Hàm onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", " Gọi Hàm onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", " Gọi Hàm onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("test", " Gọi Hàm onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("test", " Gọi Hàm onCreate");

        // khai báo biến Button
        Button btnTinhToan;

        // tham chiếu, ánh xạ nút btnTinhToan vs id = button
        btnTinhToan = findViewById(R.id.button);

        // bắt sự kiện click vào nút btnTinhToan
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khi bấm vào nút tinhTOan thì sự kiện đc thực hiện ở đây, trong pt onClick
                // 1. tham chiếu và lấy giá trị người dùng nhập vào 2 ô
                EditText edtSo1, edtSo2;
                edtSo1 = findViewById(R.id.editTextTextPersonName);
                edtSo2 = findViewById(R.id.editTextTextPersonName2);
                // 2. Lấy giá trị và tính toán
                String giatri1 = edtSo1.getText().toString();
                String giatri2 = edtSo2.getText().toString();

                double so1 = Double.parseDouble(giatri1);
                double so2 = Double.parseDouble(giatri2);
                double tong = so1 + so2;
                Log.e("Tong", "Tong = "+ tong);
                // 3. lấy giá trị chuyển sang màn hình mới rồi hiển thị
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("kq",tong);
                startActivity(i);

            }
        };
        btnTinhToan.setOnClickListener(onClickListener);


    }
}