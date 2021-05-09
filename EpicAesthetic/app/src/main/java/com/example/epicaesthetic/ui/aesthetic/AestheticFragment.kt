package com.example.epicaesthetic.ui.aesthetic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.epicaesthetic.databinding.FragmentAestheticBinding

class AestheticFragment : Fragment() {

    private lateinit var aestheticViewModel: AestheticViewModel
    private var _binding: FragmentAestheticBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aestheticViewModel =
            ViewModelProvider(this).get(AestheticViewModel::class.java)

        _binding = FragmentAestheticBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        aestheticViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}