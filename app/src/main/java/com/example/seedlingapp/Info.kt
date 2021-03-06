package com.example.seedlingapp

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.PersistableBundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.*
import com.mancj.materialsearchbar.MaterialSearchBar
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Use the [Info.newInstance] factory method to
 * create an instance of this fragment.
 */
class Info : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_info)
        val lv = findViewById(R.id.mListView) as ListView
        val searchBar = findViewById(R.id.searchBar) as MaterialSearchBar
        searchBar.setHint("Search...")
        searchBar.setSpeechMode(true)

        var borough = arrayOf("Camden","Kensington and Chelsea","Hammersmith and Fulham")
        val adapter = ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, borough)
        lv.setAdapter(adapter)

        searchBar.addTextChangeListener(object: TextWatcher {
            override fun beforeTextChanged(charSequence : CharSequence,i: Int, i1:Int, i2:Int){

            }
            override fun onTextChanged(charSequence : CharSequence,i: Int, i1:Int, i2:Int){
                adapter.getFilter().filter(charSequence)

            }
            override fun afterTextChanged(editable: Editable){

            }

        })

        lv.setOnItemClickListener(object: AdapterView.OnItemClickListener{
            override fun onItemClick(adapterView: AdapterView<*>?,
                view: View,
                i: Int,
                l: Long){
                Toast.makeText(this@Info, adapter.getItem(i)!!.toString(),Toast.LENGTH_SHORT).show()
            }

        })
    }
}
