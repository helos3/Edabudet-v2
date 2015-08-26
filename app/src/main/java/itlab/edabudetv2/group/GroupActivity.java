package itlab.edabudetv2.group;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import itlab.edabudetv2.R;

public class GroupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_group, menu);
        return true;
    }

}
