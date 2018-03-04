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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.File;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class internal1 extends AppCompatActivity {
    Button link;
    ImageButton download;
    DownloadManager downloadManager;
    String URL = "http://hostelguider.com/DBMS/Disadvantages_of_flat_file_system_over_DBMS.docx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal1);
        download = findViewById(R.id.button);
        link = findViewById(R.id.link);
        download.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ConnectivityManager cManager = (ConnectivityManager) getSystemService(internal1.this.CONNECTIVITY_SERVICE);
                        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                        if (nInfo != null && nInfo.isConnected()) {
                           /* downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                            Uri uri = Uri.parse("http://hostelguider.com/DBMS/Disadvantages_of_flat_file_system_over_DBMS.docx");
                            DownloadManager.Request request = new DownloadManager.Request(uri);
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                            request.setTitle("File flat");
                            request.setDescription("File flat");
                            //request.setDestinationInExternalFilesDir(syllabus.this, Environment.DIRECTORY_DOWNLOADS, "syllabus.png");
                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "File_flat.docx");
                            Long refrence = downloadManager.enqueue(request);*/

                            new DownloadTask(internal1.this, URL);
                        } else {
                            AlertDialog alertDialog = new AlertDialog.Builder(internal1.this).create();
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

                ConnectivityManager cManager = (ConnectivityManager) getSystemService(internal1.this.CONNECTIVITY_SERVICE);
                NetworkInfo nInfo = cManager.getActiveNetworkInfo();
                if (nInfo != null && nInfo.isConnected()) {

                    String url = "https://onedrive.live.com/embed?cid=E9F6F40107F096F6&resid=E9F6F40107F096F6%21120&authkey=AGSqmg1GcQliyAo&em=2";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);


                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(internal1.this).create();
                    alertDialog.setTitle("Information");
                    alertDialog.setIcon(R.drawable.jv);
                    alertDialog.setMessage("\nInternet Connection  Not Aviliable");
                    alertDialog.show();
                }


            }
        });

    }
}
