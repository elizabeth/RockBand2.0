package hackmit.rockband20;

import android.content.Context;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Fate on 9/18/2016.
 */
public class Bars extends AppCompatActivity {

    private String name;
    private ArrayList<Integer> timings= new ArrayList<>();

    public Bars(String note){
        name=note;
    }

    public String name(){
        return name;
    }

    public void DataCreation(){
        timings.clear();
        Context context = this;
        Resources res=getResources();
        InputStream is = res.openRawResource(R.raw.songs);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String readLine = null;

        try {
            while ((readLine = br.readLine()) != null) {
                timings.add(Integer.parseInt( readLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> integerList(){
        return timings;
    }

}
