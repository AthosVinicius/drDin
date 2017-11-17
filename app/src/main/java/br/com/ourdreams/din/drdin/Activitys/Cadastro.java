package br.com.ourdreams.din.drdin.Activitys;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import br.com.ourdreams.din.drdin.R;
import br.com.ourdreams.din.drdin.Util;

public class Cadastro extends AppCompatActivity {
    private Context context;

    private ImageButton btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        context = this;
        Util.fullScreen(getWindow());

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        btn_voltar = (ImageButton)findViewById(R.id.btn_voltar);
        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
