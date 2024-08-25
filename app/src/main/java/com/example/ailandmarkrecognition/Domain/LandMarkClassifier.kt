package com.example.ailandmarkrecognition.Domain

import android.graphics.Bitmap

interface LandMarkClassifier {
    fun classify(bitmap: Bitmap, rotationDegrees: Int): List<Classification>
}