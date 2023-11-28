package com.example.tetrisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tetrisproject.databinding.ActivityResBinding

class ResActivity : AppCompatActivity() {

    val binding by lazy { ActivityResBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

         binding.tvRstitle.setText("회원 페이지 개발중")

        binding.button2.setOnClickListener{

            Toast.makeText(this@ResActivity,"로그인 페이지 입니다." , Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            //          var result = binding.etId.text
            //           binding.tvTitle.setText(result)
            startActivity(intent)
        }

    //  setContentView(R.layout.activity_res)

    }


}