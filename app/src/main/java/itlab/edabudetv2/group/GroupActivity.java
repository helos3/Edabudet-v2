package itlab.edabudetv2.group;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import itlab.edabudetv2.R;

public class GroupActivity extends ActionBarActivity {

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
