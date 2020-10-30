package com.example.lab6menufragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import kotlinx.android.synthetic.main.fragment_one.view.*

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.btnClickFragOne.setOnClickListener {

            var fragment =  Fragment()
            fragment = Twofragment()
            replaceFragment(fragment)
        }
        return view
    }

    private fun replaceFragment(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}