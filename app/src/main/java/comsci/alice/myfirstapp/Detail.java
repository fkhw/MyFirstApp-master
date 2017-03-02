package comsci.alice.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View คือผูก view ในหน้า UI ให้รู้จักกับตัวแปรบน java
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        Button button = (Button) findViewById(R.id.btnBack);

        //ShowData from MainActivity
        titleTextView.setText(getIntent().getStringExtra("Title"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));
        detailTextView.setText(getIntent().getStringExtra("Detail"));

    }//Main Method

    public void clickBack(View view){
        finish();
    }

}//Main Class
