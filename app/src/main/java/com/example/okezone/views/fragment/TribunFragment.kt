package com.example.okezone.views.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.okezone.R
import com.example.okezone.databinding.FragmentRepublikaBinding
import com.example.okezone.databinding.FragmentTribunBinding


class TribunFragment : Fragment() {
    private var _binding: FragmentTribunBinding? = null
    private lateinit var antara: WebView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTribunBinding.inflate(inflater, container, false)
        val root: View = binding.root

        antara = root.findViewById(R.id.tribunWeb)
        antara.webViewClient = WebViewClient()
        antara.apply {
            loadUrl("https://www.tribunnews.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}