package app.netlify.dev_ali_hassan.masterkotlin.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.netlify.dev_ali_hassan.masterkotlin.R
import app.netlify.dev_ali_hassan.masterkotlin.data.AffirmationAdapter
import app.netlify.dev_ali_hassan.masterkotlin.data.MainViewModel
import com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_SHORT
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    companion object Ali {
        private const val TAG = "MainActivity"
    }
    lateinit var helloTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel = MainViewModel()
        val v: View = findViewById(R.id.rootView)
        mainViewModel.liveData.observe(this, { tapCount ->
            Log.d(TAG, "onCreate: onChanged: the tapCount is $tapCount")
            Snackbar.make(v, "ok, the value is $tapCount!", LENGTH_SHORT).show()
        })
        val recycler: RecyclerView = findViewById(R.id.affirmationRecycler)
        recycler.adapter = AffirmationAdapter(mainViewModel.dataSource.getAffirmatoinList())
        recycler.setHasFixedSize(true)
    }
}