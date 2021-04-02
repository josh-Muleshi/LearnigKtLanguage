package cd.amateurmobiledev.leaning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import cd.amateurmobiledev.leaning.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentQuestionBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_question,container,false)

        binding.WinBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_winGameFragment)
            Toast.makeText(activity,"You Win", LENGTH_SHORT).show()
        }

        binding.LooseBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_questionFragment_to_overGameFragment)
            val looseToast = Toast.makeText(activity, "You Loose",LENGTH_SHORT)
                looseToast.show()
        }

        return binding.root
    }
}