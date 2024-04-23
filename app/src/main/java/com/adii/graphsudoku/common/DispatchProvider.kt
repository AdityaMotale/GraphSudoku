package com.adii.graphsudoku.common

import kotlin.coroutines.CoroutineContext

interface DispatchProvider {
    fun provideUIContext(): CoroutineContext
    fun provideIOContext(): CoroutineContext
}