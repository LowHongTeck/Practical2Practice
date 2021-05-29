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
                intent.putExtra("img",R.drawable.bnr_cairn_terrier);
                intent.putExtra("header", "Cairn Terrier Information");
                intent.putExtra("location","Europe");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","12 to 15 years");
                intent.putExtra("weight","6 - 8 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/cairn-terrier/");
                startActivity(intent);
            }
        });

        ivCanadian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_canadian_eskimo);
                intent.putExtra("header", "Canadian Eskimo Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","10 to 15 years");
                intent.putExtra("weight","30 to 40 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/canadian-eskimo-dog/");
                startActivity(intent);
            }
        });

        ivCavalier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_cavalier);
                intent.putExtra("header", "Cavalier King Charles Spaniel Information");
                intent.putExtra("location","Europe");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","9 to 14 years");
                intent.putExtra("weight","6 - 8 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/cavalier-king-charles-spaniel/");
                startActivity(intent);
            }
        });

        ivCheagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_cheagle);
                intent.putExtra("header", "Cheagle Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","10 to 14 years");
                intent.putExtra("weight","9 - 13 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/cheagle/");

                startActivity(intent);
            }
        });

        ivChihuahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_chihuahua);
                intent.putExtra("header", "Chihuahua Information");
                intent.putExtra("location","Central-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","12 to 20 years");
                intent.putExtra("weight","1.5 - 3 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/chihuahua/");

                startActivity(intent);
            }
        });

        ivChowChow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_chow_chow);
                intent.putExtra("header", "Chow Chow Information");
                intent.putExtra("location","Asia");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","9 to 15 years");
                intent.putExtra("weight","25 - 32 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/chow-chow/");

                startActivity(intent);
            }
        });

        ivCorgidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_corgidor);
                intent.putExtra("header", "Corgidor Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","10 to 13 years");
                intent.putExtra("weight","18 - 25 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/corgidor/");

                startActivity(intent);
            }
        });

        ivCorgipoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_corgipoo);
                intent.putExtra("header", "Corgipoo Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","12 to 14 years");
                intent.putExtra("weight","5 - 13 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/corgipoo/");

                startActivity(intent);
            }
        });

        ivCorkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_corkie);
                intent.putExtra("header", "Corkie Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","11 to 15 years");
                intent.putExtra("weight","3.5 - 9 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/corkie/");

                startActivity(intent);
            }
        });

        ivCorman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dogSelection.this, dogInfoPage.class);
                intent.putExtra("img",R.drawable.bnr_corman_shepherd);
                intent.putExtra("header", "Corman Shepherd Information");
                intent.putExtra("location","North-America");
                intent.putExtra("diet", "Omnivore");
                intent.putExtra("lifespan","10 to 15 years");
                intent.putExtra("weight","30 - 40 kg");
                intent.putExtra("url","https://a-z-animals.com/animals/corman-shepherd/");

                startActivity(intent);
            }
        });


    }
}