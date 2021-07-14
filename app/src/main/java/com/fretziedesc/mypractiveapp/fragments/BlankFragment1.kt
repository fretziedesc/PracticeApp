package com.fretziedesc.mypractiveapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.fretziedesc.mypractiveapp.R
import com.fretziedesc.mypractiveapp.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
  private var _binding: FragmentBlank1Binding? = null
  private val binding get() = _binding!!

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

  }
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = FragmentBlank1Binding.inflate(inflater, container, false)
    val view = binding.root
    return view
  }
  
  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }



}