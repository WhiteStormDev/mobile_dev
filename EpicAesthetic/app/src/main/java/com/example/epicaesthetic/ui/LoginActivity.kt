package com.example.epicaesthetic.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.epicaesthetic.R
import com.example.epicaesthetic.databinding.ActivityLoginBinding
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener

class LoginActivity : AppCompatActivity(), TextWatcher, KeyboardVisibilityEventListener,
    View.OnClickListener {
    private lateinit var _binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        KeyboardVisibilityEvent.setEventListener(this, this)
        //_binding.loginButton.isEnabled = false
        _binding.loginEmailInput.addTextChangedListener(this)
        _binding.loginPasswordInput.addTextChangedListener(this)

        _binding.loginButton.setOnClickListener(this)
    }

    override fun onVisibilityChanged(isOpen: Boolean) {
        var scroll = _binding.scrollView;
        var signupText = _binding.loginSignupText;

        if (isOpen) {
            scroll.scrollTo(0, scroll.bottom)
            signupText.visibility = View.GONE
        }
        else {
            scroll.scrollTo(0, scroll.top)
            signupText.visibility = View.VISIBLE
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }

    override fun afterTextChanged(s: Editable?) {
        _binding.loginButton.isEnabled =
            _binding.loginEmailInput.text.toString().isNotEmpty() &&
            _binding.loginPasswordInput.tag.toString().isNotEmpty()
    }

    override fun onClick(v: View?) {
        Log.d("[LoginActivity]", "Login button clicked")
    }
}