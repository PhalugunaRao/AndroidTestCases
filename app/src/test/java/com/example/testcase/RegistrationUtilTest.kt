package com.example.testcase


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "Phalguna",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirm password return false`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "Carl",
            "123456",
            "abcde"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun ` less than 2 digit password return false`(){
        val result =RegistrationUtil.validateRegisterationInput(
            "Philipp",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}