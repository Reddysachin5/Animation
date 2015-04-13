package info.androidhive.slidingmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoginActivity extends ActionBarActivity {


    private EditText username = null;
    private EditText  password = null;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.hglogo);
        username = (EditText)findViewById(R.id.editTextUsername);
        password = (EditText)findViewById(R.id.editTextPassword);
        login = (Button)findViewById(R.id.buttonSignIn);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean status = true;
                if (!username.getText().toString().equals("admin")){
                    YoYo.with(Techniques.Shake).playOn(username);
                    status = false;
                }
                if (!password.getText().toString().equals("admin")){
                    YoYo.with(Techniques.Shake).playOn(password);
                    status = false;
                }
                else if (status){
                    Intent intent  = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
