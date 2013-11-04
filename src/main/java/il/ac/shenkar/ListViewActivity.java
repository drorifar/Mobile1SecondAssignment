package il.ac.shenkar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class ListViewActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView) findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(this, image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails)o;
                Toast.makeText(ListViewActivity.this, "Description" + " " + obj_itemDetails.getDescription(), Toast.LENGTH_LONG).show();
            }
        });

    }

    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();


        ItemDetails item_details = new ItemDetails();
        item_details.setName("Name 1");
        item_details.setDescription("Desc 1");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 2");
        item_details.setDescription("Desc 2");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 3");
        item_details.setDescription("Desc 3");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 4");
        item_details.setDescription("Desc 4");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 5");
        item_details.setDescription("Desc 5");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 6");
        item_details.setDescription("Desc 6");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 7");
        item_details.setDescription("Desc 7");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 8");
        item_details.setDescription("Desc 8");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 9");
        item_details.setDescription("Desc 9");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 10");
        item_details.setDescription("Desc 10");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 11");
        item_details.setDescription("Desc 11");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 12");
        item_details.setDescription("Desc 12");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 13");
        item_details.setDescription("Desc 13");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 14");
        item_details.setDescription("Desc 14");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 15");
        item_details.setDescription("Desc 15");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 16");
        item_details.setDescription("Desc 16");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 17");
        item_details.setDescription("Desc 17");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 18");
        item_details.setDescription("Desc 18");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 19");
        item_details.setDescription("Desc 19");
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Name 20");
        item_details.setDescription("Desc 20");
        results.add(item_details);

        return results;
    }


    public void addNewItem(View view) {
        Intent intent = new Intent(this, AddItemActivity.class);
        //open a new window
        startActivity(intent);
    }

    public void  editTask(View view) {

    }
}
