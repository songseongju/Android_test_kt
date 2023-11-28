package com.example.tetrisproject


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tetrisproject.databinding.ActivityMainBinding
import com.example.tetrisproject.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    val binding by lazy{ ActivitySubBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(binding.root)


       if(intent.hasExtra("msg"))
       {

       binding.tvGetmsg1.text = intent.getStringExtra("msg")

        }
    }


// 전역 변수로 바인딩 객체 선언
//    private var mBinding: ActivityMainBinding? = null
//    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
//    private val binding get() = mBinding!!
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        mBinding = ActivityMainBinding.inflate(layoutInflater)
//
//        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
//        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시.
//        setContentView(binding.root)
//
//        binding.btnGetTest.setOnClickListener{
//
//            val intent = Intent(this, SubActivity::class.java)
//
//            startActivity(intent)
//
//        }
//        // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능.
//        // 버튼클릭을 실행했을때 ? 리스너 기능 을 추가를 안시켜서 활성화가안되는데
//        // 지금 내가 바인딩 을 잘못경로?지정을? 잘못한건지는 확인을 해봐야하는데.
//        // 지금 메인화면으로 나오기는하는데 기능동작은 안됨 한마디로 xml 메인화면 경로가 잘못됐다는건데
//        // 요걸 뜯어고쳐서 바인딩을 제대로된 xml 주소값을 입력을해서 저 activity_sub.xml 을 띄어야 내가 다음
//        // 작업을 수월하게 할 수 있음.
//    }
//
//    // 액티비티가 파괴될 때..
//    override fun onDestroy() {
//        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
//        mBinding = null
//        super.onDestroy()
//    }
}