package com.example.businessconverter

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SalaryConverterContractActivity:AppCompatActivity() {
    // companion object to statyczny obiekt przechowujacy statyczne obiekty, zmienne, badz metody
    companion object {
        const val CONTRACT_KEY : String = "contract_key"
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
        val salaryBruttoValue : Int?= intentBundle?.getInt(CONTRACT_KEY)

        if(salaryBruttoValue != null) {
            umowaOPraceTextView.text = obliczenieUmowaOprace(salaryBruttoValue).toString()
            umowaOZlecenieTextView.text = obliczenieUmowaOZlecenie(salaryBruttoValue).toString()
        }

    }

    //stworz funkcje ktora przyjmuje Int jako argument i zwraca Int
    fun obliczenieUmowaOprace(kwotaBrutto : Int) : Int {
        return (kwotaBrutto * 0.7458).toInt()
    }

    fun obliczenieUmowaOZlecenie(kwotaBrutto:Int) :  Int{
        return (kwotaBrutto * 0.7458).toInt()
    }

}
