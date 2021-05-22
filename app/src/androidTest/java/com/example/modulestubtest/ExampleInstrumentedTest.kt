package com.example.modulestubtest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.lib.CoroutineImpl
import com.example.lib.TestLib
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.modulestubtest", appContext.packageName)
    }

    @Test
    fun coroutineTest() {
        CoroutineImpl().coroutineRequest()
    }

    @Test
    fun addTest(){
        assertEquals(TestLib().add(1,2),3)
    }
}