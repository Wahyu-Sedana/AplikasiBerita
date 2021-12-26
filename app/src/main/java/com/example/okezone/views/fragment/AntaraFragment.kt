package com.example.okezone.views.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.okezone.R
import com.example.okezone.databinding.FragmentAntaraBinding


class AntaraFragment : Fragment() {
    private var _binding: FragmentAntaraBinding? = null
    private lateinit var antara: WebView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAntaraBinding.inflate(inflater, container, false)
        val root: View = binding.root

        antara = root.findViewById(R.id.antaraWeb)
        antara.webViewClient = WebViewClient()
        antara.apply {
            loadUrl("https://www.antaranews.com/")
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