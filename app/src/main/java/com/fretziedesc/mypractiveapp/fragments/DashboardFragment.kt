package com.fretziedesc.mypractiveapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import com.fretziedesc.mypractiveapp.R
import com.fretziedesc.mypractiveapp.databinding.FragmentDashboardBinding

/**
 * created by Aybi 2021-Jul-14
 */
class DashboardFragment : Fragment() {
  private var _binding: FragmentDashboardBinding? = null
  private val binding get() = _binding!!

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }
  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = FragmentDashboardBinding.inflate(inflater, container, false)
    val view = binding.root
    return view
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    setActionBarToggle()
  }

  private fun setActionBarToggle() {
    val drawerLayout = binding.drawerDashboard
    val toolbar = setToolbar()
    val toggle = ActionBarDrawerToggle(
      requireActivity(),
      drawerLayout,
      toolbar,
      R.string.navigation_drawer_open,
      R.string.navigation_drawer_close
    )
    drawerLayout.addDrawerListener(toggle)
    toggle.syncState()
  }

  private fun setToolbar(): Toolbar {
    return binding.includeContentDashboard.toolbar.apply {
      inflateMenu(R.menu.dashboard)
      this.setOnMenuItemClickListener { item ->
        when (item.itemId) {
          R.id.action_search -> {
            println("Action Search")
            true
          }
          else -> super.onOptionsItemSelected(item)
        }
      }
    }
  }

}