package com.example.businessconverter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class SalaryConverterContractActivity:AppCompatActivity() {
    // companion object to statyczny obiekt przechowujacy statyczne obiekty, zmienne, badz metody
    companion object {
        const val CONTRACT_KEY : String = "contract_key" //
    }

    lateinit var umowaOPraceTextView : TextView
    lateinit var umowaOZlecenieTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_contract)

        umowaOPraceTextView = findViewById(R.id.umowaOPraceWartosc)
        umowaOZlecenieTextView = findViewById(R.id.umowaOZlecenieWartosc)

        //odwolujemy sie do "paczki" ktora mogla byc przekazana do intencji uruchamiajcej nasza aktywnosc
        val intentBundle : Bundle? = intent.extras
        val salaryBruttoValue : Long?= intentBundle?.getLong(CONTRACT_KEY)

        if(salaryBruttoValue != null) {
            umowaOPraceTextView.text = obliczenieUmowaOprace(salaryBruttoValue).toString() + " PLN"
            umowaOZlecenieTextView.text = obliczenieUmowaOZlecenie(salaryBruttoValue).toString() + " PLN"
        }

    }

    //stworz funkcje ktora przyjmuje Int jako argument i zwraca Int
    fun obliczenieUmowaOprace(kwotaBrutto : Long) : Long {
        return (kwotaBrutto * 0.7458).toLong()
    }

    fun obliczenieUmowaOZlecenie(kwotaBrutto:Long) :  Long{
        return (kwotaBrutto * 0.7458).toLong()
    }

}
