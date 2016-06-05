package app.com.example.acer.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
float a,b;
    int flagadd=0,flagdif=0,flagmul=0,flagdiv=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttondec=(Button)findViewById(R.id.buttondec);
        Button button1= (Button)findViewById(R.id.button);
        Button button2= (Button)findViewById(R.id.button2);
        Button button3= (Button)findViewById(R.id.button3);
        Button button4= (Button)findViewById(R.id.button4);
        Button button5= (Button)findViewById(R.id.button5);
        Button button6= (Button)findViewById(R.id.button6);
        Button button7= (Button)findViewById(R.id.button7);
        Button button8= (Button)findViewById(R.id.button8);
        Button button9= (Button)findViewById(R.id.button9);
        Button button10=(Button)findViewById(R.id.button10);
        Button buttonadd=(Button)findViewById(R.id.buttonadd);
        Button buttondif=(Button)findViewById(R.id.buttondif);
        Button buttonmul=(Button)findViewById(R.id.buttonmul);
        Button buttondiv=(Button)findViewById(R.id.buttondiv);
        Button buttonequal=(Button)findViewById(R.id.buttonequal);

        final EditText editText= (EditText)findViewById(R.id.editText);


        buttondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+".");
            }

        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"1");
            }

        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"2");
            }

        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"3");
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"4");
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"5");
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"6");
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"7");
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"8");
            }

        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"9");
            }

        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                editText.setText(editText.getText()+"0");
            }

        });


        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

               a = Float.parseFloat(editText.getText()+"");

                editText.setText(editText.getText()+"");


                flagadd=1;
                editText.setText(null);
            }

        });
        buttondif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                a = Float.parseFloat(editText.getText()+"");


                editText.setText(editText.getText()+"");
                flagdif=1;
                editText.setText(null);
            }

        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                a = Float.parseFloat(editText.getText()+"");

                editText.setText(editText.getText()+"");
                flagmul=1;
                editText.setText(null);
            }

        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                a = Float.parseFloat(editText.getText()+"");

                editText.setText(editText.getText()+"");
                flagdiv=1;
                editText.setText(null);
            }

        });


        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                b = Float.parseFloat(editText.getText() + "");

                if (flagadd == 1)
                    editText.setText(a + b + "");
                if (flagdif == 1)
                    editText.setText(a - b + "");
                if (flagmul == 1)
                    editText.setText(a * b + "");
                if (flagdiv == 1)
                    editText.setText(a / b + "");
            }
        } );


    }
}
