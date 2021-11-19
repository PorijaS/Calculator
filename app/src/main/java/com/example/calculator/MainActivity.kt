package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding
import android.util.Log
import android.view.Display

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    //All button click events

    fun zeroButtonClicked(view: View) {
        Log.d("TAG", "zeroButtonClicked: ")
    }

    fun oneButtonClicked(view: View) {
        Log.d("TAG", "oneButtonClicked: ")
    }

    fun twoButtonClicked(view: View) {
        Log.d("TAG", "twoButtonClicked: ")
    }

    fun threeButtonClicked(view: View) {
        Log.d("TAG", "threeButtonClicked: ")
    }

    fun fourButtonClicked(view: View) {
        Log.d("TAG", "fourButtonClicked: ")
    }

    fun fiveButtonClicked(view: View) {
        Log.d("TAG", "fiveButtonClicked: ")
    }

    fun sixButtonClicked(view: View) {
        Log.d("TAG", "sixButtonClicked: ")
    }

    fun sevenButtonClicked(view: View) {
        Log.d("TAG", "sevenButtonClicked: ")
    }

    fun eightButtonClicked(view: View) {
        Log.d("TAG", "eightButtonClicked: ")
    }

    fun nineButtonClicked(view: View) {
        Log.d("TAG", "nineButtonClicked: ")
    }

    fun multiplyButtonClicked(view: View) {

    }

    fun divideButtonClicked(view: View) {

    }

    fun subtractButtonClicked(view: View) {

    }

    fun addButtonClicked(view: View) {

    }

    fun clearButtonClicked(view: View) {

    }

    fun parButtonClicked(view: View) {

    }

    fun expButtonClicked(view: View) {

    }

    fun plusMinusButtonClicked(view: View) {

    }

    fun decimalButtonClicked(view: View) {

    }

    fun equalButtonClicked(view: View) {

    }

    fun backspaceButtonClicked(view: View) {

    }


}