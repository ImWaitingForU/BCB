package chan.com.bcb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private BottomCenterButton bcb;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        bcb = (BottomCenterButton) findViewById (R.id.bcb);
        bcb.setOnSonButtonClickListener (new BottomCenterButton.SonButtonClickListener () {
            @Override
            public void onSonButton1Clicked (View sonButton1) {
                Log.d ("tag","sonButton1 clicked~~~");
            }

            @Override
            public void onSonButton2Clicked (View sonButton2) {
                Log.d ("tag","sonButton2 clicked~~~");

            }

            @Override
            public void onSonButton3Clicked (View sonButton3) {
                Log.d ("tag","sonButton3 clicked~~~");

            }
        });
    }
}