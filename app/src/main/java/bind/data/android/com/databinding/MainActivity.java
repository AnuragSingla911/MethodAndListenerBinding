package bind.data.android.com.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import bind.data.android.com.databinding.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {
    Name name;
    MainActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setDefaultComponent(null);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        name = new Name("ram");
        name.setLastName("engneer");
        binding.setName(name);
        binding.setHandlers(new MyHandlers());
        binding.setActivityMethod(this);

        Name name = (Name) getLastCustomNonConfigurationInstance();
        if (name != null) {
            Log.d("anurag", "name first name :" + name.getName());
            Log.d("anurag", "name last name " + name.getLastName());
        }


    }

    public void onClickX(View view){
        Log.d("anurag","activity onclick x is called");
    }




    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return name;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        binding.setName(new Name("sham"));


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
