package com.intellihealth.truemeds.data.model.orderflow

data class AllPrescriptionByCustomerResponse(
    val CustomerRx: List<CustomerRxResponse?>?
) {
    data class CustomerRxResponse(
        val ActiveRx: List<ActiveRxResponse?>?,
        val patientId: Int?,
        val patientName: String?
    ) {
        data class ActiveRxResponse(
            val active: Boolean?,
            val createdOn: Long?,
            val ext: String?,
            val fileName: String?,
            val image: Any?,
            val imageId: Int?,
            val imagePath: String?,
            val modifiedOn: Long?,
            val orderId: Int?,
            val uid: Any?
        )
    }
}