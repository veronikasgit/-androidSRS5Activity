package com.company.activiti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Сижу за решеткой в темнице сырой.\n" +
                "Вскормленный в неволе орел молодой,")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG,"Мой грустный товарищ, махая крылом,\n" +
                "Кровавую пищу клюет под окном,")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG,"Клюет, и бросает, и смотрит в окно,\n" +
                "Как будто со мною задумал одно;")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,"Зовет меня взглядом и криком своим\n" +
                "И вымолвить хочет: «Давай улетим!")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG,"Мы вольные птицы; пора, брат, пора!\n" +
                "Туда, где за тучей белеет гора,")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG,"Туда, где синеют морские края,\n" +
                "Туда, где гуляем лишь ветер… да я!..»")
    }
}