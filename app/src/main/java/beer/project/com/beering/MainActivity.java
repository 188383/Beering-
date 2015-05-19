package beer.project.com.beering;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.json.*;


public class MainActivity extends Activity{

    private String mail;
    private String username;

    public static final String ADDRESS = "beer.project.com.beering.ADDRESS";
    public static final String PORT = "beer.project.com.beering.PORT";

    private String hostAddress;
    private int hostPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button listBeers = (Button)findViewById(R.id.list_beers);
        //activates the list of beers
        listBeers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BeerList.class);
                startActivity(intent);
            }
        });

        Button optionsButton = (Button)findViewById(R.id.options);

        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OptionsActivity.class);
                startActivity(intent);
            }
        });

    }



}
