package com.example.businessconverter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class SalaryConverterContractActivity:AppCompatActivity() {
    // companion object to statyczny obiekt przechowujacy statyczne obiekty, zmienne, badz metody
    companion object {
        const val CONTRACT_KEY : String = "some key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salary_converter_contract)

        //odwolujemy sie do "paczki" ktora mogla byc przekazana do intencji uruchamiajcej nasza aktywnosc
        val intentBundle : Bundle? = intent.extras
        val salaryBruttoValue : String?= intentBundle?.getString(CONTRACT_KEY)

        Log.d("TEST","print value : $salaryBruttoValue")

    }

}
