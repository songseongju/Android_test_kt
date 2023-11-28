package com.example.tetrisproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tetrisproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.tvTitle.setText("송드로이드 시작")

        val intent = Intent(this, SubActivity::class.java)

        intent.putExtra("Data1", binding.tvTitle.toString())  // 아이디 값이라는 텍스트를 담은 뒤  Data1 로 잠금.
       // intent.putExtra("Data2", 2023)
        binding.btnGetTest.setOnClickListener{startActivity(intent)}
    }



//    // 전역 변수로 바인딩 객체 선언
//    private var mBinding: ActivityMainBinding? = null
//    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
//    private val binding get() = mBinding!!
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main) 기존 레이아웃 제거.
//
//        // 자동 생성된 뷰 바인딩 클래스에서의 inflate라는 메서드를 활용해서
//        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성.
//        mBinding = ActivityMainBinding.inflate(layoutInflater)
//
//        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
//        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시.
//        setContentView(binding.root)
//
//        // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능.
//        binding.tvTitle.setText("송드로이드 시작")
//        binding.btnGetTest.setOnClickListener{
//
//            val intent = Intent(this, SubActivity::class.java)
//            // 다음화면으로 이동하기 위한 인텐트 객체 생성
//            startActivity(intent)
//
////          // text에 입력되어 있는 값을 가지고와서 textview 뿌려줌.
////            var resultTest = binding.etId.text.toString()
////            binding.tvTitle.setText(resultTest)
////            // 입력된 값을 텍스트뷰에 set 해줌.
//        }
//    }
//    // 액티비티가 파괴될 때..
//    override fun onDestroy() {
//        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
//        mBinding = null
//        super.onDestroy()
//    }
}