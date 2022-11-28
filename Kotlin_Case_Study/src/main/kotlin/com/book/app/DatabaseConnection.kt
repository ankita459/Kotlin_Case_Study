package com.book.app

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {

    fun connect(): Connection {
        val databaseURL ="jdbc:mysql://localhost:3307/kotlincasestudy"
        val connection= DriverManager.getConnection(databaseURL,"root","2018HC0134")
        return connection
    }
}