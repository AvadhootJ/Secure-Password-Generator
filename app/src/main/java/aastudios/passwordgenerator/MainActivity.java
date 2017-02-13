package aastudios.passwordgenerator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public static int numbergiver(int a) {
        int number = 0;

        switch (a) {

            //0-9
            case 1:
                number = 48 + (int) (Math.random() * (58 - 48));
                break;
            //A-Z
            case 2:
                number = 65 + (int) (Math.random() * (91 - 65));
                break;
            //a-z
            case 3:
                number = 97 + (int) (Math.random() * (123 - 97));
                break;
            //# $ % &
            case 4:
                number = 35 + (int) (Math.random() * (39 - 35));
                break;
        }
        return number;
    }

    Button LowButton;
    Button TwoButton;
    Button HighButton;
    int passwordLength = 1;
    int currentSize = 0;
    int magicchar = 1;
    char toadd;
    String finalpassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LowButton = (Button) findViewById(R.id.LowButton);
        TwoButton = (Button) findViewById(R.id.TwoButton);
        HighButton = (Button) findViewById(R.id.HighButton);


        LowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                while (passwordLength < 8) {
                    passwordLength = (int) (Math.random() * 12);
                }

                while (currentSize != passwordLength) {

                    magicchar = 1 + (int) (Math.random() * (3 - 1));
                    int x = numbergiver(magicchar);
                    toadd = (char) x;
                    finalpassword += toadd;
                    currentSize++;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Success!");
                builder.setMessage("Your password is: " + finalpassword);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                       // finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                passwordLength = 1;
                currentSize = 0;
                magicchar = 1;
                toadd = ' ';
                finalpassword = "";
            }
        });

        TwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (passwordLength < 8) {
                    passwordLength = (int) (Math.random() * 12);
                }

                while (currentSize != passwordLength) {

                    magicchar = 1 + (int) (Math.random() * (5 - 1));
                    int x = numbergiver(magicchar);
                    toadd = (char) x;
                    finalpassword += toadd;
                    currentSize++;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Success!");
                builder.setMessage("Your password is: " + finalpassword);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                        //finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                passwordLength = 1;
                currentSize = 0;
                magicchar = 1;
                toadd = ' ';
                finalpassword = "";
            }
        });
        HighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (passwordLength < 9) {
                    passwordLength = (int) (Math.random() * 14);
                }

                while (currentSize != passwordLength) {

                    magicchar = 1 + (int) (Math.random() * (5 - 1));
                    int x = numbergiver(magicchar);
                    toadd = (char) x;
                    finalpassword += toadd;
                    currentSize++;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Success!");
                builder.setMessage("Your password is: " + finalpassword);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                      //  finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                passwordLength = 1;
                currentSize = 0;
                magicchar = 1;
                toadd = ' ';
                finalpassword = "";
            }
        });
    }
}
