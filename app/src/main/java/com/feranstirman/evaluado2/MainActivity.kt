package com.feranstirman.evaluado2

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.feranstirman.evaluado2.fragmentos.fragmentBoton
import com.feranstirman.evaluado2.fragmentos.MainContentFragment

class MainActivity : AppCompatActivity(), fragmentBoton.SearchNewListener{



    //private lateinit var mainFragment: MainListFragment
    //private lateinit var mainContentFragment: MainContentFragment

    private lateinit var mainBotonesFragment: fragmentBoton
    private lateinit var mainImageFragment: MainContentFragment
    private var listaImagenes: ArrayList<String> = ArrayList()

    private var contador= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llenarListImagenes()
        iniciarFragmento()
    }

    private fun iniciarFragmento(){
     //   val recurso= R.id.portraitMain
        mainBotonesFragment= fragmentBoton.newInstance()
        changeFragment(R.id.botonesFragment, mainBotonesFragment)
        mainImageFragment= MainContentFragment.newInstance(listaImagenes[0])
        changeFragment(R.id.imagenFragment, mainImageFragment)
    }

    private fun changeFragment(id: Int, frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, frag).commit()
    }

    override fun clickSiguiente() {

    }

    override fun clickAtras() {

    }

    private fun llenarListImagenes(){

    }




}

