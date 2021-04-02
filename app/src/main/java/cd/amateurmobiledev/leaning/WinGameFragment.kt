package cd.amateurmobiledev.leaning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import cd.amateurmobiledev.leaning.databinding.FragmentWinGameBinding


class WinGameFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWinGameBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_win_game,container,false)

        binding.gomeWinbtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_winGameFragment_to_questionFragment)
            Toast.makeText(activity,"Replay", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}