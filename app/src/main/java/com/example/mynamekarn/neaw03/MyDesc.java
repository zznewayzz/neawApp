package com.example.mynamekarn.neaw03;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by New on 5/13/16 AD.
 */
public class MyDesc extends Activity{

    //MyDesc.result(id);
    static String name;
    static String desc;
    static String listarea;
    static String contact;
    static Integer imgid;


    public static void result(String name,String desc,String listarea,String contact,Integer imgid){
        name = name;
        desc = desc;
        listarea = listarea;
        contact = contact;
        imgid = imgid;
        Log.d("I1",name.toString());
        Log.d("I2",desc.toString());
        Log.d("I3",listarea.toString());
        Log.d("I4",contact.toString());

    }


    @Override
    protected void onCreate(Bundle sevedInstanceState){
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.desc);

        TextView txtname = (TextView) this.findViewById(R.id.textView55);
        TextView txtdesc = (TextView) this.findViewById(R.id.textView66);
        TextView txtlistarea = (TextView) this.findViewById(R.id.textView77);
        TextView txtcontact = (TextView) this.findViewById(R.id.textView88);
        //ImageView imageView = (ImageView) this.findViewById(R.id.icon);

        txtname.setText(name);
        txtdesc.setText(desc);
        txtlistarea.setText(listarea);
        txtcontact.setText(contact);


    }

}
