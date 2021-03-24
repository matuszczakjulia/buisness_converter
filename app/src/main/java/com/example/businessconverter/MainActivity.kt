package com.example.businessconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // niezmienna zmienna
    // val someImmutableVariable : Int = 3
    // var someMutableVariable : Int = 3

    // kotlin wymusza defaultowo przypisanie wartosci do zmiennej
    // tutuaj jest to zmienna globalna
   lateinit var currencyConverterButton : Button

    // dostep do  findViewById(R.id.currencyConverterButton) mamy dopiero po wykonaniu funkcji onCreate()
    // funkcja findViewById() jest dostepna w wewnatrz obiektu Context, ktory jest tworzony dopiero po wykonaniu funkcji onCreate() wewnatrz aaktynowsci.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        currencyConverterButton = findViewById(R.id.currencyConverterButton)

        currencyConverterButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                // intent jest poleceniem dla systemu operacyjnego co ma wykonac, w tym przpyadku poleceniem jest stworzenie aktynowsci
                val intent = Intent(this@MainActivity,CurrencyConverterActivity::class.java) //
                // metoda start activity przyjmuje polecneiem ktore opisuje ktora aktywnosc ma system operacyjny uruchomic
                startActivity(intent)
            }
        })
    }

}

