package sim.coder.androidchallengeno8

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiLevel = Build.VERSION.SDK_INT
        //val versionRelease = Build.VERSION.RELEASE
        tv_Api.text = "API Level : $apiLevel"



    }
}
