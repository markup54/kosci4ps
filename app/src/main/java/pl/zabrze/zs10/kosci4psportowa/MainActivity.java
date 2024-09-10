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
        for (int i = 0; i < kosci.length; i++) {
            kosci[i] = new Kosc();
        }
        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int suma =0;
                        for (int i = 0; i < kosci.length; i++) {
                            kosci[i].wylosujKosc();
                            tablicaObrazowKosci[i].setImageResource(kosci[i].getIdObrazka());
                            suma = suma +kosci[i].getWartosc();
                        }


                       // textViewPunkty.setText(Integer.toString(suma));
                        textViewPunkty.setText(String.valueOf(suma));
                       // imageView.setImageResource(R.drawable.kosc6);
                    }
                }
        );

        for (int i = 0; i < tablicaObrazowKosci.length; i++) {
            final int ind = i;
            tablicaObrazowKosci[i].setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            kosci[ind].blokujodblokuj();
                            if(kosci[ind].isZablokowana())
                            tablicaObrazowKosci[ind].setAlpha(0.5f);
                            else
                            {
                                tablicaObrazowKosci[ind].setAlpha(1f);
                            }
                        }
                    }
            );
        }

    }
}