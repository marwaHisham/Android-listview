package com.example.marwa.listapp;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Cake[] ImgArr = {
            new Cake("Img1", "Img1 Desc", R.mipmap.two),
            new Cake("Img2", "Img2 Desc", R.mipmap.two),
            new Cake("Img3", "Img3 Desc", R.mipmap.three),
            new Cake("Img4", "Img4 Desc", R.mipmap.two),
            new Cake("Img5", "Img5 Desc", R.mipmap.three),
            new Cake("Img6", "Img6 Desc", R.mipmap.two),
            new Cake("Img7", "Img7 Desc", R.mipmap.one),
            new Cake("Img1", "Img1 Desc", R.mipmap.two),
            new Cake("Img2", "Img2 Desc", R.mipmap.two),
            new Cake("Img3", "Img3 Desc", R.mipmap.three),
            new Cake("Img4", "Img4 Desc", R.mipmap.two),
            new Cake("Img5", "Img5 Desc", R.mipmap.three),
            new Cake("Img6", "Img6 Desc", R.mipmap.two),
            new Cake("Img7", "Img7 Desc", R.mipmap.one),
            new Cake("Img1", "Img1 Desc", R.mipmap.two),
            new Cake("Img2", "Img2 Desc", R.mipmap.two),
            new Cake("Img3", "Img3 Desc", R.mipmap.three),
            new Cake("Img4", "Img4 Desc", R.mipmap.two),



    };
    private CustomArrayAdapter adapter;
    ListView lstDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstDays = findViewById(R.id.lstDays);
        adapter = new CustomArrayAdapter(this,R.layout.custom_row,R.id.txtHeader,ImgArr);
        lstDays.setAdapter(adapter);
        lstDays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, adapterView.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });


    }




    class CustomArrayAdapter extends ArrayAdapter<Cake>{
        Cake[] myCakes;
        public CustomArrayAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Cake[] cakes) {
            super(context, resource, textViewResourceId, cakes);
            myCakes = cakes;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View singleRow = null;
            viewHolder viewhandler;
            ImageView cakeThumbnail;
            TextView txtHeader;
            TextView txtDesc;
            if (singleRow == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                singleRow = inflater.inflate(R.layout.custom_row,parent,false);
                 viewhandler=new viewHolder(singleRow);
                 singleRow.setTag(viewhandler);
            }
            else{
                viewhandler=(viewHolder)singleRow.getTag();
            }
            cakeThumbnail = singleRow.findViewById(R.id.imgItem);
            txtHeader = singleRow.findViewById(R.id.txtHeader);
            txtDesc = singleRow.findViewById(R.id.txtDesc);

            cakeThumbnail.setImageResource(myCakes[position].getImgId());
            txtHeader.setText(myCakes[position].getHeaderTxt());
            txtDesc.setText(myCakes[position].getDesc());
            return singleRow;

        }
    }
}
