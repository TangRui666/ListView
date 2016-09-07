package cn.edu.bistu.cs.se.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private final static String NAME="name";
    private final static String CLASS="Class";
    private final static String SEX="sex";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name={"鹿晗","项前进","林冲","陈长生"};
        String[] Class={"1401","1402","1403","1404"};
        String[] sex={"男","男","男","男"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<name.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, name[i]);
            item.put(CLASS, Class[i]);
            item.put(SEX, sex[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASS,SEX},new int[]{R.id.txtname,R.id.txtclass,R.id.txtsex});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}
