package com.btzh.menu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * menu的使用
 * 1.在res文件夹下创建一个menu的文件夹
 * 2.创建一个自定义的resouse，资源文件
 * 3.创建自己的item选项
 * 4.在activity中重载onCreateOptionsMenu 和onOptionsItemSelected 方法
 * 5.进行相应的逻辑处理
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflate参数传入自己创建的菜单文件，第二个指的是菜单对象
        getMenuInflater().inflate(R.menu.country,menu);
        //表示允许将创建的菜单显示出来
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.china:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.japan:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.russia:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
}
