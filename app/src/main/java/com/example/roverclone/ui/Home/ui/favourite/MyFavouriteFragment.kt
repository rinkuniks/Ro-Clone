package com.example.roverclone.ui.Home.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.roverclone.databinding.FragmentMyFavouriteBinding

class MyFavouriteFragment : Fragment() {

  private var _binding: FragmentMyFavouriteBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val myFavouriteViewModel =
      ViewModelProvider(this).get(MyFavouriteViewModel::class.java)

    _binding = FragmentMyFavouriteBinding.inflate(inflater, container, false)
    val root: View = binding.root

//    val textView: TextView = binding.textSlideshow
//    myFavouriteViewModel.text.observe(viewLifecycleOwner) {
//      textView.text = it
//    }
    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}