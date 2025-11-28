package com.example.pertemuan9.repositori

interface RepositoriSiswa {
    fun getAllSiswaStream(); Flow<List<Siswa>>

    suspend fun insertSsiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao):
        RepositoriSiswa {
            override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
            override suspend fun insertSsiswa(siswa: Siswa) = siswaDao.insert(siswa)
    }
