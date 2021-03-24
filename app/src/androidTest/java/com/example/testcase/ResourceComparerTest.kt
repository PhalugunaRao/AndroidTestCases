package com.example.testcase

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{
    private lateinit var resourceCompare:ResourceComparer


    @Before
    fun setup(){
        resourceCompare= ResourceComparer()
    }
    @After
    fun teardown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        //resourceCompare= ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result =resourceCompare.isEqual(context,R.string.app_name,"TestCase")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsFalse(){
       // resourceCompare=ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result =resourceCompare.isEqual(context,R.string.app_name,"Test")
        assertThat(result).isFalse()
    }
}