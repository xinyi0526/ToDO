package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptor extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdaptor(Context context,int resource, ArrayList<AndroidVersion> objects){
        super(context,resource,objects);

        parent_context=context;
        layout_id=resource;
        versionList=objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Obtain the layoutInFlater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //"Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI Components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewTODO);
        TextView tvVersion = rowView.findViewById(R.id.textViewDate);

        //Obatin the Android Version info based on the position
        AndroidVersion currentVersion = versionList.get(position);

        //Set values to the TextView to display the corresponding info
        tvName.setText(currentVersion.getTodo());
        tvVersion.setText(currentVersion.getDate());

        return rowView;


    }

}
