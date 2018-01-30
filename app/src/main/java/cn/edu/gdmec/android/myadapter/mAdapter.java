package cn.edu.gdmec.android.myadapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2018/1/30.
 */

public class mAdapter extends BaseAdapter {
   private LayoutInflater mInflater;
    private List<Bean> mDatas;
    public mAdapter(Context context,List<Bean> mdatas)
    {
        mInflater=LayoutInflater.from(context);
        mDatas=mdatas;
    }
    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null){
            convertView=mInflater.inflate(R.layout.item_list,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.name= (TextView) convertView.findViewById(R.id.id_name);
            viewHolder.desc= (TextView) convertView.findViewById(R.id.id_desc);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Bean bean=mDatas.get(position);
        viewHolder.name.setText(bean.getName());
        viewHolder.desc.setText(bean.getDesc());
        return convertView;
    }
    public class ViewHolder{
        TextView name;
        TextView desc;
    }
}
