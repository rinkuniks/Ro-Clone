package com.example.roverclone.ui.Home.ui.request

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.roverclone.databinding.FragmentMyRequestBinding

class MyRequestFragment : Fragment() {

  private var _binding: FragmentMyRequestBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val myRequestViewModel =
      ViewModelProvider(this)[MyRequestViewModel::class.java]

    _binding = FragmentMyRequestBinding.inflate(inflater, container, false)
    val root: View = binding.root
    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}