package com.example.roverclone.ui.Home.ui.manageCard

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.roverclone.R

class ManageCardFragment : Fragment() {

  companion object {
    fun newInstance() = ManageCardFragment()
  }

  private lateinit var viewModel: ManageCardViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_manage_card, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProvider(this).get(ManageCardViewModel::class.java)
    // TODO: Use the ViewModel
  }

}