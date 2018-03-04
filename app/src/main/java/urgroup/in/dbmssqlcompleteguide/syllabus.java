package urgroup.in.dbmssqlcompleteguide;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

public class syllabus extends AppCompatActivity {


    Button link;
    ImageButton download;
    DownloadManager downloadManager;
    String URL = "http://hostelguider.com/DBMS/syllabus.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        download = findViewById(R.id.button);
        link = findViewById(R.id.link);


        download.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ConnectivityManager cManager = (ConnectivityManager) getSystemService(syllabus.this.CONNECTIVITY_SERVICE);
                        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                        if (nInfo != null && nInfo.isConnected()) {

                            new DownloadTask(syllabus.this, URL);
                        } else {
                            AlertDialog alertDialog = new AlertDialog.Builder(syllabus.this).create();
                            alertDialog.setTitle("Information");
                            alertDialog.setIcon(R.drawable.jv);
                            alertDialog.setMessage("\nInternet Connection  Not Aviliable");
                            alertDialog.show();
                        }
                    }
                });
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ConnectivityManager cManager = (ConnectivityManager) getSystemService(syllabus.this.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                if (nInfo != null && nInfo.isConnected()) {
                   /* Uri uri = Uri.parse("http://hostelguider.com/DBMS/syllabus.png");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);*/
                    String url = "http://hostelguider.com/DBMS/syllabus.png";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(syllabus.this).create();
                    alertDialog.setTitle("Information");
                    alertDialog.setIcon(R.drawable.jv);
                    alertDialog.setMessage("\nInternet Connection  Not Aviliable");
                    alertDialog.show();
                }


            }
        });

    }
}
