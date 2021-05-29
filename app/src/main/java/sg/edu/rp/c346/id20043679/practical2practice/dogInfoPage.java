package sg.edu.rp.c346.id20043679.practical2practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class dogInfoPage extends AppCompatActivity {

    ImageView rImage;
    TextView tvHeader;
    TextView tvLocation;
    TextView tvDiet;
    TextView tvLifespan;
    TextView tvWeight;
    TextView tvURL;

    TextView subLocation;
    TextView subDiet;
    TextView subLifespan;
    TextView subWeight;

    String viewSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_info_page);

        rImage = findViewById(R.id.imageViewReplace);
        tvHeader = findViewById(R.id.header);
        tvLocation = findViewById(R.id.insertLocaInfo);
        tvDiet = findViewById(R.id.insertDietInfo);
        tvLifespan = findViewById(R.id.insertLifespan);
        tvWeight = findViewById(R.id.insertWeight);
        tvURL = findViewById(R.id.insertURL);

        subLocation = findViewById(R.id.classLocation);
        subDiet = findViewById(R.id.classDiet);
        subLifespan = findViewById(R.id.classLife);
        subWeight = findViewById(R.id.classWeight);

        Bundle bundle = getIntent().getExtras();

        int selectedImg = bundle.getInt("img");
        String selectedHeader = bundle.getString("header");
        String selectedLocation = bundle.getString("location");
        String selectedDiet = bundle.getString("diet");
        String selectedLifespan = bundle.getString("lifespan");
        String selectedWeight = bundle.getString("weight");
        String selectedURL = bundle.getString("url");

        rImage.setImageResource(selectedImg);
        tvHeader.setText(selectedHeader);

        tvLocation.setText(selectedLocation);
        tvDiet.setText(selectedDiet);
        tvLifespan.setText(selectedLifespan);
        tvWeight.setText(selectedWeight);
        tvURL.setText(selectedURL);

        registerForContextMenu(tvLocation);
        registerForContextMenu(tvDiet);
        registerForContextMenu(tvLifespan);
        registerForContextMenu(tvWeight);
        registerForContextMenu(subLocation);
        registerForContextMenu(subDiet);
        registerForContextMenu(subLifespan);
        registerForContextMenu(subWeight);


        tvURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(selectedURL));
                startActivity(intentWeb);
            }
        });
    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Large");
        menu.add(0,1,1,"Medium");
        menu.add(0,2,2,"Small");

        if(v == tvLocation || v == subLocation){
            viewSelected = "location";
        } else if (v == tvDiet || v == subDiet) {
            viewSelected = "diet";
        } else if (v == tvLifespan || v == subLifespan){
            viewSelected = "lifespan";
        } else if (v == tvWeight || v == subWeight){
            viewSelected = "weight";
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if (viewSelected.equalsIgnoreCase("location")){
            if(item.getItemId()==0){
                tvLocation.setTextSize(40);
                subLocation.setTextSize(40);
            } else if (item.getItemId()==1){
                tvLocation.setTextSize(20);
                subLocation.setTextSize(20);
            } else if (item.getItemId()==2){
                tvLocation.setTextSize(15);
                subLocation.setTextSize(15);
            }
        } else if (viewSelected.equalsIgnoreCase("diet")){
            if(item.getItemId()==0){
                tvDiet.setTextSize(40);
                subDiet.setTextSize(40);
            } else if (item.getItemId()==1){
                tvDiet.setTextSize(20);
                subDiet.setTextSize(20);
            } else if (item.getItemId()==2){
                tvDiet.setTextSize(15);
                subDiet.setTextSize(15);
            }
        } else if (viewSelected.equalsIgnoreCase("lifespan")){
            if(item.getItemId()==0){
                tvLifespan.setTextSize(40);
                subLifespan.setTextSize(40);
            } else if (item.getItemId()==1){
                tvLifespan.setTextSize(20);
                subLifespan.setTextSize(20);
            } else if (item.getItemId()==2){
                tvLifespan.setTextSize(15);
                subLifespan.setTextSize(15);
            }
        } else if (viewSelected.equalsIgnoreCase("weight")){
            if(item.getItemId()==0){
                tvWeight.setTextSize(40);
                subWeight.setTextSize(40);
            } else if (item.getItemId()==1){
                tvWeight.setTextSize(20);
                subWeight.setTextSize(20);
            } else if (item.getItemId()==2){
                tvWeight.setTextSize(15);
                subWeight.setTextSize(15);
            }
        }

        return super.onContextItemSelected(item);
    }
}