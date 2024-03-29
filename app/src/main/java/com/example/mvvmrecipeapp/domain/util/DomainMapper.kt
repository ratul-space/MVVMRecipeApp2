package com.example.mvvmrecipeapp.domain.util

interface DomainMapper<T, DomainModel>{
    fun mapToDomainModel(model: T): DomainModel
    fun mapFromDomainModel(domainModel: DomainModel): T
}