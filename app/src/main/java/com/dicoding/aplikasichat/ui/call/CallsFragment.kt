package com.dicoding.aplikasichat.ui.call

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.aplikasichat.databinding.FragmentCallBinding

class CallsFragment : Fragment() {

    private var _binding: FragmentCallBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val chatsViewModel =
            ViewModelProvider(this).get(CallsViewModel::class.java)

        _binding = FragmentCallBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCalls
        chatsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}