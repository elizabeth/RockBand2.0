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
    private int xcoord;
    private int ycoord;


    public Bars(String note, int x, int y){
        name=note;
        xcoord=x;
        ycoord=y;
    }

    public String name(){
        return name;
    }

    public void DataCreation(int resourceID){
        timings.clear();
        Context context = this;
        Resources res=getResources();
        InputStream is = res.openRawResource(resourceID);
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

    public void setycoord(int y){
        ycoord=y;
    }

    public void setxcoord (int x){
        xcoord=x;

    }

}
