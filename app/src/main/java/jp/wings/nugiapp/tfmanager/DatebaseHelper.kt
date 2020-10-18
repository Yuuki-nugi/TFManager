package jp.wings.nugiapp.tfmanager

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.lang.StringBuilder

class DatebaseHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "memo.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sb = StringBuilder()
        sb.append("CREATE TABLE memolist(")
        sb.append("_id INTEGER PRIMARY KEY,")
        sb.append("note TEXT,")
        sb.append(");")
        val sql = sb.toString()

        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}
