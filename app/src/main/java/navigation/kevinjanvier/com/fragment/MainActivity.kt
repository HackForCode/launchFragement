package navigation.kevinjanvier.com.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById(R.id.button)

        button.setOnClickListener {
            val fragment = LaunchFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.activity_fagment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }



}
