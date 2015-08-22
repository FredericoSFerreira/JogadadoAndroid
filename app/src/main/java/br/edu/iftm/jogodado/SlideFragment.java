package br.edu.iftm.jogodado;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SlideFragment extends Fragment {
    public static final String EXTRA_POSITION = "EXTRA_POSITION";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.slide_page, container, false);

        int position = getArguments().getInt(EXTRA_POSITION);

        //Seto o texto
        TextView txt = (TextView) rootView.findViewById(R.id.textView);

        //Seto a imagem
        ImageView img = (ImageView) rootView.findViewById(R.id.imageView);


       //gerar randomico
        Random numeros = new Random();
        int n = numeros.nextInt(6) + 1; //Para não cair no zero

        if (n == 1) {
            img.setImageResource(R.drawable.dado1);

        } else if (n == 2) {
            img.setImageResource(R.drawable.dado2);

        } else if (n == 3) {
            img.setImageResource(R.drawable.dado3);

        } else if (n == 4) {
            img.setImageResource(R.drawable.dado4);

        } else if (n == 5) {
            img.setImageResource(R.drawable.dado5);

        } else if (n == 6) {
            img.setImageResource(R.drawable.dado6);

        }

        txt.setText("O Dado caiu na posição " + n);



/*

        if (position ==0){
            txt.setText("Deslize  para o lado");

        }else{

            txt.setText("Este e o Slide " + position);
        }
*/
        /**setando a cor randômica
         Random rnd = new Random();
         int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
         rootView.setBackgroundColor(color); //seto a cor
         */
        return rootView;

    }
}
