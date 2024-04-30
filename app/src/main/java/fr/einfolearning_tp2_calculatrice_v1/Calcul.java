package fr.einfolearning_tp2_calculatrice_v1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import fr.einfolearning_tp2_v1.R;

/**
 * Created by B. LEMAIRE on 2019.
 */

public class Calcul extends Activity {

    // Affichage du résultat du calcul
    private TextView tv_calcul;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // A compléter

        /**
         * Désérialisation des ressources
         */

        deserialiserRessources();

        /**
         * Mise en place de l'écouteur du bouton calculer
         */
        initConnection();
        Intent intent = getIntent() ;

        /**
         * Récupération de l'Intent qui a servi à lancer
         * cette activité
         */
        // A Compléter


        /**
         * Récupération des extras
         */

        // A compléter
        int number1 = intent.getIntExtra("NUMBER", 0);
        int number2 = intent.getIntExtra("NUMBER", 1);
        int operande = intent.getIntExtra("NUMBER", 2);

        /**
         * Calcul du résultat et affichage du résultat
         */

        // A compléter
        tv_calcul.setText(String.valueOf(number1));
    }


    /**
     * Désérialise les ressources
     */
    private void deserialiserRessources() {
        // A compléter
        this.tv_calcul = (TextView) this.tv_calcul;
    }

    /**
     * Mise en place des écouteurs
     */
    private void initConnection() {
        // A compléter
        Intent intent = getIntent() ;
    }

}
