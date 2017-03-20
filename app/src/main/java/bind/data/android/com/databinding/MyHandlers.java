package bind.data.android.com.databinding;

import android.util.Log;
import android.view.View;

/**
 * Created by jade on 20/3/17.
 */

public class MyHandlers {

    public void onClickX(){
        Log.d("anurag"," onclick x is called");
    }

    public void onClickX(Name name){
        Log.d("anurag"," onclick x is called with name : "+ name.getName());
    }

    public void onClickX(View view , Name name){
        Log.d("anurag"," onclick x is called with name : "+ name.getName() + " view :"+ view);
    }



}
