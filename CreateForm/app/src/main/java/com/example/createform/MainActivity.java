package com.example.createform;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText hoVaTen, MSSV , ngaySinh, soDienthoai, email;
    CheckBox theThao, duLich, amNhac, dieuKhoan ;
    RadioGroup radioGroupbutton;
    Button submit, cancel;

    private void CheckBox(){
        theThao = findViewById(R.id.TheThao);
        duLich  = findViewById(R.id.DuLich);
        amNhac  = findViewById(R.id.AmNhac);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



      CheckBox();

        hoVaTen = findViewById(R.id.HoVaTen);
        String name = hoVaTen.getText().toString();
        hoVaTen.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 0){
                    hoVaTen.setError("Bạn bắt buộc phải nhập Họ và Tên");
                }else {
                    hoVaTen.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

         MSSV = findViewById(R.id.edit_MSSV);
        String maSoSinhVien = MSSV.getText().toString();
        MSSV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    MSSV.setError("Bạn bắt buộc phải nhập MSSV");
                } else {
                    MSSV.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        ngaySinh = findViewById(R.id.Date);
        String date = ngaySinh.getText().toString();
        ngaySinh.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    ngaySinh.setError("Bạn bắt buộc phải nhập Ngày Sinh");
                } else {
                    ngaySinh.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        soDienthoai = findViewById(R.id.Phone);
        String phone = soDienthoai.getText().toString();
        soDienthoai.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    soDienthoai.setError("Bạn bắt buộc phải nhập số điện thoại");
                } else {
                    soDienthoai.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        email = findViewById(R.id.Email);
        String Email = email.getText().toString();
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() ==0) {
                    email.setError("Bạn bắt buộc phải nhập số điện thoại");
                } else {
                    email.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        radioGroupbutton = findViewById(R.id.radioGroup);
        radioGroupbutton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.Male:
                        Toast.makeText(MainActivity.this, "Bạn chọn Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Female:
                        Toast.makeText(MainActivity.this, "Bạn chọn Female", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        submit = findViewById(R.id.Submit_button);
        submit.setEnabled(false);
        dieuKhoan = findViewById(R.id.checkBox2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hoVaTen.length() == 0){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền tên", Toast.LENGTH_SHORT).show();
                    return;}
                else if(MSSV.length() == 0){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền MSSV", Toast.LENGTH_SHORT).show();
                    return;}
                else if(ngaySinh.length() == 0){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền Ngày Sinh", Toast.LENGTH_SHORT).show();
                    return;}
                else if(soDienthoai.length() == 0){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền Số Điện Thoại", Toast.LENGTH_SHORT).show();
                    return;}
                else if(email.length() == 0){
                    Toast.makeText(MainActivity.this, "Bạn chưa điền Email", Toast.LENGTH_SHORT).show();
                    return;}
                else{
                    Toast.makeText(MainActivity.this, "Khai Báo Thành công", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });

            dieuKhoan = findViewById(R.id.checkBox2);
            dieuKhoan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        submit.setEnabled(true);
                    }else{
                        submit.setEnabled(false);
                    }
                }
            });

        cancel = findViewById(R.id.cancel_button);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hoVaTen.getText().clear();
                MSSV.getText().clear();
                ngaySinh.getText().clear();
                soDienthoai.getText().clear();
                email.getText().clear();
            }
        });


        theThao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn Thể Thao", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Bạn bỏ chọn Thể Thao !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        duLich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn Du Lịch", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Bạn bỏ chọn Du lịch !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        amNhac.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn Âm Nhạc", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Bạn bỏ chọn Âm Nhạc !!", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}