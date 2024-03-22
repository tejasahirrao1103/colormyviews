package com.tejraj.colormyviews
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.tejraj.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var viwList: List<View>
    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setListner()
    }
    fun setListner()
    {
        viwList = listOf(
            binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
            binding.boxFourText, binding.boxFiveText, binding.ContraintLayout,
            binding.greenButton, binding.orangeButton, binding.resetButton

        )

        for (item in viwList)
        {
            item.setOnClickListener {changeColor(it)}
        }

    }


    fun changeColor(view: View)
    {
        when(view){
            binding.boxOneText ->  view.setBackgroundResource(R.color.blue)
            binding.boxTwoText -> view.setBackgroundResource(R.color.red)
            binding.boxThreeText -> view.setBackgroundResource(R.color.yellow)
            binding.boxFourText-> view.setBackgroundResource(R.color.purpler)
            binding.boxFiveText -> view.setBackgroundResource(R.color.chololate)
            binding.greenButton -> {
                binding.boxOneText.setBackgroundResource(R.color.green)
                binding.boxTwoText.setBackgroundResource(R.color.green)
                binding.boxThreeText.setBackgroundResource(R.color.green)
                binding.boxFourText.setBackgroundResource(R.color.green)
                binding.boxFiveText.setBackgroundResource(R.color.green)
            }
            binding.orangeButton -> {
                binding.boxOneText.setBackgroundResource(R.color.orange)
                binding.boxTwoText.setBackgroundResource(R.color.orange)
                binding.boxThreeText.setBackgroundResource(R.color.orange)
                binding.boxFourText.setBackgroundResource(R.color.orange)
                binding.boxFiveText.setBackgroundResource(R.color.orange)
            }
            binding.resetButton -> {
                binding.boxOneText.setBackgroundResource(R.color.whiteBox)
                binding.boxTwoText.setBackgroundResource(R.color.whiteBox)
                binding.boxThreeText.setBackgroundResource(R.color.whiteBox)
                binding.boxFourText.setBackgroundResource(R.color.whiteBox)
                binding.boxFiveText.setBackgroundResource(R.color.whiteBox)
                binding.ContraintLayout.setBackgroundResource(R.color.white)
            }

            else -> view.setBackgroundResource(R.color.black)
        }
    }
}