package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_first.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_first : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment_first.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment_first().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // find the toast_button by its ID and set a click listener
        view.findViewById<Button>(R.id.toast_button).setOnClickListener {
            // create a Toast with some text, to appear for a short time
            val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_LONG)
            // show the Toast
            myToast.show()
        }

        view.findViewById<Button>(R.id.count_button).setOnClickListener {
            countMe(view)

        }
        view.findViewById<Button>(R.id.random_button).setOnClickListener{
//            initNavController()
            val showCountTextView = view.findViewById<TextView>(R.id.textview)
            val currentCount = showCountTextView.text.toString().toInt()
            val action = Fragment_firstDirections.actionFragmentFirstToFragmentSecond(currentCount)
            findNavController().navigate(action)
        }


    }
    private fun countMe(view: View) {
        // Get the text view
        val showCountTextView = view.findViewById<TextView>(R.id.textview)

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count = countString.toInt()
        count++

        // Display the new value in the text view.
        showCountTextView.text = count.toString()
    }

//    fun initNavController() {
//        //获取mFragments成员变量
//        val mFragmentsField = FragmentActivity::class.java.getDeclaredField("mFragments").apply {
//            isAccessible = true
//        }
//        //获取mCreated成员变量
//        val mCreatedField = FragmentActivity::class.java.getDeclaredField("mCreated").apply {
//            isAccessible = true
//        }
//        //获取dispatchActivityCreated方法
//        val dispatchActivityCreatedMethod =
//            FragmentController::class.java.getDeclaredMethod("dispatchActivityCreated").apply {
//                isAccessible = true
//            }
//        //调用dispatchActivityCreated方法
//        dispatchActivityCreatedMethod.invoke(mFragmentsField.get(this))
//
//        //别忘了把mCreated设置为true，防止dispatchActivityCreated在onStart中再次调用
//        mCreatedField.set(this, true)
//    }
}

