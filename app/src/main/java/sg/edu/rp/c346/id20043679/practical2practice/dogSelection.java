package sg.edu.rp.c346.id20043679.practical2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dogSelection extends AppCompatActivity {

    ImageView ivCarin, ivCanadian, ivCavalier, ivCheagle, ivChihuahua,
            ivChowChow, ivCorgidor, ivCorgipoo, ivCorkie, ivCorman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_selection);

        ivCarin = findViewById(R.id.imageView_CarinTerrier);
        ivCanadian = findViewById(R.id.imageView_CanadianEskimo);
        ivCavalier = findViewById(R.id.imageView_Cavalier);
        ivCheagle = findViewById(R.id.imageView_Cheagle);
        ivChihuahua = findViewById(R.id.imageView_Chihuahua);
        ivChowChow = findViewById(R.id.imageView_ChowChow);
        ivCorgidor = findViewById(R.id.imageView_Corgidor);
        ivCorgipoo = findViewById(R.id.imageView_Corgipoo);
        ivCorkie = findViewById(R.id.imageView_Corkie);
        ivCorman = findViewById(R.id.imageView_CormanShepherd);

        ivCarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.imgbtn_cairn_terrier);
                intent.putExtra("location","Europe");
                intent.putExtra("facts", "Toto from 'The Wizard of Oz' was a female Cairn Terrier named Terry.");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("common_name","Cairn Terrier");
                intent.putExtra("slogan","Intelligent, lively and strong!");
                intent.putExtra("lifespan","14 years");
                intent.putExtra("weight","6kg (14lbs");
                startActivity(intent);
            }
        });
    }
}