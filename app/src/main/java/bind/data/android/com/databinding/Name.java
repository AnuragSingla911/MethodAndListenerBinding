package bind.data.android.com.databinding;

/**
 * Created by jade on 21/6/16.
 */
public class Name {

    String name;

    private String lastName;


    public Name(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
