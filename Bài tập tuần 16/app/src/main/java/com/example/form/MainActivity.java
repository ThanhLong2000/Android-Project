package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rd1, rd2;
    EditText ten, mssv, ns, dc, sdt, email;
    TextView loi;
    CheckBox tt, dl, am, yes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes = findViewById(R.id.yes);
                ten = findViewById(R.id.hoten);
                mssv = findViewById(R.id.mssv);
                ns = findViewById(R.id.ngaysinh);
                sdt = findViewById(R.id.sdt);
                email = findViewById(R.id.email);
                loi = findViewById(R.id.loi);

                boolean yes1 = yes.isChecked();
                boolean ten1 = ten.getText().toString().length() !=0;
                boolean mssv1 = mssv.getText().toString().length() !=0;
                boolean ns1 = ns.getText().toString().length() !=0;
                boolean sdt1 = sdt.getText().toString().length() !=0;
                boolean email1 = email.getText().toString().length() !=0;
                if(yes1 && ten1 && mssv1 && ns1 && sdt1 && email1){
                    loi.setText("");
                } else {
                    loi.setText("Vui lòng kiểm tra lại thông tin");
                }

            }
        });

    }

}