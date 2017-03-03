package com.example.mynamekarn.neaw03;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] listarea;
    private final String[] listdesc;
    private final String[] contact;
    private final Integer[] imgid;


    public CustomListAdapter(Activity context, String[] itemname,String[] listarea, Integer[] imgid,String[] listdesc,String[] contact) {
        super(context, R.layout.mylist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.listarea=listarea;
        this.imgid=imgid;
        this.listdesc=listdesc;
        this.contact=contact;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        TextView descrip = (TextView) rowView.findViewById(R.id.desc);
        String a="";
        a=a+position;
        Log.d("pro",a.toString());

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("#"+listarea[position]);
        descrip.setText(listdesc[position]);
        return rowView;

    };
}
