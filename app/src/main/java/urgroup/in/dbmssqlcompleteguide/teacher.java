package urgroup.in.dbmssqlcompleteguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher extends AppCompatActivity {

    Button btn,btn1,btn2,btn0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn0=findViewById(R.id.button0);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent marketIntent = new Intent(teacher.this, books.class);
                startActivity(marketIntent);//book
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marketIntent = new Intent(teacher.this, syllabus.class);
                startActivity(marketIntent);
                //syllabus
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marketIntent = new Intent(teacher.this, internal1.class);
                startActivity(marketIntent);
                //cat 1
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent marketIntent = new Intent(teacher.this, Internal2.class);
                startActivity(marketIntent);
               // cat 2
            }
        });

    }
}
