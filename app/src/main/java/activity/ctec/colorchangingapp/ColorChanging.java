// the package of the class
package activity.ctec.colorchangingapp;

//import section
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;




public class ColorChanging extends AppCompatActivity
{
    /**
     * @Author Jake Anderson
     * @version 1.1
     * App that changes the background color when clicked
     */
    // declaration section
    private Button colorChangeButton;
    private TextView basicText;
    private RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_changing);

        //initialize
        background = (RelativeLayout) findViewById(R.id.BackgroundColor);
        basicText = (TextView) findViewById(R.id.SillyText);
        colorChangeButton = (Button) findViewById(R.id.sillyButton);

        // setupListeners are private
        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_changing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeBackgroundColor()
    {
        //local variables to get a random value from 0-225
        //variables for the backgrounds color
      int redColor;
        int greenColor;
          int blueColor;

        // variables for the buttons color
        int redColor2;
        int greenColor2;
        int blueColor2;

        //gives the value 0-255
      redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random()* 256);

        // gives background color using the RGB system.
        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        //gives the value 0-255
        redColor2 = (int) (Math.random()* 256);
        greenColor2 =(int) (Math.random()* 256);
        blueColor2 = (int) (Math.random()* 256);
// gives the button a color using the RGB system.
        colorChangeButton.setBackgroundColor(Color.rgb(redColor2, greenColor2, blueColor2));

    }


    // this sets up the setupListeners
    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View buttonView)
           {
               //this is where the action happens
               changeBackgroundColor();//the method called when the button is clicked.
           }
        });
    }


}
