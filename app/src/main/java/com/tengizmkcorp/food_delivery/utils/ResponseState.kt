package com.tengizmkcorp.food_delivery.utils

sealed class ResponseState<T>{
    data class Success<T>(val items: T) : ResponseState<T>()
    data class Error<T>(val message: String?) : ResponseState<T>()
    class Loading<T>: ResponseState<T>()
    class Empty<T> : ResponseState<T>()

}