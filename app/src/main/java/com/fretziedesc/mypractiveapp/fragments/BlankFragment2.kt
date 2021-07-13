package com.fretziedesc.mypractiveapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.fretziedesc.mypractiveapp.R
import com.fretziedesc.mypractiveapp.fragments.viewmodels.BlankFragment2ViewModel

class BlankFragment2 : Fragment() {

  companion object {
    fun newInstance() = BlankFragment2()
  }

  private lateinit var viewModel: BlankFragment2ViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val view = inflater.inflate(R.layout.blank_fragment2_fragment, container, false)
    view.findViewById<Button>(R.id.btnFrag1)?.setOnClickListener(
      Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_itemFragment, null)
    )
    return view
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProvider(this).get(BlankFragment2ViewModel::class.java)
    // TODO: Use the ViewModel
  }

}