package com.fery.recyclerview

import android.provider.ContactsContract.CommonDataKinds.Email

class User {
    var id :String?=null
    var name: String?=null
    var email: String?=null
    var sub: String?=null
    var birthdate: String?=null

    constructor(){}
    constructor(name: String?, email: String?,sub:String?,birthdate:String?){
        this.id = id
        this.name = name
        this.email = email
        this.sub =sub
        this.birthdate = birthdate

    }
}