package my.assignment.gridviewapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {
    GridView mGridview;
    Integer[] mThumbnail={R.drawable.angelcake,R.drawable.applepie,R.drawable.bananabread,R.drawable.cupcake,R.drawable.donut,
    R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybeans,
    R.drawable.kitkat,R.drawable.lollipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridview=(GridView)findViewById(R.id.gridview);
        mGridview.setAdapter(new ImageAdapter(this,mThumbnail));

    }
}
