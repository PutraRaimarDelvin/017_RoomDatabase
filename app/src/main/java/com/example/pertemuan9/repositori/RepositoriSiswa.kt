package com.example.pertemuan9.repositori

import com.example.pertemuan9.room.SiswaDao
import com.example.pertemuan9.room.Siswa

import kotlinx.coroutines.flow.Flow

interface RepositorySiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositorySiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}