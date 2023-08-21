package com.deni.hilhamsyah.cookhub.util

sealed class Resource<out T> {
    data class Loading<out T>(val data: T? = null) : Resource<T>()
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error<out T>(val throwable: Throwable, val data: T? = null) : Resource<T>()
}
