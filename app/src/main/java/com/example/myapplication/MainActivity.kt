package com.example.myapplication

import android.os.Bundle
import android.view.KeyEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // XML 화면 요소와 연결할 변수
    private lateinit var arrowText: TextView
    private lateinit var distanceText: TextView
    private lateinit var instructionText: TextView
    private lateinit var statusText: TextView

    // 화면에 표시할 상태
    private var remainingDistance: Int = 100
    private var direction: String = "STRAIGHT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrowText = findViewById(R.id.arrowText)
        distanceText = findViewById(R.id.distanceText)
        instructionText = findViewById(R.id.instructionText)
        statusText = findViewById(R.id.statusText)

        updateScreen()
    }

    // 현재 상태를 화면에 반영
    private fun updateScreen() {
        distanceText.text = "${remainingDistance} m"

        if (remainingDistance == 0) {
            arrowText.text = "●"
            instructionText.text = "목적지에 도착했습니다"
            statusText.text = "탭하면 다시 시작합니다"
            return
        }

        val directionName = when (direction) {
            "LEFT" -> "좌회전"
            "RIGHT" -> "우회전"
            else -> "직진"
        }

        arrowText.text = when (direction) {
            "LEFT" -> "←"
            "RIGHT" -> "→"
            else -> "↑"
        }

        instructionText.text = if (remainingDistance <= 30) {
            "잠시 후 $directionName"
        } else {
            "${remainingDistance}m 앞에서 $directionName"
        }

        statusText.text = "좌우: 거리 조절 / 상하: 방향\n탭: 초기화"
    }

    // 초기 상태 복원
    private fun resetNavigation() {
        remainingDistance = 100
        direction = "STRAIGHT"
        updateScreen()
    }

    // Blade 2 터치패드 입력 처리
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                remainingDistance = (remainingDistance - 10).coerceAtLeast(0)
            }

            KeyEvent.KEYCODE_DPAD_LEFT -> {
                remainingDistance = (remainingDistance + 10).coerceAtMost(1000)
            }

            KeyEvent.KEYCODE_DPAD_UP -> {
                direction = "LEFT"
            }

            KeyEvent.KEYCODE_DPAD_DOWN -> {
                direction = "RIGHT"
            }

            KeyEvent.KEYCODE_ENTER,
            KeyEvent.KEYCODE_DPAD_CENTER -> {
                resetNavigation()
                return true
            }

            else -> return super.onKeyDown(keyCode, event)
        }

        updateScreen()
        return true
    }
}