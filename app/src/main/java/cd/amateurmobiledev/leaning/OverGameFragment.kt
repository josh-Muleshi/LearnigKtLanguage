package cd.amateurmobiledev.leaning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import cd.amateurmobiledev.leaning.databinding.FragmentOverGameBinding

class OverGameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentOverGameBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_over_game,container,false)
        return binding.root
    }
}