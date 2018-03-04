package urgroup.in.dbmssqlcompleteguide;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class books extends AppCompatActivity {
    Button link;
    ImageButton download;
    DownloadManager downloadManager;
    String URL = "http://hostelguider.com/DBMS/KORTH.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        download = findViewById(R.id.button);
        link = findViewById(R.id.link);


        download.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ConnectivityManager cManager = (ConnectivityManager) getSystemService(books.this.CONNECTIVITY_SERVICE);
                        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                        if (nInfo != null && nInfo.isConnected()) {
                            new DownloadTask(books.this, URL);
                        } else {
                            AlertDialog alertDialog = new AlertDialog.Builder(books.this).create();
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

                ConnectivityManager cManager = (ConnectivityManager) getSystemService(books.this.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                if (nInfo != null && nInfo.isConnected()) {
                    //https://onedrive.live.com/embed?resid=E9F6F40107F096F6%21116&authkey=%21AO6bpIaK59cHtSI&em=2
                    String url = "http://hostelguider.com/DBMS/KORTH.pdf";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);


                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(books.this).create();
                    alertDialog.setTitle("Information");
                    alertDialog.setIcon(R.drawable.jv);
                    alertDialog.setMessage("\nInternet Connection  Not Aviliable");
                    alertDialog.show();
                }


            }
        });

    }
}
