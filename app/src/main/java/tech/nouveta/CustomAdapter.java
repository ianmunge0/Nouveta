package tech.nouveta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<Record> records;
    public CustomAdapter(Context c, ArrayList<Record> records) {
        this.c = c;
        this.records = records;
    }
    @Override
    public int getCount() {
        return records.size();
    }
    @Override
    public Object getItem(int position) {
        return records.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(c).inflate(R.layout.list_adapter_view,parent,false);
        }
        TextView timeTxt= (TextView) convertView.findViewById(R.id.texttime);
        TextView clickedTxt= (TextView) convertView.findViewById(R.id.textclick);
        TextView diffTxt= (TextView) convertView.findViewById(R.id.textdiff);
        TextView dateTxt= (TextView) convertView.findViewById(R.id.textdate);


        final Record s= (Record) this.getItem(position);
        timeTxt.setText(s.getSync());
        clickedTxt.setText(s.getClicked());
        diffTxt.setText(s.getDiff());
        dateTxt.setText(s.getDate());

        return convertView;
    }
}