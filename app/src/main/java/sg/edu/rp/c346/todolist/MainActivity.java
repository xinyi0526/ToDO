package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTODO;
    ArrayList<AndroidVersion> TODOList;
    CustomAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTODO = findViewById(R.id.TODOList);

        TODOList = new ArrayList<>();
        TODOList.add(new AndroidVersion("MSA","1/7/2019"));
        TODOList.add(new AndroidVersion("Go for haircut","22/9/2019"));

        adaptor = new CustomAdaptor(this, R.layout.row,TODOList);

        lvTODO.setAdapter(adaptor);
    }
}
