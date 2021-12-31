package com.example.app41;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.app41.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, RatingBar.OnRatingBarChangeListener, RadioGroup.OnCheckedChangeListener {
    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.checkBox1.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox2.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox3.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox4.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox5.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox6.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox7.setOnCheckedChangeListener(MainActivity.this);
        binding.checkBox8 .setOnCheckedChangeListener(MainActivity.this);
        
        binding.seekBar.setOnSeekBarChangeListener(MainActivity.this);

        binding.ratingBar.setOnRatingBarChangeListener(MainActivity.this);

        binding.radioGroup.setOnCheckedChangeListener(MainActivity.this);




    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.checkBox1:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Boxing is checked", Toast.LENGTH_SHORT).show();
                }
                break;

                case R.id.checkBox2:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "KickBoxing is cheked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox3:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Judo is cheked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox4:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Audio is checked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox5:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Football is checked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox6:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "TackMando is checked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox7:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Wretsling us checked", Toast.LENGTH_SHORT).show();
                }
                break;
                case R.id.checkBox8:
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Swimming is checked", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        Toast.makeText(MainActivity.this, "The current of value of the seekbar is "+progress, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this, "Now the seek bar is started", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(MainActivity.this, "Now the seek bar is stopped", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

        Toast.makeText(MainActivity.this, "The value of stars are"+rating, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){
            case R.id.radioButton:
                Toast.makeText(MainActivity.this, "Android is checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this, "os is cheked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(MainActivity.this, "windows is checked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}