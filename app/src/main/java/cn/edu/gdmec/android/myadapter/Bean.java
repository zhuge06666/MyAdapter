package cn.edu.gdmec.android.myadapter;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/1/30.
 */

public class Bean {
    private String  name;
    private String desc;
    public Bean(String name, String desc){
        this.name=name;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
