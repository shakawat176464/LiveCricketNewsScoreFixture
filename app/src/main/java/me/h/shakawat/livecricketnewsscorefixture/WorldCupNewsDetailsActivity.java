package me.h.shakawat.livecricketnewsscorefixture;

import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import me.h.shakawat.livecricketnewsscorefixture.Model.WorldCupNews;

public class WorldCupNewsDetailsActivity extends AppCompatActivity {

    TextView txt_news_time,txt_news_header,txt_news_desc;
    ImageView img_news;
    CollapsingToolbarLayout collapsingToolbarLayout;
    FirebaseDatabase database;
    DatabaseReference newses;
    WorldCupNews currentNews;
    String worldCupNewsId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_cup_news_details);

        Toolbar toolbar = findViewById(R.id.toolBarWallpaperSetActivity);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        database = FirebaseDatabase.getInstance();
        newses = database.getReference("WorldCupNews");


        txt_news_time = findViewById(R.id.txt_details_time_Id);
        txt_news_header = findViewById(R.id.txt_details_header_Id);
        txt_news_desc = findViewById(R.id.txt_details_desc_Id);

        img_news = findViewById(R.id.img_news_details_id);

        collapsingToolbarLayout=findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppbar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppbar);


        if (getIntent()!=null)
            worldCupNewsId=getIntent().getStringExtra("WorldCupNewsId");
        if (!worldCupNewsId.isEmpty())
            getDetailsNews(worldCupNewsId);

    }

    private void getDetailsNews(String newsID) {
        newses.child(worldCupNewsId).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                currentNews=dataSnapshot.getValue(WorldCupNews.class);

                ///set Image
                Picasso.get()
                        .load(currentNews.getImage())
                        .into(img_news);

                collapsingToolbarLayout.setTitle("WorldCupNews");
                txt_news_time.setText(currentNews.getTime());
                txt_news_header.setText(currentNews.getHead());
                txt_news_desc.setText(currentNews.getDesc());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


}