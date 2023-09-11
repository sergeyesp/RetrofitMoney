package com.example.retrofitmoney.data.repository

import com.example.retrofitmoney.data.api.RetrofitInstance
import com.example.retrofitmoney.model.beznal.Beznal
import com.example.retrofitmoney.model.beznal.BeznalItem
import com.example.retrofitmoney.model.nal.Nalichka
import com.example.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka> {
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal(): Response<Beznal> {
        return RetrofitInstance.api.getBeznalMoney()
    }
}