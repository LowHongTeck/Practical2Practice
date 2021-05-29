package sg.edu.rp.c346.id20043679.practical2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class dogInfoPage extends AppCompatActivity {

    ImageView ivCarin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_info_page);

        ivCarin = findViewById(R.id.imageViewReplace);
        Bundle bundle = getIntent().getExtras();

        int resid = bundle.getInt("img");

        ivCarin.setImageResource(resid);




    }
}