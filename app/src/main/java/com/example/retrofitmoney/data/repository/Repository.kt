package com.example.retrofitmoney.data.repository

import com.example.retrofitmoney.data.api.RetrofitInstance
import com.example.retrofitmoney.model.beznal.BeznalItem
import com.example.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalichkaItem> {
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<BeznalItem> {
        return RetrofitInstance.api.getBeznalMoney()
    }
}