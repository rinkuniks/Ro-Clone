package com.example.roverclone.ui.Home.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.roverclone.R
import com.example.roverclone.databinding.FragmentHomeBinding
import com.example.roverclone.ui.Home.ConfirmationActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class HomeFragment : Fragment(), OnMapReadyCallback {

  private var _binding: FragmentHomeBinding? = null
  private lateinit var mMap: GoogleMap

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
      ViewModelProvider(this).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val mapFragment = this.childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
    mapFragment!!.getMapAsync(this)

//    val textView: TextView = binding.textHome
//    homeViewModel.text.observe(viewLifecycleOwner) {
//      textView.text = it
//    }

    binding.btnBookNow.setOnClickListener {
      val intent = Intent(requireActivity(), ConfirmationActivity::class.java)
      requireContext().startActivity(intent)
    }

    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

  override fun onMapReady(googleMap: GoogleMap) {
    mMap = googleMap

    // Add a marker in Sydney and move the camera
    val delhi = LatLng(28.7041, 77.1025)
    mMap.addMarker(
      MarkerOptions()
      .position(delhi)
      .title("Marker in Delhi"))
    mMap.moveCamera(CameraUpdateFactory.newLatLng(delhi))
  }
}