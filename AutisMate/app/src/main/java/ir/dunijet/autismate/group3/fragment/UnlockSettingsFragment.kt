package ir.dunijet.autismate.group3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.dunijet.autismate.databinding.Group3FragmentUnlockSettingsBinding

class UnlockSettingsFragment :Fragment() {
    private lateinit var binding: Group3FragmentUnlockSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Group3FragmentUnlockSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

}