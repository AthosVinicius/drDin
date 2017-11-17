package br.com.ourdreams.din.drdin.Activitys;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import br.com.ourdreams.din.drdin.R;
import br.com.ourdreams.din.drdin.Util;

public class Login extends AppCompatActivity {

    private Context context;

    private Button btn_cadastrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        context = this;
        Util.fullScreen(getWindow());

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        btn_cadastrese = (Button)findViewById(R.id.btn_cadastrese);
        btn_cadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Cadastro.class);
                startActivity(intent);
            }
        });
    }

//    @Override
//    public void onBackPressed(){
//
//    }
}
