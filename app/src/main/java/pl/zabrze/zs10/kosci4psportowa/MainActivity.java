package pl.zabrze.zs10.kosci4psportowa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewPunkty;
    Button buttonRzuc;
    ImageView imageView;
    //int[] tablicaLosowych = new int[5];
    ImageView[] tablicaObrazowKosci = new ImageView[5];
    Kosc[] kosci = new Kosc[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPunkty = findViewById(R.id.textViewPunkty);
        buttonRzuc = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        tablicaObrazowKosci[0] = findViewById(R.id.imageView);
        tablicaObrazowKosci[1] = findViewById(R.id.imageView2);
        tablicaObrazowKosci[2] = findViewById(R.id.imageView3);
        tablicaObrazowKosci[3] = findViewById(R.id.imageView4);
        tablicaObrazowKosci[4] = findViewById(R.id.imageView5);
       // int[] obrazy = {R.drawable.kosc1, R.drawable.kosc2,R.drawable.kosc3,
        //R.drawable.kosc4,R.drawable.kosc5,R.drawable.kosc6};
        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int suma =0;
                        for (int i = 0; i < kosci.length; i++) {
                            kosci[i] = new Kosc();
                            tablicaObrazowKosci[i].setImageResource(kosci[i].getIdObrazka());
                        }
                        /*for (int i = 0; i < tablicaLosowych.length; i++) {
                            tablicaLosowych[i] = (int)(Math.random()*6+1);
                            suma = suma + tablicaLosowych[i];
                            tablicaObrazowKosci[i].setImageResource(obrazy[tablicaLosowych[i]-1]);
                        }

                         */
                        Toast.makeText(MainActivity.this,
                                "Apka działa", Toast.LENGTH_SHORT).show();
                        textViewPunkty.setText(Integer.toString(suma));
                        textViewPunkty.setText(String.valueOf(suma));
                       // imageView.setImageResource(R.drawable.kosc6);
                    }
                }
        );
    }
}