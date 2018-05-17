package com.example.marwa.listapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by marwa on 17/03/18.
 */

public class viewHolder {
    View convertView;
    ImageView imgId;
    TextView headerTxt;
    TextView Desc;
    public viewHolder(View v) {
       convertView =v;

    }
    public ImageView getImgId() {
        if(imgId==null)
        {
            imgId= (ImageView) convertView.findViewById(R.id.imgItem);
        }
        return imgId;
    }



    public TextView getHeaderTxt() {
        if(headerTxt==null)
        {
            headerTxt=(TextView) convertView.findViewById(R.id.txtHeader);
        }
        return headerTxt;
    }


    public TextView getDesc() {
        if(Desc==null)
        {
            Desc=(TextView) convertView.findViewById(R.id.txtDesc);
        }
        return Desc;
    }




}
