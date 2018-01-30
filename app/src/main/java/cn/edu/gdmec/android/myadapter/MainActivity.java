package cn.edu.gdmec.android.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private List<Bean> mDatas;
    private mAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           initData();
        initView();
    }

    private void initView() {
        listview= (ListView) findViewById(R.id.id_listview);
       listview.setAdapter(adapter);
    }

    private void initData() {
        mDatas=new ArrayList<Bean>();
       Bean bean=new Bean("zhuge1","niubi1");
        mDatas.add(bean);
        bean=new Bean("zhuge2","niubi2");
        mDatas.add(bean);
        bean=new Bean("zhuge3","niubi3");
        mDatas.add(bean);
        bean=new Bean("zhuge4","niubi4");
        mDatas.add(bean);
        bean=new Bean("zhuge5","niubi5");
        mDatas.add(bean);
        bean=new Bean("zhuge6","niubi6");
        mDatas.add(bean);
        bean=new Bean("zhuge7","niubi7");
        mDatas.add(bean);
        adapter=new mAdapter(this,mDatas);
    }
}
