package com.github.watabee.fragmentpagerresumesample

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class PageFragment : Fragment(R.layout.fragment_page) {

    private val page by lazy(LazyThreadSafetyMode.NONE) { requireArguments().getInt(PAGE) }

    override fun onResume() {
        super.onResume()
        Toast.makeText(requireContext(), "No.$page fragment is resumed.", Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.page_no_text).text = page.toString()
    }

    companion object {
        private const val PAGE = "page"

        fun newInstance(page: Int): PageFragment = PageFragment().apply {
            arguments = bundleOf(PAGE to page)
        }
    }
}