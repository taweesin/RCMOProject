package th.co.rcmo.rcmoapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    public void actionToCalculateCostActivity(View view)
    {
        Intent intent = new Intent(LoginActivity.this, ActionActivity.class);
        startActivity(intent);
    }
}