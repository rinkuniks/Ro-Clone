package com.example.roverclone.ui.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import com.example.roverclone.R
import com.example.roverclone.databinding.ActivityConfirmationBinding
import com.example.roverclone.databinding.ActivityHomeBinding
import com.example.roverclone.databinding.FragmentHomeBinding

class ConfirmationActivity : AppCompatActivity() {

  private var _binding: ActivityConfirmationBinding? = null
  private val paymentList = listOf<String>("Credit Card", "Debit Card", "Cash")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    _binding = ActivityConfirmationBinding.inflate(layoutInflater)
    setContentView(_binding!!.root)

    //Select Payment Mode
    val paymentSelected : AutoCompleteTextView = _binding!!.selectPayment
    val myAdapter = ArrayAdapter(this, R.layout.payment_list, paymentList)
    paymentSelected.setAdapter(myAdapter)
    paymentSelected.onItemClickListener = AdapterView
      .OnItemClickListener { adapterView, view, i, l ->
        val itemSelected = adapterView.getItemAtPosition(i)
        Toast.makeText(this, "$itemSelected Selected", Toast.LENGTH_SHORT).show()
    }
  }
}