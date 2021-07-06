package com.tarc.databindingbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tarc.databindingbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private var aPerson :Person = Person("Ali", "123456", "ali@gmail.com", "123 jalan abc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson
/*
        binding.name.text = aPerson.name
        binding.email.text = aPerson.ic
        binding.textView3.text = aPerson.email
        binding.address.text = aPerson.address

 */

        binding.btnUpdate.setOnClickListener(){
            aPerson.email= "bababa@gmail.com"

            binding.apply { invalidateAll() }
        }
    }
}