package com.intellihealth.truemeds.presentation.callbacks

interface ViewPrescriptionCallback {
    fun onDeleteImage(imageId: Long)
    fun onViewPrescriptionClicked(position: Int, imageURL: String)
    fun onAddMoreClicked()
}