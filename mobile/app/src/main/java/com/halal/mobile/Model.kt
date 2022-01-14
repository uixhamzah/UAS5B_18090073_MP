package com.halal.mobile

class Model (
    val webnovel: List<Data>
) {
    data class Data (val id:String?, val judul:String?, val penulis:String?)
}
