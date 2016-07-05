package my.assignment.gridviewapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by root on 7/6/16.
 */

public class ImageAdapter extends BaseAdapter {

    Activity context;
    Integer[] data;
    private static LayoutInflater inflater;

    public ImageAdapter() {
        super();
    }
    public ImageAdapter(Activity a,Integer[] mThumbId){
        context=a;
        data=mThumbId;
        inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class Holder
    {
        ImageView Iv1;

    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.grid_layout, null);
        holder.Iv1=(ImageView) rowView.findViewById(R.id.imageView);

        holder.Iv1.setImageResource(data[i]);




        return rowView;
    }
}
