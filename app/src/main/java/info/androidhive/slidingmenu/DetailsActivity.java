package info.androidhive.slidingmenu;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sachi Reddy on 4/12/2015.
 */
public class DetailsActivity extends ActionBarActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Bundle extras = getIntent().getExtras();
        String t = extras.getString("title");
        byte[] b = extras.getByteArray("picture");
        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        ImageView image = (ImageView) findViewById(R.id.deataimageView);
        TextView title = (TextView) findViewById(R.id.detailtextView);
        title.setText(t);
        image.setImageBitmap(bmp);

    }
 }

