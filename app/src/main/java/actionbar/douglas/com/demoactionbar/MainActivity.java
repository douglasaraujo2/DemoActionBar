package actionbar.douglas.com.demoactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




        public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(this,"Item 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(this,"Item 2",Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(this,"Item 3",Toast.LENGTH_LONG).show();
                break;
            case R.id.item4:
                Toast.makeText(this,"Item 4",Toast.LENGTH_LONG).show();
                break;
        }


        return super.onOptionsItemSelected(item);

    }
}
