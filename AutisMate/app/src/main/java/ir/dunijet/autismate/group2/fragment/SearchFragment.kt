package ir.dunijet.autismate.group2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.dunijet.autismate.databinding.Group2FragmentSearchBinding

class SearchFragment :Fragment() {
    private lateinit var binding :Group2FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Group2FragmentSearchBinding.inflate(layoutInflater)
        return binding.root
    }
}