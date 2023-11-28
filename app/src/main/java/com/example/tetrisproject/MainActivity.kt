package com.example.tetrisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tetrisproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.tvTitle.setText("송드로이드 시작")

        // Login 버튼
        binding.btnGetTest.setOnClickListener{

            // 토스트 메세지 설정
            Toast.makeText(this@MainActivity,"로그인 성공 메인화면 입니다." , Toast.LENGTH_SHORT).show()


            val intent = Intent(this, SubActivity::class.java)

  //          var result = binding.etId.text
 //           binding.tvTitle.setText(result)

            intent.putExtra("msg",binding.tvTitle.text)  // 아이디 값이라는 텍스트를 담은 뒤 msg 잠금

            startActivity(intent)

        }

        // 회원가입 버튼
        binding.btnRegister.setOnClickListener{
            // 토스트 메세지 설정
            Toast.makeText(this@MainActivity,"회원가입 페이지 입니다." , Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ResActivity::class.java)
            //          var result = binding.etId.text
            //           binding.tvTitle.setText(result)
            startActivity(intent)

        }

    }
}