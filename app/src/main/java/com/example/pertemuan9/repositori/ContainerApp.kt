package com.example.pertemuan9.repositori

import android.app.Application
import android.content.Context
import com.example.pertemuan9.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositorySiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp {
    override val repositoriSiswa : RepositorySiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa. getDataBase(context).siswaDao())
    }
}

class AplikasiSiswa : Application(){
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}